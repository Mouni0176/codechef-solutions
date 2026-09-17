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
