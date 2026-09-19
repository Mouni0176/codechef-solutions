# DSACPR106

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Linked List - Concept

Linked list is a linear data structure where each element is a separate object connected to each other and is similar to Arrays.

As you can see in the image, we maintain the Head pointer of the linked list and each node contains two fields:

- Value (Integer)
- Pointer to next node

The last node of a linked list is called Tail. The Tail's next pointer is NULL address indicating there is no element after it.

### Primary Operations
- Insertion: Inserting an element at end/beginning or in the middle at some kth position.
- Deletion : Deleting an element from the list.
- Display : Traversing the whole linked list and output each element.
### Implementation

Look at the code in the IDE to see how a linked list is implemented. We use a Node class for each node of the linked list. Submit the given code you don't need to change the code.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-19T09:16:22.835Z  

```java
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

[View on CodeChef](https://www.codechef.com/problems/DSACPR106)