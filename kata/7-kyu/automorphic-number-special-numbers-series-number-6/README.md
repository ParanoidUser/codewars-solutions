# [Automorphic Number (Special Numbers Series #6)](https://www.codewars.com/kata/automorphic-number-special-numbers-series-number-6 "https://www.codewars.com/kata/5a58d889880385c2f40000aa")

A **number** is called **_Automorphic number_** if and only if *its square ends in the same digits as the number itself*.

## Task

**_Given_** a **number** *determine if it Automorphic or not* .

## Notes 

* The **_number_** passed to the function is **_positive_** 
* **_Single-digit_** numbers are considered **_Automorphic number_**.

## Input >> Output Examples 

```
autoMorphic (25) -->> return "Automorphic" 
```

## **_Explanation_**:

* `25` squared is `625` , **_Ends with the same number's digits which are 25_** .

```
autoMorphic (13) -->> return "Not!!"
```

## **_Explanation_**:

* `13` squared is `169` , **_Not ending with the same number's digits which are 69_** .

```
autoMorphic (76) -->> return "Automorphic"
```

## **_Explanation_**:

* `76` squared is `5776` , **_Ends with the same number's digits which are 76_** .

```
autoMorphic (225) -->> return "Not!!"
```

## **_Explanation_**:

* `225` squared is `50625` , **_Not ending with the same number's digits which are 225_** .

```
autoMorphic (625) -->> return "Automorphic"
```

## **_Explanation_**:

* `625` squared is `390625` , **_Ends with the same number's digits which are 625_** .

```
autoMorphic (1) -->> return "Automorphic"
```

## **_Explanation_**:

* `1` squared is `1` , **_Ends with the same number's digits which are 1_** .

```
autoMorphic (6) -->> return "Automorphic"
```

## **_Explanation_**:

* `6` squared is `36` , **_Ends with the same number's digits which are 6_** 