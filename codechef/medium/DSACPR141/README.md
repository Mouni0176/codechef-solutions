# DSACPR141

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Valid Parenthesis

A string of parentheses is considered valid if each opening parenthesis has a matching closing parenthesis and the pairs are properly nested. In a valid parenthesis string, every opening bracket '(' must have a corresponding closing bracket ')' that occurs after the opening bracket, and there must not be any extra or unpaired brackets.

Here are the rules for a string of parentheses to be valid:

- Correct order: Each closing parenthesis must correspond to the latest unmatched opening parenthesis.
- Matching pairs: For every opening parenthesis, there must be a closing parenthesis.

Let's look at some examples:

- "()" - This is valid because the only pair of parentheses correctly matches and is in the right order.
- "()()" - This is also valid. There are two separate but correct matches.
- "(()())" - Valid as well, since the inner pair is nested within the outer pair and they all match up.
- "(())" - The inner pair is nested within the outer pair, with both pairs being correctly matched.
- ")(" or "(" or ")" - All invalid because they contain either unmatched or improperly ordered parentheses.

The goal is to determine if parentheses (and optionally other brackets like curly braces and square brackets) in an expression are properly balanced.
Check the sample test cases given below for expected input and output format.

Complete the code in the IDE to solve this problem.

### Sample 1:
Input
Output

```
3
((()))
()()()
(((())
```

```
((())) : true
()()() : true
(((()) : false
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-05T16:35:01.138Z  

```java
import java.util.*;
import java.io.*;
class Solution {
    private static final int MAX_SIZE = 200005;
    private char[] a = new char[MAX_SIZE];
    private int top = -1;

    private void push(char ele) {
        if (top < MAX_SIZE - 1) {
            a[++top] = ele;
        } else {
            System.out.println("Stack is full. Cannot push: " + ele);
        }
    }

    private char pop() {
        if (top >= 0) {
            char ele = a[top];
            top--;
            return ele;
        } else {
            System.out.println("Stack is empty. Cannot pop.");
            return '\0';
        }
    }

    private boolean isEmpty() {
        return top == -1;
    }

    private boolean isMatchingPair(char open, char close) {
        if (open == '(' && close == ')') return true;
        if (open == '{' && close == '}') return true;
        if (open == '[' && close == ']') return true;
        return false;
    }

    public boolean isBalanced(String expression) {
        top = -1; // Reset stack pointer
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (isEmpty()) {
                    return false;
                }
                char topChar = pop();
                if (!isMatchingPair(topChar, c)) {
                    return false;
                }
            }
        }
        return isEmpty();
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        Solution sol = new Solution();
        while (t-- > 0 && sc.hasNext()) {
            String str = sc.next();
            System.out.print(str + " : ");
            boolean ans = sol.isBalanced(str);
            if (ans) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DSACPR141)