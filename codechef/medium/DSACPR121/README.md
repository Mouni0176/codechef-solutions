# DSACPR121

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Deletion in Circular Linked List

Let's learn how to delete an element given its value from a Circular Linked-list.

The steps to delete a node with value are very similar to that of Singly Linked-list.

There are two cases:

- The list only contains one element (head = tail) and it is the element to be deleted: Assign both head and tail as null (Yes, that's it).
- Otherwise : Check if the first value is the value to be deleted If yes, set head to second element and set tail's next to the new head Now iterate over the linked list till you reach the tail check if the next node is target If it is, set current node's next to the next of the next node and break.

Note - Do consider when the element to be deleted is not present in the list. In that case, output the list as it is.

### Video Explanation
### Task

Study the function  **deleteNode**  in the IDE. After you have understood all the steps, delete the code and try to write it down yourself, to ensure that you have actually understood it. You can always check the solution if you are not able to figure something out.

### Constraints
- $1 \leq N \leq 1000$
- $-10^9 \leq A_i \leq 10^9$
- $-10^9 \leq X \leq 10^9$
### Sample 1:
Input
Output

```
5 2
1 2 3 4 5
```

```
1 3 4 5
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-22T14:23:30.864Z  

```java

void deleteNode(int value) {
    // If there is only one element and it is the value to be deleted, remove it    
    if (head == tail && head.value == value) {
        head = null;
        tail = null;
        return;
    }

    // if the target is at head set head to second element and set tail's next to the new head
    Node iter = head;
    if (head.value == value) {
        head = head.next;
        tail.next = head;
        return;
    }
    
    // Now iterate over the linked list till you reach the tail and check if the next node is target
    while (iter.next != null && iter != tail) {
        if (iter.next.value == value) {
            // If we found the value
            // Set current node's next to the next of the next node
            iter.next = iter.next.next;
            
            // And break
            break;
        }
        iter = iter.next;
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DSACPR121)