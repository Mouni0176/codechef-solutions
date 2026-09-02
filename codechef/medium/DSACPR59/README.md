# DSACPR59

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Sum of Diagonals

Given a `N x N` square matrix, find the sum of both primary as well as secondary diagonal elements.

For eg. in the following matrix:

Sum of primary and secondary diagonal element = 3 + 2 + 0 + 4 + 5 = 14

 **Important Note** 
If N is odd, subtract the middle element once to avoid counting it twice.

### Input Format
- The first line of input will contain a single integer $N$, denoting the no. of rows and columns in input matrix
- Next $N$ lines contain $N$ space separated integers, the elements of the matrix.
### Output Format
- Output on a single line, the sum of diagonals elements.
### Constraints
- $1 \leq N \leq 100$
- The elements of the matrix are non-negative and won't exceed $1000$.
### Sample 1:
Input
Output

```
3
3 1 5
8 2 1
4 6 0
```

```
14
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-02T16:10:03.611Z  

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
		int n = Integer.parseInt(st.nextToken());
		int [][] arr = new int[n][n];
		for(int i=0;i<arr.length;i++){
		    st = new StringTokenizer(br.readLine());
		    for(int j=0;j<arr.length;j++){
		        arr[i][j] = Integer.parseInt(st.nextToken());
		    }
		}
		
		int count=0;
		int same=0;
		for(int i=0;i<arr.length;i++){
		    count+=arr[i][arr.length-i-1];
		    same+=arr[i][i];
		}
		count+=same;
		
		if(n%2!=0){
		    count-=(arr[n/2][n/2]);
		}
		
		System.out.println(count);

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/DSACPR59)