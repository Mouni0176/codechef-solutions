# DSACPR135

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Simulate Stack - 1

Given some stack operation, Find what will be the resultant output after the following operations.

### Operations
- Push 4
- Pop
- Push 11
- Peek
- Pop
- Peek

 **Print the stack top value once we call peek**

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-04T14:41:04.507Z  

```cpp
static int peek() {
    if (top >= 0) {
        int ele = a[top];
        System.out.println("Peeked: " + ele);
        return ele;
    } else {
        System.out.println("Stack is empty. Cannot peek.");
        return 0;
    }
}

static boolean is_empty() {
    return top == 0;
}

static boolean is_full() {
    return top >= MAX_SIZE;
}


```

---

[View on CodeChef](https://www.codechef.com/problems/DSACPR135)