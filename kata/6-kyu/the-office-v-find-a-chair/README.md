# [The Office V - Find a Chair](https://www.codewars.com/kata/the-office-v-find-a-chair "https://www.codewars.com/kata/57f6051c3ff02f3b7300008b")

So you've found a meeting room - phew! You arrive there ready to present, and find that someone has taken one or more of the chairs!! You need to find some quick.... check all the other meeting rooms to see if all of the chairs are in use.

Your meeting room can take up to 8 chairs. `need` will tell you how many have been taken. You need to find that many.

Find the spare chairs from the array of meeting rooms.
```
public class Room {
  public final String occupants;  // number of occupants, each occupant is represented by 'X'
  public final int chairs;        // number of chairs in the room
}
```

You should return an array of integers that shows how many chairs you take from each room in order, up until you have the required amount.

example:
`[Room("XXX", 3), Room("XXXXX", 6), Room("XXXXXX", 9), Room("XXX",2)]` when you need 4 chairs:

result -- > `[0, 1, 3]` (no chairs free in room 0, take 1 from room 1, take 3 from room 2. No need to consider room 4 as you have your 4 chairs already.

If you need no chairs, return `'Game On'`. If there aren't enough spare chairs available, return `'Not enough!'`