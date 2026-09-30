# LOWERBOUND1

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Lower Bound

You are given a sorted array $nums$ of length $n$ and an integer $x$.
Your task is to find the lower bound of $x$ in the array.

The  **lower bound**  of `x` is defined as the  **first (smallest) index**  `i` such that `nums[i] >= x`.

- If no such index exists, return n (the size of the array).
- The array is sorted in non-decreasing order.
## Function Declaration
### Function Name

$solve$ – This function finds the lower bound index of a given value in a sorted array.

### Parameters
- $nums$ : A reference to a sorted array of integers.
- $x$ : The integer value whose lower bound is to be found.
### Return Value
- Returns the smallest index $i$ such that $nums[i] \ge x$
- Returns $n$ if no such index exists
## Constraints
- $1 \leq n \leq 10^5$
- $-10^5 \leq nums[i], x \leq 10^5$
- $nums$ is sorted in non-decreasing (ascending) order
### Input Format
- One line containing two integers: $n$ and $x$
- One line containing $n$ space-separated integers — the sorted array
### Output Format
- Print a single integer — the lower bound index
### Sample 1:
Input
Output

```
6 7
2 4 6 8 10 12
```

```
3
```

### Explanation:

At index `3`, the element `8` is the first number `>= 7`.

### Sample 2:
Input
Output

```
5 -1
0 1 2 3 4
```

```
0
```

### Explanation:

All numbers are greater than `-1`. So the answer is index `0`.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-30T15:36:58.189Z  

```java
 static int solve(int[] nums, int x) {
    int left = 0;
    int right = nums.length-1;
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

[View on CodeChef](https://www.codechef.com/problems/LOWERBOUND1)