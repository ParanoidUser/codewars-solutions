# [Balanced Number (Special Numbers Series #1)](https://www.codewars.com/kata/balanced-number-special-numbers-series-number-1 "https://www.codewars.com/kata/5a4e3782880385ba68000018")


**_Balanced number_** is the number that * **_The sum of_** all digits to the **_left of the middle_** digit(s) and the sum of all digits to the **_right of the middle_** digit(s) are **_equal_***.

## Task

**_Given_** a number, **_Find if it is Balanced or not_** . 

## Notes 

* *If* the **_number has an odd number of digits_**  then **_there is only one middle digit_**,  e.g.  `92645`  has middle digit `6`;  **_otherwise_**, there are **_two middle digits_** , e.g.  `1301`  has middle digits  `3`  and  `0` 
* **_The middle digit(s)_**  should  **_not_** be considered when *determining whether a number is balanced or not*, **_e.g_**  `413023`  is a **_balanced number because the left sum and right sum are both_**   `5`.
* **_Number_** *passed is always*  **_Positive_** .
* **_Return_** *the result as* **_String_**

## Input >> Output Examples

```
balancedNum (7) ==> return "Balanced"
```

### **_Explanation_**:

* **_Since_** , **_The sum of_** *all digits to the* **_left of the middle_** digit (0) 
* and **_the sum of_** *all digits to the* **_right of the middle_** digit (0) are **_equal_**  , **_then_** *It's* **_Balanced_**

```
balancedNum (295591) ==> return "Not Balanced"
```

### **_Explanation_**:

* **_Since_** , **_The sum of_** *all digits to the* **_left of the middle_** digits (11) 
* and **_the sum of_** *all digits to the* **_right of the middle_** digits (10) are **_equal_**  , **_then_** *It's* **_Not Balanced_** 
* **_Note_** : **_The middle digit(s)_**  *are* **_55_** . 

```
balancedNum (959) ==> return "Balanced"
```

### **_Explanation_**:

* **_Since_** , **_The sum of_** *all digits to the* **_left of the middle_** digits (9) 
* and **_the sum of_** *all digits to the* **_right of the middle_** digits (9) are **_equal_**  , **_then_** *It's* **_Balanced_** 
* **_Note_** : **_The middle digit_**  *is* **_5_** . 

```
balancedNum (27102983) ==> return "Not Balanced"
```

### **_Explanation_**:

* **_Since_** , **_The sum of_** *all digits to the* **_left of the middle_** digits (10) 
* and **_the sum of_** *all digits to the* **_right of the middle_** digits (20) are **_equal_**  , **_then_** *It's* **_Not Balanced_** 
* **_Note_** : **_The middle digit(s)_**  *are* **_02_** . 