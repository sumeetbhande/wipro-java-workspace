package multithreading;


public class MyPrinterThread extends Thread {

 public void run() {
     for (int i = 0; i < 5; i++) {
         System.out.println("Hello from Thread!");
         try {
             Thread.sleep(1000); // delay of 1 second
         } catch (InterruptedException e) {
             System.out.println("Thread was interrupted.");
         }
     }
 }

 public static void main(String[] args) {
     MyPrinterThread t1 = new MyPrinterThread();
     t1.start(); // start the thread
 }
}
