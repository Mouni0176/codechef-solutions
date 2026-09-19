# DSACPR110

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Linked List - Insertion at end

Insertion at end is fairly straightforward.

See the following steps:

- Make a new node with the desired value.
- Start at the head and move to the last node of the linked list.
- Insert the new node after the last node.

The only edge case is when there is no value in the linked list. In that case, we set the head of the linked list to the new node.

### Task

Complete the function  **insertAtEnd**  in IDE to insert an element at the end of a linked list. I have also added a new function  **getLastValue**  to print the last value of a linked list.

### Input Format

First line denotes 'n' the number of elements to be inserted in the list.
Second line consists of n space-separated integers denoting the elements to be added in the list.

### Output Format

The value at the end of the list after each insertion.

### Constraints
- $1 \leq N \leq 1000$
### Sample 1:
Input
Output

```
4
2 32 23 53
```

```
2 32 23 53
```

### Explanation:

Initially we have an empty linked list. After each step:

- 2
- 2->32
- 2->32->23
- 2->32->23->53

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-19T09:24:28.514Z  

```java
import java.util.Scanner;

class Main {

    private static class MyLinkedList {
        // This is the node class which is instantiated whenever we add a new element to the list
        private class node {
            int value;
            node next;

            public node(int val) {
                this.value = val;
                this.next = null;
            }
        }

        // Head pointer is stored to maintain beginning of the list
        node head;

        public MyLinkedList() {
            head = null; // NULL because initially the list is empty
        }

        public void insertAtEnd(int val) {

            node newnode = new node(val);

            if (this.head == null) {
                this.head = newnode;

            }
            else {
                node current = this.head;
                // Iterating towards the end of the list
                while (current.next != null) {
                    current = current.next;
                }
                
                // Update the next pointer of the this element
                current.next = newnode;
            }
        }

        public void print() {
            node temp = this.head;
            while (temp != null) {
                System.out.printf("%d ", temp.value);
                temp = temp.next;
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            list.insertAtEnd(value);
        }
        list.print();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DSACPR110)