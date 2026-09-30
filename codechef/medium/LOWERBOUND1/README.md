# LOWERBOUND1

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-30T15:05:41.034Z  

```java
public static int searchInsertPosition(int[] arr, int n, int k) {
    int left = 0;
    int right = n - 1;

    while (left <= right) {
        int middle = (left + right) / 2;
        if (arr[middle] == k) {
            return middle;
        } else if (arr[middle] > k) {
            right = middle - 1;
        } else {
            left = middle + 1;
        }
    }
    return left;
}
```

---

[View on CodeChef](https://www.codechef.com/problems/LOWERBOUND1)