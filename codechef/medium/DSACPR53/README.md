# DSACPR53

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Traversal of 2d arrays

Like a normal array, we can traverse a 2D array of size $N$, using a loop going through each of its indexes from $0$ to $N-1$. Accessing an index from this array will give us the array at that index.
Now, we can use another nested loop to traverse through all the inner array elements.
Thus, the pseudo-code to print all the elements of a 2D array of size $N \times M$ will be:

```
for i from 0 to N-1
    for j from 0 to M-1
        print arr[i][j]
    come to the next line

```

### Task

Write a program to do the following:

- Take $N$ and $M$ as input
- Declare a 2D array of size $N \times M$
- Take $N \times M$ inputs and store them in the 2D array at appropriate index
- Output the 2D array
### Sample 1:
Input
Output

```
2 3
1 2 3
4 5 6
```

```
1 2 3
4 5 6
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-30T10:38:42.473Z  

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
		int [][] arr = new int [m][n];
		for(int i = 0;i<m ;i++){
		    st = new StringTokenizer(br.readLine());
		    for(int j=0;j<n;j++){
		        arr[i][j] = Integer.parseInt(st.nextToken());
		    }
		}
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<m;i++){
		    for(int j=0;j<n;j++){
		        sb.append(arr[i][j]).append(" ");
		    }
		
		    sb.append('\n');
		}
		System.out.println(sb);
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/DSACPR53)