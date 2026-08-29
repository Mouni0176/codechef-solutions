# MISSNDREPEAT

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Find the repeating and missing number

You are given multiple test cases. Each test case consists of an integer array $arr$ of size $n$, containing numbers in the range $[1, n]$. In each test case:

- Exactly one number appears twice (the repeating number).
- Exactly one number is missing from the range $[1, n]$.

Your task is to return the result for each test case as an array of size 2:

- The first element is the repeating number.
- The second element is the missing number.

👉  **Important** : You are  **NOT allowed to modify the original array**.

## Function Declaration
### Function Name

$findRepeatingAndMissing$ – This function finds the repeating and missing numbers in the given array without modifying it.

### Parameters
- $arr$ : An integer array of size $n$ containing numbers in the range $[1, n]$.
### Return Value
- Returns an array of size 2: The first element is the repeating number. The second element is the missing number.
## Constraints
- $1 ≤ T ≤ 10$
- $2 ≤ n ≤ 10^5$
- $n == arr.length$
- $1 ≤ arr[i] ≤ n$
- Exactly one number appears twice.
- Exactly one number is missing.
- The original array must not be modified.
### Input Format
- The first line contains a single integer T — the number of test cases.
- For each test case: The first line contains a single integer n — the size of the array. The second line contains n space-separated integers representing the array arr.
### Output Format
- For each test case, print two space-separated integers: The repeating number The missing number
### Sample 1:
Input
Output

```
2
5
4 1 2 2 5
7
7 1 3 4 5 6 7
```

```
2 3
7 2
```

### Explanation:
- In the first test case: The array is [4, 1, 2, 2, 5]. Repeating: 2 Missing: 3
- In the second test case: The array is [7, 1, 3, 4, 5, 6, 7]. Repeating: 7 Missing: 2

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-29T15:03:03.523Z  

```java
import java.util.*;
class Solution {
    public int[] findRepeatingAndMissing(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        int [] res = new int[2];
        for(int i = 0;i<arr.length;i++){
            if(seen.contains(arr[i])){
                res[0] = arr[i];
            }
            else{
                seen.add(arr[i]);
            }
            
        }
        for(int i=1;i<=arr.length;i++){
            if(!seen.contains(i)){
                res[1]=i;
                break;
            }
        }
       return res;
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/MISSNDREPEAT)