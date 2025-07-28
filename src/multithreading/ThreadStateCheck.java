package multithreading;



public class ThreadStateCheck extends Thread {

    @Override
    public void run() {
        // Simulate some work
        for (int i = 1; i <= 3; i++) {
            System.out.println("Working... " + i);
            try {
                Thread.sleep(500); // 0.5 second delay
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }

    public static void main(String[] args) {
        ThreadStateCheck thread = new ThreadStateCheck();

        System.out.println("Before start: " + thread.isAlive()); // false

        thread.start();
        System.out.println("After start: " + thread.isAlive());  // true (most likely)

        try {
            thread.join(); // wait for thread to finish
        } catch (InterruptedException e) {
            System.out.println("Join interrupted");
        }

        System.out.println("After join: " + thread.isAlive());   // false
    }
}
