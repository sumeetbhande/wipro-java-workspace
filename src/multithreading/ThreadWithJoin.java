package multithreading;

public class ThreadWithJoin extends Thread {

 public void run() {
     for (int i = 1; i <= 5; i++) {
         System.out.println("Thread1: " + i);
         try {
             Thread.sleep(1000); // 1-second delay
         } catch (InterruptedException e) {
             System.out.println("Thread1 interrupted.");
         }
     }
 }

 public static void main(String[] args) {
     ThreadWithJoin t1 = new ThreadWithJoin();
     t1.start();

     try {
         t1.join(); // main thread waits for t1 to finish
     } catch (InterruptedException e) {
         System.out.println("Main thread interrupted.");
     }

     System.out.println("Main thread done.");
 }
}
