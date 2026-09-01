# DSACPR58

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Set Matrix Zeroes

Given an `N x M` integer matrix, if an element is `0`, set its entire row and column to `0`s.

 **Note:**  You  **don’t need to repeat the process for new 0s that are formed**  during the operation.

See the following example:

### Constraints
- $1 \leq N, M \leq 100$
- The elements of the matrix are non-negative and won't exceed $1000$.
### Sample 1:
Input
Output

```
3 3
4 6 0
8 2 1
3 1 5

```

```
0 0 0
8 2 0
3 1 0
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-01T16:31:41.384Z  

```java
public static void setZeroes(int[][] mat) {
    int matt = mat[0][0];
    int row=1 ;
    int col=1;
    for(int i =0;i<mat.length;i++){
        if(mat[i][0] ==0){
             row =0;
        }
    }
    
    for(int j=0;j<mat[0].length;j++){
        if(mat[0][j] == 0){
             col =0;
        }
    }
    
    for(int i=1;i<mat.length;i++){
        for(int j=1;j<mat[0].length;j++){
            if(mat[i][j] ==0){
                mat[i][0] = 0;
                mat[0][j] = 0;
            }
        }
    }
    
    for(int i=mat.length-1;i>0;i--){
        for(int j=mat[0].length-1;j>0;j--){
            if((mat[i][0] ==0)||(mat[0][j]==0)){
                mat[i][j] =0;
            }
        }
    }
    if(row ==0){
        for(int i=0;i<mat.length;i++){
            mat[i][0]=0;
        }
    }
    
    if(col ==0){
        for(int j=0;j<mat[0].length;j++){
            mat[0][j]=0;
        }
    }
    for(int i=0;i<mat.length;i++){
        for(int j=0;j<mat[0].length;j++){
            if(matt ==0){
                mat[0][j] =0;
                mat[i][0]=0;
            }
        }
    }
    
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DSACPR58)