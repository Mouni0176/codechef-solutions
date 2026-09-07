# TWOSTR

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Password

Chef is planning to setup a secure password for his Codechef account. For a password to be secure the following conditions should be satisfied:

- Password must contain at least one lower case letter $[a-z]$;
- Password must contain at least one upper case letter [A−Z] strictly inside (first or the last character won’t be considered)
- Password must contain at least one digit $[0-9]$ strictly inside;
- Password must contain at least one special character from the set $\{$ '@', '#', '%', '&', '?' $\}$ strictly inside;
- Password must be at least $10$ characters in length, but it can be longer.

Chef has generated several strings and now wants you to check whether the passwords are secure based on the above criteria. Please help Chef in doing so.

### Input
- First line will contain $T$, number of testcases. Then the testcases follow.
- Each testcase contains of a single line of input, string $S$.
### Output

For each testcase, output in a single line "YES" if the password is secure and "NO" if it is not.

### Constraints
- $1 \leq |S| \leq 20$
- All the characters in $S$ are one of the following: lower case letters $[a-z]$, upper case letters $[A-Z]$, digits $[0-9]$, special characters from the set $\{$ '@', '#', '%', '&', '?' $\}$
- Sum of length of strings over all tests is atmost $10^6$
### Sample 1:
Input
Output

```
3
#cookOff#P1
U@code4CHEFINA
gR3@tPWD
```

```
NO
YES
NO
```

### Explanation:

 **Example case 1:**  Condition $3$ is not satisfied, because the only digit is not strictly inside.

 **Example case 2:**  All conditions are satisfied.

 **Example case 3:**  Condition $5$ is not satisfied, because the length of this string is 8.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-07T16:34:35.341Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		if(scanner.hasNextInt()){
		    int test = scanner.nextInt();
		    scanner.nextLine();
		
		for(int j=0;j<test;j++){
		    boolean a1=false;
		    boolean aa1 = false;
		    boolean num = false;
		    boolean chaar = false;
		    boolean lengthh = false;
		String input = scanner.nextLine();
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)>='a' && input.charAt(i)<='z'){
                a1 = true;
            }
            if((i>0)&& (i<input.length()-1)){
            if(input.charAt(i)>='A' && input.charAt(i)<='Z'){
                aa1 =true;
            }
           
            if(input.charAt(i)<='9' && input.charAt(i)>='0'){
                num=true;
            }
            if((input.charAt(i)=='@') ||(input.charAt(i)=='#')||(input.charAt(i)=='%')|| (input.charAt(i)=='&') || (input.charAt(i)=='?')){
                chaar = true;
            }
           
            }
        }
            if(input.length()>=10){
                lengthh = true;
            }
            if((a1 == true)&& (aa1 == true)&& (num ==true)&& (chaar== true)&&(lengthh==true)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
		}
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/TWOSTR)