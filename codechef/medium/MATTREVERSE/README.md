# MATTREVERSE

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Upside Down Matrix

Given a `N x M`(N rows and M columns) matrix, print it upside down, i.e, last row should come first, second last should come second......so on..and finally first row should come in last.

See the following example:

### Input Format
- The first line of input will contain two space separated integers $N$ and $M$, denoting the no. of rows and columns in input matrix.
- Next $N$ lines contains $M$ space separated integers, the elements of the matrix.
### Output Format
- Output $N$ lines contains $M$ space separated integers, the elements of the given matrix in upside down manner.
### Constraints
- $1 \leq N, M \leq 100$
- The elements of the matrix are non-negative and won't exceed $1000$.
### Sample 1:
Input
Output

```
3 3
3 1 5
8 2 1
4 6 0
```

```
4 6 0
8 2 1
3 1 5
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-02T16:27:54.477Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n  = Integer.parseInt(st.nextToken());
		int [][]arr = new int [m][n];
		for(int i =0;i<m;i++){
		    st = new StringTokenizer(br.readLine());
		    for(int j=0;j<n;j++){
		        arr[i][j] = Integer.parseInt(st.nextToken());
		        
		    }
		}
		int [][] up = new int [m][n];
		int a=0;
		for(int i=m-1;i>=0;i--){
		    
		    for(int j=0;j<n;j++){
		        
		        up[a][j]= arr[i][j];
		        
		    }
		    a++;
		}
		for(int i=0;i<m;i++){
		    for(int j=0;j<n;j++){
		        System.out.print(up[i][j]+" ");
		    }
		    System.out.println();
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MATTREVERSE)