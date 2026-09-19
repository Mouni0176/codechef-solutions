# DSACPR107

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Linked List Terminology

We learned some new terminologies in the last lesson, do you remember all of them?

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-19T09:18:07.872Z  

```cpp
public class Main {
    static class Node {
        int value;
        Node next;

        Node(int val) {
            value = val;
            next = null;
        }
    }

    public static void main(String[] args) {
        // Creating head of the Linked list
        Node head = new Node(1);
        System.out.println("The value at head is " + head.value);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/DSACPR107)