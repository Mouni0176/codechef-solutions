# MATMAXROW

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Row With Maximum Ones

Find the row with maximum no. of 1’s in a row-wise sorted binary matrix. If there are many such rows, print the first one.

For eg. in the following matrix:

Both row `2` and row `4` has maximum number of 1's, hence the answer would be  **2**  as its the first row which has maximum 1's.

### Input Format
- The first line of input will contain two space separated integers $N$ and $M$, denoting the no. of rows and columns in the row-wise sorted binary matrix.
- Next $N$ lines contains $N$ space separated integers, the elements of the matrix.
### Output Format
- Output on a single line the row number which has maximum 1's.
- Follow up: can you solve it in better than O(N*M) time complexity?
### Constraints
- $1 \leq N, M \leq 100$
- The elements of the matrix are either 0 or 1.
- Matrix is row-wise sorted.
### Sample 1:
Input
Output

```
3 3
0 1 1
0 1 1
0 1 1
```

```
1
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T13:46:26.730Z  

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
	    int n = Integer.parseInt(st.nextToken());
	    int [][] arr= new int[m][n];
	    for(int i =0;i<m;i++){
	        st = new StringTokenizer(br.readLine());
	        for(int j=0;j<n;j++){
	            arr[i][j]= Integer.parseInt(st.nextToken());
	        }
	    }
	    int start =0;
	    int maxi=0;
	    int count=0;
	    for(int i=0;i<m;i++){
	         count=0;
	        for(int j=0;j<n;j++){
	            if(arr[i][j]==1){
	                count++;
	                
	            }
	            if(maxi<count){
	                start=i;
	                maxi=count;
	            }
	        }
	    }
	    System.out.println(start+1);
	    

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MATMAXROW)