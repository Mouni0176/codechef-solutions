# OPJA200

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Coding Problem

You are given a list of integers, and your task is to implement a Java program that multiplies each element of the list by 2 and stores the results in a new list. However, to make the program more efficient, you decide to use multi-threading. You will create two threads, one for even indices and one for odd indices in the list, to process the elements concurrently.

Write a Java program to solve this problem. Your program should have the following components:

- Create a class named Multiplier that extends the Thread class.
- Implement the run method in the Multiplier class. Inside the run method, you should process the elements at even or odd indices and store the results in a shared output list.
- The Multiplier class should have a constructor that takes the input list, the starting index, and the step size as parameters.
- In the main program, create two Multiplier threads, one for even indices and one for odd indices.
- Start both threads and wait for them to finish.
- Finally, print the output list.

 **Expected Output:** 

```
Output List: [2, 4, 6, 8, 10, 12]

```

### Task

In this template, you need to complete the `Multiplier` class to perform the multiplication while using the `yield` method for thread cooperation.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-17T05:57:02.515Z  

```java
import java.util.ArrayList;
import java.util.List;

class Multiplier extends Thread {
    private List<Integer> inputList;
    private List<Integer> outputList;
    private int startIndex;

    public Multiplier(List<Integer> inputList, List<Integer> outputList, int startIndex) {
        this.inputList=inputList;
        this.outputList=outputList;
        this.startIndex=startIndex;
        
    }

    @Override
    public void run() {
        for(int i=startIndex;i<inputList.size();i+=2){
            int value = inputList.get(i)*2;
            outputList.set(i,value);
            Thread.yield();
        }
    }
}

class Codechef {
    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>();
        List<Integer> outputList = new ArrayList<>();

        // Initialize the inputList
        for (int i = 1; i <= 6; i++) {
            inputList.add(i);
        }

        // Initialize the outputList with the same size as the inputList
        for (int i = 0; i < 6; i++) {
            outputList.add(0);
        }

        Multiplier evenMultiplier = new Multiplier(inputList, outputList, 0);
        Multiplier oddMultiplier = new Multiplier(inputList, outputList, 1);

        evenMultiplier.start();
        oddMultiplier.start();

        try {
            evenMultiplier.join();
            oddMultiplier.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the outputList
        System.out.println("Output List: " + outputList);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/OPJA200)