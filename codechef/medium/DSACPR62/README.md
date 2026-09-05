# DSACPR62

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Linear Search in array

Write a program to search for a specific element in an array and print " **Yes** " if the element is present, otherwise print " **No** ".

### Input:
- The first line contains an integer $n$, the length of the array and $k$, the element to be search.
- The second line contains $n$ space-separated integers representing the elements of the array.
### Output:
- Print "Yes" if the element $k$ is present in the array.
- Print "No" if the element $k$ is not present in the array.
### Constraints
- $1 \leq n \leq 100000$
- $-10^9 \leq k \leq 10^9$
- $-10^9 \leq arr_i \leq 10^9$
### Sample 1:
Input
Output

```
8 1
3 5 1 4 5 6 5 6
```

```
Yes
```

### Sample 2:
Input
Output

```
3 4
1 2 3
```

```
No
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-05T09:12:01.695Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		int lengthh= scanner.nextInt();
		int element = scanner.nextInt();
        int []arr = new int [lengthh];
        boolean found = false;
        for(int i=0;i<lengthh;i++){
            arr[i] = scanner.nextInt();
        }
        for(int i=0;i<lengthh;i++){
            if(arr[i]==element){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/DSACPR62)