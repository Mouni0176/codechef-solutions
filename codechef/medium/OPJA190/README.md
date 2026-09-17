# OPJA190

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Multiple Choice Question

Which method is used to wake up all waiting threads on an object in Java?

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-17T06:01:08.257Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/OPJA190)