# [Form The Largest](https://www.codewars.com/kata/form-the-largest "https://www.codewars.com/kata/5a4ea304b3bfa89a9900008e")

**_Given_**   *a number* , **_Return_**  **_The Maximum number _**  *could be formed from the digits of the number given* . 

## Notes

* **_Only Natural numbers_** *passed to the function , numbers Contain digits [0:9] inclusive*
* **_Digit Duplications_** *could occur* , So also **_consider it when forming the Largest_**

## Input >> Output Examples:

```
maxNumber (213) ==> return (321)
```

### **_Explanation_**:

As `321` is **_The Maximum number _**  *could be formed from the digits of the number   **_213_*** . 

```
maxNumber (7389) ==> return (9873)
```

### **_Explanation_**:

As `9873` is **_The Maximum number _**  *could be formed from the digits of the number  **_7389_*** . 

```
maxNumber (63729) ==> return (97632)
```

### **_Explanation_**:

As `97632` is **_The Maximum number _**  *could be formed from the digits of the number  **_63729_*** . 

```
maxNumber (566797) ==> return (977665)
```

### **_Explanation_**:

As `977665` is **_The Maximum number _**  *could be formed from the digits of the number  **_566797_*** .

**_Note_** : **_Digit duplications are considered when forming the largest_** . 


```
maxNumber (17693284) ==> return (98764321)
```

### **_Explanation_**:
 
As `98764321` is **_The Maximum number _**  *could be formed from the digits of the number  **_17693284_*** .