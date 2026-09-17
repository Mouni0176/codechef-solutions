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
