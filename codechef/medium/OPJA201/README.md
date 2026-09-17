# OPJA201

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Coding Problem

You are tasked with creating a Java program that demonstrates the use of multi-threading and the `interrupt` method. Your program should perform the following tasks:

- Create an empty list to store integers.
- Create a thread, let's call it the "InsertThread," which inserts elements into the list.
- The "InsertThread" should insert elements into the list until its size is not more than 5.
- Each time an element is inserted into the list, it should be printed to the console, indicating the element's value.
- The "InsertThread" should simulate some work between insertions. You can do this by making it sleep for 5 ms after inserting each element.
- In the main thread, monitor the size of the list. When the list size is not more than 5, use the interrupt method to stop the "InsertThread."
- Ensure that the "InsertThread" responds to the interruption gracefully, by exiting the insertion loop when interrupted.

Expected Output

```
Adding element: 1
Adding element: 2
Adding element: 3
Adding element: 4
Adding element: 5

```

### Task

Your task is to complete the source code to demonstrate handling of thread interruptions..

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-17T05:59:22.140Z  

```java
import java.util.ArrayList;
import java.util.List;

class Codechef {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Runnable task = new InsertTask(list);

        Thread thread = new Thread(task);
        thread.start();

        // Sleep for a while to allow the thread to execute
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Interrupt the thread when the list size exceeds 
        if (list.size() >= 5) {
            thread.interrupt();
        }
    }
}

class InsertTask implements Runnable {
    private List<Integer> list;

    public InsertTask(List<Integer> list) {
        this.list = list;
    }

    public void run() {
        int value = 1;
        while (!Thread.currentThread().isInterrupted() && list.size() < 5) {
            System.out.println("Adding element: " + value);
            list.add(value);
            value++;
            try {
                Thread.sleep(5); // Simulate some work
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restore interrupted status
            }
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/OPJA201)