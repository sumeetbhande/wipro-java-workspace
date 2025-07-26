package multithreading;

public class RunnableCounter implements Runnable {

 @Override
 public void run() {
     for (int i = 1; i <= 10; i++) {
         System.out.println("Number: " + i);
         try {
             Thread.sleep(500); // optional: add small delay to see output clearly
         } catch (InterruptedException e) {
             System.out.println("Thread interrupted.");
         }
     }
 }

 public static void main(String[] args) {
     RunnableCounter counter = new RunnableCounter();
     Thread thread = new Thread(counter); // wrapping Runnable in a Thread
     thread.start(); // starting the thread
 }
}
