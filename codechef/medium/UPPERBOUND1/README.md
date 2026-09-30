# UPPERBOUND1

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-30T15:38:45.192Z  

```java
 static int solve(int[] nums, int x) {
    int left = 0;
    int right = nums.length;
    while(left<right){
        int mid =(left+right)/2;
        
        
         if(nums[mid]<x){
            left = mid+1;
        }
        else{
            right = mid;
        }
    }
    return left;
 }
```

---

[View on CodeChef](https://www.codechef.com/problems/UPPERBOUND1)