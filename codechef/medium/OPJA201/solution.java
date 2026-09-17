import java.util.ArrayList;
import java.util.List;

class Codechef {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Runnable task = new InsertTask(list);

        Thread thread = new Thread(task);
        thread.start();

        // Sleep for a while to allow the thread to execute
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Interrupt the thread when the list size exceeds 
        if (list.size() >= 5) {
            thread.interrupt();
        }
    }
}

class InsertTask implements Runnable {
    private List<Integer> list;

    public InsertTask(List<Integer> list) {
        this.list = list;
    }

    public void run() {
        int value = 1;
        while (!Thread.currentThread().isInterrupted() && list.size() < 5) {
            System.out.println("Adding element: " + value);
            list.add(value);
            value++;
            try {
                Thread.sleep(5); // Simulate some work
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restore interrupted status
            }
        }
    }
}
