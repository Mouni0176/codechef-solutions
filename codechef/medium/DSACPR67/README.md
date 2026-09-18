# DSACPR67

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Find Smallest Absolute Difference

Write a program to find the element in an array with the  **smallest absolute difference**  from a given integer  **k**. If there are multiple elements with the same minimum difference, print the smallest of these elements.

### Input Format
- The first line contains two integers n and k, where n is the number of elements in the array and k is the integer against which to compare.
- The second line contains $n$ integers separated by spaces, representing the elements of the array.
### Output Format
- Print the element in the array with the smallest difference from k. If multiple elements have the same minimum difference, print the smallest of these elements.
### Constraints
- $1 \leq N \leq 100000$
- $-10^9 \leq arr_i \leq 10^9$
- $-10^9 \leq k \leq 10^9$
### Sample 1:
Input
Output

```
5 10
1 5 9 12 14

```

```
9

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-18T02:56:22.520Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int k = scanner.nextInt();
		
		int [] arr = new int[n];
		
		for(int i=0;i<n;i++){
		    arr[i] = scanner.nextInt();
		}
		
		int mini= Integer.MAX_VALUE;
		int mininum = Integer.MAX_VALUE;
	
		for(int i=0;i<n;i++){
    		int ad = Math.abs(k-arr[i]);
    		if(ad <mini){
    		    mini = ad;
    		    mininum = arr[i];
    		    
    		}
    		else if(ad == mini){
    		    if(mininum>arr[i]){
    		        mininum =arr[i]; 
    		    }
    		   
    		}
		}
	    System.out.println(mininum);
	
}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/DSACPR67)