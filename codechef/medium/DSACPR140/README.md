# DSACPR140

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Convert Decimal to Binary

Let's implement a stack using arrays to solve a classic problem: converting an integer from decimal to binary using the "divisor-remainder" method.

In this method, you repeatedly divide the decimal number by 2 and keep track of the remainders.
The remainders, when read from bottom to top, give you the binary representation of the number.

Update the code given in the IDE to solve this problem.

### Sample 1:
Input
Output

```
3
10
15
18
```

```
1010
1111
10010
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-04T15:13:02.349Z  

```java
import java.util.Scanner;
import java.util.Stack;

class DecimalToBinary {
    static final int MAX_SIZE = 101;
    static int[] a = new int[MAX_SIZE];
    static int top = -1;

    static void push(int ele) {
        if (top <= MAX_SIZE - 1) {
            a[++top] = ele;
        } else {
            System.out.println("Stack is full. Cannot push: " + ele);
        }
    }

    static int pop() {
        if (top >= 0) {
            int ele = a[top];
            top--;
            return ele;
        } else {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }
    }

    static boolean isEmpty() {
        return top == -1;
    }

    static int size() {
        return top + 1;
    }

    static void decimalToBinary(int decimal) {
        while (decimal > 0) {
            
            int b=decimal%2;
            push(b);
            decimal=decimal/2;
            
        }

        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        while (!isEmpty()) {
            System.out.print(pop());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int decimal = scanner.nextInt();
            decimalToBinary(decimal);
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/DSACPR140)