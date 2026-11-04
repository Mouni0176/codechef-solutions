# DSACPR135

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-04T14:40:33.842Z  

```java
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