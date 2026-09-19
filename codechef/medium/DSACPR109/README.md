# DSACPR109

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Insertion in Linked List

Let's learn about inserting new elements at the beginning of a linked list.

Now, suppose we have a linked list `1 -> 2 -> 3` and we want to insert 4 at the beginning. We can then follow these steps:

- Create a new node with value 4. Let's call it newNode
- Add the head of the existing linked list as the next of newNode.
- Then set the head variable to the newNode, as the newNode is our new head.
### Implementation

To implement insertion operation, we have to create a new class  **LinkedList**  and create a new method  **insertFront**  in it.

We have also added  **getHeadValue**  to get the value at head after insertion.

Read and understand the code and then submit to see what it does.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-19T09:20:59.226Z  

```java
class Node {
    public int value;
    public Node next;
    
    // Constructor to initialize the node with a given value
    public Node(int val) {
        value = val;
        next = null;
    }
}

class LinkedList {
    public Node head;
    
    public void insertFront(int value) {
        System.out.println("Inserting " + value);
        
        // Step 1: Create a new Node
        Node newNode = new Node(value);
        
        // Step 2: Set next of newNode to the current head
        newNode.next = head;
        
        // Step 3: Set newNode as the head
        head = newNode;
    }
    
    public int getHeadValue() {
        if (head == null) {
            return -1;
        } else {
            return head.value;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFront(3);
        System.out.println("The value at the head is: " + list.getHeadValue());
        
        list.insertFront(2);
        System.out.println("The value at the head is: " + list.getHeadValue());
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/DSACPR109)