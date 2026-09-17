# OPJA177

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Join method in Java

When you create a thread, you can later join it to wait for the thread to complete its execution.

Here's how you can join a thread in Java:

```
try {
    myThread.join();
} catch (InterruptedException e) {
    // Handle the InterruptedException, if necessary
}

```

In this example, the `join` method is called on the `myThread` instance, causing the main thread to wait for `myThread` to finish its execution. After the `join` call, the message "Thread has completed" will be printed once `myThread` has finished its work.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-17T05:21:33.376Z  

```java
class MyThread extends Thread {
    public void run() {
        // Your thread's code goes here
        System.out.println("Thread is running.");
    }
}

class Codechef {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        try {
            myThread.join();
        } catch (InterruptedException e) {
            // Handle the InterruptedException, if necessary
        }

        System.out.println("Thread has completed.");
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/OPJA177)