# OPJA201

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-17T05:57:06.239Z  

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

[View on CodeChef](https://www.codechef.com/problems/OPJA201)