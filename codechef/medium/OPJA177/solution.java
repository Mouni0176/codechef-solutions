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