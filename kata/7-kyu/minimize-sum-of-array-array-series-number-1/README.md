# [Minimize Sum Of Array (Array Series #1)](https://www.codewars.com/kata/minimize-sum-of-array-array-series-number-1 "https://www.codewars.com/kata/5a523566b3bfa84c2e00010b")

**_Given_** an **_array of integers_** , **_Find the minimum sum_** which is obtained *from summing each Two integers product* .

## Notes 

* **_Array/list_** *will contain* **_positives only_** . 
* **_Array/list_** *will always has* **_even size_**

№# Input >> Output Examples

```
minSum({5,4,2,3}) ==> return (22) 
```

#№# **_Explanation_**:

* **_The minimum sum_** *obtained from summing each two integers product* ,  ` 5*2 + 3*4 = 22`

```
minSum({12,6,10,26,3,24}) ==> return (342)
```

### **_Explanation_**:

* **_The minimum sum_** *obtained from summing each two integers product* ,  ` 26*3 + 24*6 + 12*10 = 342`

```
minSum({9,2,8,7,5,4,0,6}) ==> return (74)
```

### **_Explanation_**:

* **_The minimum sum_** *obtained from summing each two integers product* ,  ` 9*0 + 8*2 +7*4 +6*5 = 74`