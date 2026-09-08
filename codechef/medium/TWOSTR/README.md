# TWOSTR

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Chef and the Wildcard Matching

Chef wants to implement wildcard pattern matching supporting only the wildcard '?'. The wildcard character '?' can be substituted by any single lower case English letter for matching. He has two strings  **X**  and  **Y**  of equal length, made up of lower case letters and the character '?'. He wants to know whether the strings  **X**  and  **Y**  can be matched or not.

### Input

The first line of input contain an integer  **T**  denoting the number of test cases. Each test case consists of two lines, the first line contains the string  **X**  and the second contains the string  **Y**.

### Output

For each test case, output a single line with the word  **Yes**  if the strings can be matched, otherwise output  **No**.

### Constraints
- 1 ≤ T ≤ 50
- Both X and Y have equal length and the length is between 1 and 10.
- Both X and Y consist of lower case letters and the character '?'.
### Sample 1:
Input
Output

```
2
s?or?
sco??
stor?
sco??
```

```
Yes
No
```

### Explanation:

 **Test case $1$:**  One of the possible ways to match both the strings is $\texttt{score}$. This can be done by:

- Replace $1^{st}$ and $2^{nd}$ $\texttt{?}$ of string $X$ by characters $\texttt{c}$ and $\texttt{e}$ respectively.
- Replace $1^{st}$ and $2^{nd}$ $\texttt{?}$ of string $Y$ by characters $\texttt{r}$ and $\texttt{e}$ respectively.

 **Test case $2$:**  There exists no way to fill the $\texttt{?}$ such that the strings become equal. Thus, the answer is `No`.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-08T14:10:54.342Z  

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            boolean found =true;
            boolean finall =true;
            String x = scanner.next();
            String y = scanner.next();
            for(int i =0;i<x.length();i++){
                if(x.charAt(i)!=y.charAt(i)){
                    found =false;
                }
                if((x.charAt(i)=='?')||(y.charAt(i)=='?')){
                    found =true;
                }
                if(found==false){
                    finall = false;
                }
            }
                if(finall ==true){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            
           
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/TWOSTR)