package multithreading;

class Buffer {
    private int data;
    private boolean available = false;

    // Producer adds data to the buffer
    synchronized void produce(int value) {
        while (available) {
            try {
                wait();  // wait if buffer is full
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        data = value;
        System.out.println("Produced: " + data);
        available = true;
        notify();  // notify consumer waiting on this object
    }

    // Consumer takes data from the buffer
    synchronized void consume() {
        while (!available) {
            try {
                wait();  // wait if buffer is empty
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Consumed: " + data);
        available = false;
        notify();  // notify producer waiting on this object
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        Buffer b = new Buffer();

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                b.produce(i);
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                b.consume();
            }
        });

        producer.start();
        consumer.start();
    }
}
