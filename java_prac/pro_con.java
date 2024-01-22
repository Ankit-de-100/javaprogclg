import java.util.LinkedList;

class SharedResource {
    private LinkedList<Integer> buffer = new LinkedList<>();
    private int capacity = 5;

    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (this) {
                while (buffer.size() == capacity) {
                    wait(); // Wait if the buffer is full
                }

                System.out.println("Producer produced: " + value);
                buffer.add(value++);

                notify(); // Notify the consumer that an item is produced
                Thread.sleep(1000); // Simulating some work
            }
        }
    }

    public void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                while (buffer.isEmpty()) {
                    wait(); // Wait if the buffer is empty
                }

                int consumedValue = buffer.removeFirst();
                System.out.println("Consumer consumed: " + consumedValue);

                notify(); // Notify the producer that an item is consumed
                Thread.sleep(1000); // Simulating some work
            }
        }
    }
}

public class Pro_con {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        // Creating producer and consumer threads
        Thread producerThread = new Thread(() -> {
            try {
                sharedResource.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumerThread = new Thread(() -> {
            try {
                sharedResource.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Starting the threads
        producerThread.start();
        consumerThread.start();
    }
}
