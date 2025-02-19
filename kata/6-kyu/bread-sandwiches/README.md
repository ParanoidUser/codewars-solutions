# [Bread sandwiches](https://www.codewars.com/kata/bread-sandwiches "https://www.codewars.com/kata/622a6a822494ab004b2c68d2")

If you're not familiar with the fantastic culinary delights of the British Isles you may not know about the bread sandwich.

The idea is very simple - if you have a slice of bread between two other slices of bread, then it's a bread sandwich. Additionally, if you
have a bread sandwich between two other slices of bread, you get a bread sandwich sandwich, and so on.

In this kata, we will define the following terms like so:

- *Sandwich* - Two slices of bread which may or may not have a filling
- *Bread Sandwich* - Two slices of bread which contains one slice of bread in the middle as a filling

You will need to build two functions:

- Given the number of slices of bread, return the phrase used to refer to the sandwich

 ```
 2 - 'sandwich'
 5 - 'bread sandwich sandwich'
 ```

- The reverse function - given the name of the sandwich, return how many slices of bread there are in the sandwich

 ```
 'bread sandwich' - 3
 'sandwich sandwich' - 4
 ```

- You should return `None`/`null` if there is no input / the input is invalid / there is no sandwich
- Maximum 100 slices of bread