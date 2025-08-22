package javathreads;

class Task1 implements Runnable {
    Task1() {
        System.out.println("Constructor Thread: " + Thread.currentThread().getName() + ", State: " + Thread.currentThread().getState());
    }

    public void run() {
        System.out.println("Thread: " + Thread.currentThread().getName() + ", State: Running");
        for (int i = 4; i > 0; i--) {
            System.out.println("Thread: " + Thread.currentThread().getName() + ", Count: " + i);
            try {
                Thread.sleep(200); // optional delay
            } catch (InterruptedException e) {
                System.out.println("Interrupted: " + e.getMessage());
            }
        }
        System.out.println("Thread: " + Thread.currentThread().getName() + ", State: Dead");
    }
}

public class ThreadsJoin {
    public static void main(String[] args) {
        Thread tObj1 = new Thread(new Task1(), "Scanning...");
        Thread tObj2 = new Thread(new Task1(), "Printing...");
        Thread tObj3 = new Thread(new Task1(), "Counting...");

        tObj1.start();
        try {
            tObj1.join();
        } catch (InterruptedException e) {
            System.out.println("Join interrupted: " + e.getMessage());
        }

        tObj2.start();
        try {
            tObj2.join();
        } catch (InterruptedException e) {
            System.out.println("Join interrupted: " + e.getMessage());
        }

        tObj3.start(); // previously you mistakenly repeated tObj2
        try {
            tObj3.join();
        } catch (InterruptedException e) {
            System.out.println("Join interrupted: " + e.getMessage());
        }
    }
}
