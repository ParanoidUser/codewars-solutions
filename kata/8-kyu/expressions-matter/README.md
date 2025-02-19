# [Expressions Matter](https://www.codewars.com/kata/expressions-matter "https://www.codewars.com/kata/5ae62fcf252e66d44d00008e")

**_Given_** *three integers* `a` ,`b` ,`c`, **_return_** *the **_largest number_** obtained after inserting the following operators and brackets*: `+`, `*`, `()`. 
___
# Consider an Example :

**_With the numbers are 1, 2 and 3_** , *here are some ways of placing signs and brackets*:

* `1 * (2 + 3) = 5`
* `1 * 2 * 3 = 6`
* `1 + 2 * 3 = 7`
* `(1 + 2) * 3 = 9`

So **_the maximum value_** that you can obtain is  **_9_**.

___
# Notes 

* **_The numbers_** *are always* **_positive_**. 
* **_The numbers_** *are in the range* **_(1? ?? a,?b,?c? ?? 10)_**.
* *You can use the same operation* **_more than once_**.
* **It's not necessary** *to place all the signs and brackets*.
* **_Repetition_** *in numbers may occur* .
* You **_cannot swap the operands_**. For instance, in the given example **_you cannot get expression_** `(1 + 3) * 2 = 8`.

___
# Input >> Output Examples:

```
expressionsMatter(1,2,3)  ==>  return 9
```
## **_Explanation_**:
*After placing signs and brackets, the **_Maximum value_** obtained from the expression* `(1+2) * 3 = 9`.
___

```
expressionsMatter(1,1,1)  ==>  return 3
```
## **_Explanation_**:
*After placing signs, the **_Maximum value_** obtained from the expression is* `1 + 1 + 1 = 3`.
___

```
expressionsMatter(9,1,1)  ==>  return 18
```
## **_Explanation_**:
*After placing signs and brackets, the **_Maximum value_** obtained from the expression is* `9 * (1+1) = 18`.