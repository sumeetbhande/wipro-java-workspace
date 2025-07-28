package multithreading;

public class CountdownTimer extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 10; i >= 1; i--) {
                System.out.println("Countdown: " + i);
                Thread.sleep(1000);  // Sleep for 1 second
            }
            System.out.println("Time’s up!");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();  // Restore interrupt status
            System.out.println("Countdown interrupted");
        }
    }

    public static void main(String[] args) {
        new CountdownTimer().start();
    }
}

