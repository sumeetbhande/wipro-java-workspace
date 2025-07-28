package javaFundamentals;

public class Exercise7point2 {
    // Instance variables (not initialized)
    byte myByte;
    short myShort;
    int myInt;
    long myLong;
    float myFloat;
    double myDouble;
    char myChar;
    boolean myBoolean;

    public void printDefaults() {
        System.out.println("Default byte: " + myByte);
        System.out.println("Default short: " + myShort);
        System.out.println("Default int: " + myInt);
        System.out.println("Default long: " + myLong);
        System.out.println("Default float: " + myFloat);
        System.out.println("Default double: " + myDouble);
        System.out.println("Default char: [" + myChar + "]");  // may appear as empty
        System.out.println("Default boolean: " + myBoolean);
    }

    public static void main(String[] args) {
    	Exercise7point2 obj = new Exercise7point2();
        obj.printDefaults();
    }
}
