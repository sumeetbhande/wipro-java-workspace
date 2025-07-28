package multithreading;

class AnimalRace extends Thread {

    public AnimalRace(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " running " + i);
            try {
                // Sleep for a random time up to 1000 milliseconds
                Thread.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // good practice to re-interrupt
            }
        }
    }

    public static void main(String[] args) {
        new AnimalRace("Tortoise").start();
        new AnimalRace("Rabbit").start();
        new AnimalRace("Dog").start();
    }
}

