# OPJA188

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Wait and Notify method in Java

In Java, wait() and notify() are methods used for inter-thread communication and synchronization. They are typically used in scenarios where one thread needs to wait for another thread to perform a specific task before it can continue its execution.

Here's a simple example demonstrating the use of wait() and notify():

- We have two threads, thread1 and thread2.
- thread1 acquires the lock, prints a message indicating it's waiting, and then calls lock.wait(), which makes it wait for a notification.
- thread2 acquires the lock, does some work, and then calls lock.notify(), which sends a notification to thread1.
- When thread1 receives the notification, it prints a message indicating it has been notified.
- Both threads start, and thread2 notifies thread1, allowing it to proceed after the notification.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-17T06:00:46.824Z  

```java
class Codechef {
    public static void main(String[] args) {
        final Object lock = new Object();

        // Thread 1
        Thread thread1 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread 1 is waiting...");
                try {
                    lock.wait(); // Thread 1 waits for a notification
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1 has been notified.");
            }
        });

        // Thread 2
        Thread thread2 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread 2 is doing some work...");
                lock.notify(); // Thread 2 sends a notification
                System.out.println("Thread 2 has sent a notification.");
            }
        });

        thread1.start();
        thread2.start();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/OPJA188)