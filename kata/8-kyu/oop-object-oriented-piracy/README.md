# [OOP: Object Oriented Piracy](https://www.codewars.com/kata/oop-object-oriented-piracy "https://www.codewars.com/kata/54fe05c4762e2e3047000add")

Ahoy matey!

You are a leader of a small pirate crew. And you have a plan.
With the help of OOP you wish to make a pretty efficient system to identify ships with heavy booty
on board!

Unfortunately for you, people weigh a lot these days, so how do you know if a ship is full of gold
and not people?

You begin with writing a generic Ship class / struct:

```
public class Ship {
  private final double draft;
  private final int crew;

  public Ship(double draft, int crew) {
    this.draft = draft;
    this.crew = crew;
  }
} 
```

Every time your spies see a new ship enter the dock, they will create a new ship object based on
their observations:

* draft - an estimate of the ship's weight based on how low it is in the water
* crew - the count of crew on board

```
Ship titanic = new Ship(15, 10);
```

## Task

You have access to the ship "draft" and "crew". "Draft" is the total ship weight and "crew" is the
number of humans on the ship.

Each crew member adds `1.5` units to the ship draft. If after removing the weight of the crew, the
draft is still more than `20`, then the ship is worth looting. Any ship weighing that much must have
a lot of booty!

Add the method

```
isWorthIt
```

to decide if the ship is worthy to loot. For example:

```
titanic.isWorthIt() == false
```