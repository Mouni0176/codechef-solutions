# DSACPR65

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Find Kth Character Position

Given a string  **s1**, a character  **c1**, and an integer  **k**, find and print the position of the $k$th occurrence of the character  **c1**  in the string  **s1**. If the $k$th occurrence does not exist, print  **-1**.

### Input Format
- The first line contains the string s1, the character c1, and the integer k separated by spaces.
### Output Format
- An integer representing the position of the $k$th occurrence of c1 in s1.
- If the $k$th occurrence does not exist, print -1.
### Constraints
- $1 \leq$ Length of string S1 $\leq 100000$
- s1 consists of lowercase and uppercase English letters.
- c1 is a single English alphabet character.
- $1 \leq k \leq 100000$.
### Sample 1:
Input
Output

```
HelloHowyoudoing H 2
```

```
5
```

### Sample 2:
Input
Output

```
funny n 3
```

```
-1
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-17T15:59:25.023Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		
		char c = scanner.next().charAt(0);
		
		int value = scanner.nextInt();
		
		int found =-1;
		int count=0;
		for(int i=0;i<s.length();i++){
		    if(s.charAt(i)==c){
		       count++;
		       if(count ==value){
		        found =i;
		       }
		 
		    }
		}
		if(found ==-1){
		    System.out.println("-1");
		}
		else{
		    System.out.println(found);
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/DSACPR65)