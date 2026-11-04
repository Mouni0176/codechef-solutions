# DSACPR133

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Simulate Push and Pop

Given some stack operation, Find what will be the resultant stack after the following operations.

### Operations
- Push 4
- Push 11
- Pop
- Push 14
- Pop
- Push 32

 **Note the stack will be read from left to right, the left most element will be your bottom most element of stack**

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-04T14:37:48.611Z  

```cpp
    static final int MAX_SIZE = 101;
    static int[] a = new int[MAX_SIZE];
    static int top = -1;

    static void push(int ele) {
        if (top <= MAX_SIZE - 1) {
            top++;
            a[top] = ele;
            System.out.println("Pushed: " + ele);
        } else {
            System.out.println("Stack is full. Cannot push: " + ele);
        }
    }
    
    static int pop() {
        if (top >= 0) {
            int ele = a[top];
            top--;
            System.out.println("Popped: " + ele);
            return ele;
        } else {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }
    }

```

---

[View on CodeChef](https://www.codechef.com/problems/DSACPR133)