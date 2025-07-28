package multithreading;

class Chat {
    private boolean turn = true;  // true means "Hi"'s turn, false means "Hello"'s turn

    synchronized void sayHi(String msg) {
        while (!turn) {  // wait if it's not Hi's turn
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();  // preserve interrupt status
            }
        }
        System.out.println("Hi: " + msg);
        turn = false;   // toggle turn to Hello
        notify();       // notify waiting thread
    }

    synchronized void sayHello(String msg) {
        while (turn) {   // wait if it's not Hello's turn
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();  // preserve interrupt status
            }
        }
        System.out.println("Hello: " + msg);
        turn = true;    // toggle turn to Hi
        notify();       // notify waiting thread
    }
}

public class ChatApp {
    public static void main(String[] args) {
        Chat chat = new Chat();

        Thread t1 = new Thread(() -> {
            chat.sayHi("How are you?");
            chat.sayHi("What’s up?");
        });

        Thread t2 = new Thread(() -> {
            chat.sayHello("I’m good!");
            chat.sayHello("Working on Java.");
        });

        t1.start();
        t2.start();
    }
}
