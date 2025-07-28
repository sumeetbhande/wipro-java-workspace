package multithreading;

class Counters {
    int count = 0;
    void increment() {
        count++;
    }
}

public class NoSync {
    public static void main(String[] args) throws InterruptedException {
        Counters c = new Counters();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) c.increment();
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) c.increment();
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final Count (without sync): " + c.count);  // likely < 2000
    }
}
