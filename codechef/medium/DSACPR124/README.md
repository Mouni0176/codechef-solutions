# DSACPR124

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-22T15:27:09.150Z  

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

[View on CodeChef](https://www.codechef.com/problems/DSACPR124)