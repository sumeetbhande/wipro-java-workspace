package javaFundamentals;

public class Exercise3point2 {
    public static void main(String[] args) {
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            System.out.println("Hello, User!");
        }
        System.out.println("Today is a great day to code Java!");
    }
}
//Compile the program: javac HelloMessageCommandLine.java
//Run with a name as argument:java HelloMessage Sumeet Bhande