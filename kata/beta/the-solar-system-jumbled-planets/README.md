# [The Solar System - Jumbled Planets](https://www.codewars.com/kata/the-solar-system-jumbled-planets "https://www.codewars.com/kata/678e32f27625ec1b6a0e5976")

Oh no! The celestial bodies orbiting the sun are all jumbled up!
<h2>TASK</h2>
Given the entire Solar System in the form of a list. Return a new list which has either <code>'<'</code>, <code>'>'</code> or <code>'='</code> depending on whether the planet is smaller than the planet on its left or not. You have to start compairing from the second item, because the first has nothing on its left.

However, there are also asteriods in the Solar System. All asteroids are smaller than all the planets. If two asteroids are found beside each other, the leftmost one will depend on the celestial being on the left of it. The one on the right will have `'='`.

The Solar System might be empty.

The celestial bodies stand in the order (size ascending):

 ```Asteroid < Pluto < Mercury < Mars < Venus < Earth < Neptune < Uranus < Saturn < Jupiter```

<b>Important: the dwarf planet Pluto is also included in the Solar System</b>

<h2>EXAMPLES<h2/>

```
["Mars", "Asteroid", "Venus", "Jupiter", "Asteroid", "Earth", "Pluto"] -> ['<', '>', '>', '<', '>', '<']
# Asteriod is '<' Mars
# Venus is '>' any Asteroid
# Jupiter is '>' Venus
# Any Asteroid is '<' Jupiter
# Earth is '>' the Asteroid
# Finally, Pluto, being a dwarf planet, is '<' Earth

["Asteroid", "Asteroid", "Asteroid", "Earth", "Jupiter"] -> ['>', '<', '=', '=', '>', '>']
# Here, the Asteroid is '=' to the Asteroid on its left
# Again, it is '=' because there is another Asteroid on its left
# Earth is '>' than the Asteroid
# Finally, Jupiter, being the king of the planets, is '>' than Earth

["Mercury", "Venus", "Earth", "Mars", "Asteroid", "Jupiter", "Saturn", "Uranus", "Neptune", "Asteroid", "Pluto"] -> ['>', '>', '<', '<', '>', '<', '<', '<', '<', '>']
# Atleast here the Solar System is how it's supposed to be!
```

<h2>NOTES</h2>
· There will never be more than one of anything except asteroids

· The Solar System will never contain anything outside:

```
["Asteroid", "Pluto", "Mercury", "Mars", "Venus", "Earth", "Neptune", "Uranus", "Saturn", "Jupiter"]
```
