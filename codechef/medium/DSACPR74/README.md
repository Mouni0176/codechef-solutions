# DSACPR74

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Problem

Given a sorted array of  **distinct**  integers $A$ and a target value $K$, return the index if the target is found. If not, return the index where it would be if inserted in order.

Complete the function and use Binary Search to solve this Problem.

### Video Explanation

 **Note:**  Do not write anything outside the function.

### Input Format
- The first line of input contains two space-separated integers $N$ and $Q$ denoting the number of elements in the array $A$ and Q queries to search the given target element.
- The second line contains $N$ space-separated integers denoting the elements in the array $A$.
- The next $Q$ lines contain the elements for which we need to find the search index positions
### Output Format
- For each query Q: Output position of $K$ or the position where $K$ is to be inserted.
### Constraints
- $1 \leq N \leq 200000$
- $1 \leq Q \leq 200000$
- $1 \leq A_i \leq 10^9$ A is sorted in strictly increasing order.
- $1 \leq K \leq 10^9$
### Sample 1:
Input
Output

```
9 1
1 3 6 7 10 13 20 25 27 
7

```

```
3
```

### Explanation:

$7$ is present at the index $3$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-30T15:05:32.809Z  

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

[View on CodeChef](https://www.codechef.com/problems/DSACPR74)