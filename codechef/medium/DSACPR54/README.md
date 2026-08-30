# DSACPR54

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Add Two Matrices

Given two matrices of same size  **M x N**, add them and print the resultant matrix.

For eg., here we can see, the sum of matrices `A` and `B` is the matrix `A+B` at the rightmost side.

Let's say we have two matrices A and B of the same dimensions (**M x N**). The sum of these two matrices, denoted as C = A + B, is another matrix of the same dimensions where each element C[i][j] is the sum of the corresponding elements A[i][j] and B[i][j].

### Input Format
- The first line of input will contain two space separated integers $N$ and $M$, denoting the number of rows and columns of the two input matrices.
- Next $N$ lines contains $M$ space separated integers, the elements of first matrix.
- Similarly, next $N$ lines contains $M$ space separated integers, the elements of second matrix.
### Output Format

Output $N$ lines contains $M$ space separated integers, the elements of resultant matrix.

### Constraints
- $1 \leq N, M \leq 1000$
- The elements of both the matrices are non-negative and won't exceed $100000$.
### Sample 1:
Input
Output

```
2 3
2 3 4
4 5 6
1 7 4 
6 4 9
```

```
3 10 8
10 9 15
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-30T13:51:24.134Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
        int [][] arr1 = new int[m][n];
        int [][] arr2 = new int [m][n];
        for(int i =0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0;j<n;j++){
                arr1[i][j]= Integer.parseInt(st.nextToken());
            }
        }
        for(int i = 0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            for(int j= 0 ;j<n;j++){
                arr2[i][j] =Integer.parseInt(st.nextToken()); 
            }
        }
        
        for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){
                arr1[i][j] +=arr2[i][j];
            }
        }
        StringBuffer sb = new StringBuffer();
        for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){
                sb.append(arr1[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/DSACPR54)