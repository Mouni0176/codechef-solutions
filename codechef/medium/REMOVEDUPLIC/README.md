# REMOVEDUPLIC

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Remove Duplicates from Sorted Array

Chef has an integer array $nums$ sorted in  **non-decreasing order**.
Chef wants to remove all  **duplicate elements**  from the array  **in-place**  such that each unique element appears  **only once**.

The  **relative order**  of the elements should remain the same.

After removing the duplicates, let the number of unique elements be $K$.
The first $K$ elements of the array should contain the unique elements in their original order.
The values beyond the first $K$ elements do not matter.
Your task is to help Chef find $K$ and print the first $K$ elements of the modified array.

## Function Declaration
### Function Name

$removeDuplicates$ – Removes duplicate elements from a sorted array in-place.

### Parameters
- $nums$ : A list/array of integers sorted in non-decreasing order.
### Return Value
- Returns an integer K — the number of unique elements. The first $K$ positions of $nums$ must contain these unique values.
## Constraints:
- $1 \leq N \leq 3 × 10^4$
- $–100 \leq nums[i] ≤ 100$
- $nums$ is sorted in non-decreasing order.
### Input Format
- $N$ → size of array
- Next line → N sorted integers
### Output Format
- Print $K$
- Print the first K unique elements of the modified array
### Sample 1:
Input
Output

```
6
1 1 2 2 3 3

```

```
3
1 2 3

```

### Explanation:

`nums = [1,1,2,2,3,3]` -> After removing duplicates: `[1, 2, 3, _, _, _]`.
Here, `K = 3`, and the first three elements are `1 2 3`.

### Sample 2:
Input
Output

```
5
0 0 1 1 1

```

```
2
0 1

```

### Explanation:

`nums = [0,0,1,1,1]` -> After removing duplicates: `[0, 1, _, _, _]`.
Here, `K = 2`, and the first two elements are `0 1`.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-29T15:52:02.721Z  

```java
 public static int removeDuplicates(int[] nums) {
    int i=0;
    for(int j=0;j<nums.length;j++){
        if(nums[i]!=nums[j]){
            i++;
            nums[i]=nums[j];
            
        }    
    
 }
 return i+1;
 }
```

---

[View on CodeChef](https://www.codechef.com/problems/REMOVEDUPLIC)