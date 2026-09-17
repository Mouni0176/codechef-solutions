# OPJA187

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Static Synchronization

In Java, you can achieve static synchronization by using the synchronized keyword on a static method or a synchronized block within a static method. Static synchronization is used to synchronize access to static methods or class-level variables, ensuring that only one thread can execute the synchronized code block at a time.

In the given example, we have a `Bank` class with a `totalBalance` (a static member) and a static synchronized method `withdraw` that allows account holders to withdraw money. The `withdraw` method checks if the withdrawal amount is valid and if there are sufficient funds in the bank.

Two `AccountHolder` objects (representing account holders) attempt to withdraw money concurrently using separate threads. The static synchronization on the `withdraw` method ensures that only one thread can withdraw money at a time, preventing race conditions and ensuring that the bank balance is updated correctly.

This example illustrates how static synchronization can be used to protect a shared resource (the bank balance) in a multi-threaded environment.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-17T06:00:17.033Z  

```java
class Bank {
    private static int totalBalance = 1000; // Initial bank balance

    public static synchronized void withdraw(int amount, String accountHolder) {
        if (amount <= 0) {
            System.out.println(accountHolder + " cannot withdraw a non-positive amount.");
            return;
        }

        if (amount > totalBalance) {
            System.out.println(accountHolder + " cannot withdraw " + amount + " due to insufficient funds.");
        } else {
            totalBalance -= amount;
            System.out.println(accountHolder + " has withdrawn " + amount + ". Remaining balance: " + totalBalance);
        }
    }
}

class AccountHolder implements Runnable {
    private String name;

    public AccountHolder(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            int withdrawalAmount = (i + 1) * 100;
            Bank.withdraw(withdrawalAmount, name);
        }
    }
}

class Codechef {
    public static void main(String[] args) {
        Thread accountHolder1 = new Thread(new AccountHolder("Account Holder 1"));
        Thread accountHolder2 = new Thread(new AccountHolder("Account Holder 2"));

        accountHolder1.start();
        accountHolder2.start();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/OPJA187)