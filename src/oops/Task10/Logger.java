package oops.Task10;

interface Logger {
    // Default method
    default void logInfo() {
        System.out.println("INFO: Application is running smoothly.");
    }

    // Static method
    static void logError() {
        System.out.println("ERROR: Something went wrong!");
    }
}
