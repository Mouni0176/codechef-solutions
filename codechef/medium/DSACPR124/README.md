# DSACPR124

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Deletion - Doubly Linked List

In this section, we will learn how to do the deletion operation in a doubly linked list.

Let's suppose you need to delete the node `target` between node `A` and node `B`, the pointers we need to update are:

- next pointer of A
- prev pointer of B
- head pointer if target is the head

Complete the function delete(int val) where `val` denotes the value of the node to be deleted.

### Video Explanation

 ***Do not make changes anywhere else in the code except this function** *

### Constraints
- $1 \leq N \leq 1000$
- $-10^9 \leq Node Value \leq 10^9$
- All node values are distinct.
- The value to be deleted is guaranteed to be present in the linked list.
### Sample 1:
Input
Output

```
5 3
1 2 3 4 5
```

```
1 2 4 5
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-22T15:56:04.030Z  

```java
void deleteNode(int value) {
    Node targetNode = head;
    while (targetNode != null && targetNode.value != value) {
        targetNode = targetNode.next;
    }

    if (targetNode == null)
        return;

    // Update A and B
    Node A = targetNode.prev;
    Node B = targetNode.next;

    // A could be null if target is head
    if (A != null) {
        A.next = B;
    }

    // B could be null if target is tail
    if (B != null) {
        B.prev = A;
    }

    if (targetNode == head) {
        head = B;
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/DSACPR124)