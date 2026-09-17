# OPJA193

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Coding Problem

Develop a Java program that simulates a producer-consumer scenario involving a shared resource, with the goal of understanding and implementing thread synchronization and coordination. The program should consist of two main components: producers and consumers.

Specifications:

- Create a SharedResource class that represents the shared resource. This class should include: A method produce that allows producers to add items to the resource. A method consume that allows consumers to remove items from the resource. Proper synchronization mechanisms to prevent race conditions.
- Implement a Producer class that extends the Thread class. Each producer should: Use the produce method of the SharedResource class to add items. Print a message when an item is produced.
- Implement a Consumer class that extends the Thread class. Each consumer should: Use the consume method of the SharedResource class to remove items. Print a message when an item is consumed.
- In the main program (e.g., MainClass), create an instance of the SharedResource class.
- Start the producer and consumer threads to simulate the interaction between producers and consumers.
- Ensure that producers do not produce items when the shared resource is full, and consumers do not consume items when it is empty.

Example Output:

```
Producer produced
Consumer consumed

```

### Task

Complete the code to demonstrate synchronization between producers and consumers, avoiding race conditions and ensuring that items are produced and consumed in the correct order.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-17T06:03:07.948Z  

```java
class SharedResource {
    private boolean isProduced = false;

    synchronized void produce() {
        if (isProduced) {
            try {
                wait(); // Wait for the consumer to consume the item
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Producer produced");
        isProduced = true;
        notify();
    }

    synchronized void consume() {
        if (!isProduced) {
            try {
                wait(); // Wait for the producer to produce an item
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumer consumed");
        isProduced = false;
        notify();
    }
}

class Codechef {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread producerThread = new Thread(new Runnable() {
            public void run() {
                sharedResource.produce();
            }
        });

        Thread consumerThread = new Thread(new Runnable() {
            public void run() {
                sharedResource.consume();
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/OPJA193)