# DSACPR50

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Maximum Subarray Sum

Given an integer array $nums$, find the  **subarray**  with the largest sum, and print its sum.

 **Note** : A subarray is a contiguous non-empty sequence of elements within an array.

### Input Format
- The first line contains $T$, the number of test cases.
- The first line in each test case contains $N$, the number of elements in an array.
- The second line in each test case contains $N$ integers, denoting the elements in the array.
### Output Format

For each test case, output the maximum subarray sum of each array.

### Constraints
- $1 \leq T \leq 100$
- $1 \leq N \leq 100000$
- $-10^9 \leq A_i \leq 10^9$
### Sample 1:
Input
Output

```
3
9
-2 1 -3 4 -1 2 1 -5 4
1
1
5
5 4 -1 7 8
```

```
6
1
23
```

### Explanation:

Test Case $1.$ The maximum subarray sum for the first array is $6$ $($from subarray $[4, -1, 2, 1])$.
Test Case $2.$ For the second array, it's $1$ $($only one element $).$
Test Case $3.$ For the third array, it's $23$ $($from subarray $[5, 4, -1, 7, 8]).$

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-26T11:15:58.899Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		
		for(int i = 0;i<test;i++){
		    long sum = 0;
		    int n = scanner.nextInt();
		    long maxi = Long.MIN_VALUE;
		    for(int j= 0 ;j<n;j++){
		        long m = scanner.nextInt();
		        
		        sum += m;
		        
		        maxi = Math.max(sum,maxi);
		        if(sum < 0){
		            sum = 0;
		            
		        }
		        
		    }
		    System.out.println(maxi);
		   
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/DSACPR50)