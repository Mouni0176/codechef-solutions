# DSACPR136

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Simulate Stack - 2

Choose the operations which will give us the following as final stack :-

### Stack

```
|5|
|4| 
|5| 
|6| 
|2|
|4|

```

Where 5 is the top most element of stack and 4 is the bottom most element of stack.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-04T14:42:15.058Z  

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

[View on CodeChef](https://www.codechef.com/problems/DSACPR136)