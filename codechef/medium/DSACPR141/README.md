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
**Submitted:** 2026-11-05T16:31:50.141Z  

```java
import java.util.Scanner;

class BalancedParentheses {
    static final int MAX_SIZE = 101;
    static char[] a = new char[MAX_SIZE];
    static int top = -1;

    static void push(char ele) {
        if (top <= MAX_SIZE - 1) {
            a[++top] = ele;
        } else {
            System.out.println("Stack is full. Cannot push: " + ele);
        }
    }

    static char pop() {
        if (top >= 0) {
            char ele = a[top];
            top--;
            return ele;
        } else {
            System.out.println("Stack is empty. Cannot pop.");
            return '-';
        }
    }

    static boolean isEmpty() {
        return top == -1;
    }

    static boolean isFull() {
        return top >= MAX_SIZE;
    }

    static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')');
    }

    static boolean isBalanced(String expression) {
        top =-1;
        
        for(int i=0;i<expression.length();i++){
            char c=expression.charAt(i);
            if(c=='('){
                push(c);
            }
            else if(c==')'){
                if(isEmpty()){
                    return false;
                }
                char topchar = pop();
                if(!isMatchingPair(topchar,c)){
                    return false;
                }
            }
        
    }
    return isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            String str = scanner.next();
            System.out.println(str + " : " + isBalanced(str));
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/DSACPR141)