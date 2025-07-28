package multithreading;

public class ThreadPriorityDemo extends Thread {

    public ThreadPriorityDemo(String name) {
        super(name); // Set thread name
    }

    @Override
    public void run() {
        System.out.println(getName() + " is running with priority: " + getPriority());
    }

    public static void main(String[] args) {
        ThreadPriorityDemo t1 = new ThreadPriorityDemo("Low Priority Thread");
        ThreadPriorityDemo t2 = new ThreadPriorityDemo("Normal Priority Thread");
        ThreadPriorityDemo t3 = new ThreadPriorityDemo("High Priority Thread");

        // Set priorities
        t1.setPriority(Thread.MIN_PRIORITY);   // 1
        t2.setPriority(Thread.NORM_PRIORITY);  // 5
        t3.setPriority(Thread.MAX_PRIORITY);   // 10

        // Start threads
        t1.start();
        t2.start();
        t3.start();
    }
}
