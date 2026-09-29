# DSACPR67

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-29T14:42:56.903Z  

```java
class Solution {
public int[] findMinMax(int n, int[] arr) {
    int mini = Integer.MAX_VALUE;
    int maxi = Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        maxi = Math.max(maxi,arr[i]);
        mini = Math.min(mini,arr[i]);
    }
    
    return new int[]{mini,maxi};
}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DSACPR67)