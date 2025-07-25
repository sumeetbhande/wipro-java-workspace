package oops.Task10;

public class MainApp {
    public static void main(String[] args) {
        // Create AppLogger object
        AppLogger logger = new AppLogger();

        // Call default method using object
        logger.logInfo();

        // Call static method using interface name
        Logger.logError();
    }
}
