# DSACPR63

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Linear Search in string

Given a string S and a character as input, print the first position of the character in the string if it is present. If the character does not exist in the string, print " **-1** ".

### Input Format
- The first line contains a string.
- The second line contains a single character.
### Output Format
- Print the first position (0-based index) of the character in the string if it is present.
- Print "-1" if the character is not present in the string.
### Constraints
- $1 \leq |S| \leq 100000$
- S consists of printable ASCII characters without spaces.
- The search character is a single printable ASCII character.
### Sample 1:
Input
Output

```
helping
g
```

```
6
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-17T14:53:21.789Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		
		char letter = scanner.next().charAt(0);
		
		int found =-1;
		for(int i=0;i<word.length();i++){
		    if(word.charAt(i) == letter){
		        System.out.println(i);
		        found =0;
		    }
		   
		}
		if(found ==-1){
		    System.out.println("-1");
		}
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/DSACPR63)