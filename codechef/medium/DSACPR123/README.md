# DSACPR123

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Insertion in Doubly Linked List

In this section, we will learn how to do the insertion operation in a doubly linked list.

Let's suppose you need to insert a node `newNode` between node `A` and node `B`, the pointers we need to update are:

- next pointer of A
- prev pointer of B
- next and prev pointer of newNode

Complete the function  **insertAtIndex(int index, int value)**  where `index` denotes that you need to insert a new node after the `index-1`th element, i.e., at the `index`th position.

Note: In case of `index`, 0-based indexing is used, i.e., for  **insertAtIndex(0, k)**  node with value `k` is to be inserted in the beginning.

### Video Explanation
### Constraints
- $1 \leq N \leq 1000$
- $0 \leq Index \leq N - 1$
- $-10^9 \leq Value \leq 10^9$
- $-10^9 \leq Node Value \leq 10^9$
### Sample 1:
Input
Output

```
5 2 99
1 2 3 4 5
```

```
1 2 99 3 4 5
```

### Explanation:

Original linkedlist if lenght 5: 1 2 3 4 5
Inserting 99 at the index 2 results in linkedlist: 1 2 99 3 4 5

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-22T15:27:06.317Z  

```java
 class LinkedList {
    Node head;

    public void insertAtIndex(int index, int value) {
        Node newNode = new Node(value);

        if (index == 0) {
            newNode.next = head;
            if (head != null) {
                head.prev = newNode;
            }
            head = newNode;
        } else {
            Node iter = head;
            for (int i = 0; i < index - 1; i++) {
                iter = iter.next;
            }

            Node A = iter;
            Node B = iter.next;

            A.next = newNode;
            if (B != null) {
                B.prev = newNode;
            }

            newNode.next = B;
            newNode.prev = A;
        }
    }

    public void printValues() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DSACPR123)