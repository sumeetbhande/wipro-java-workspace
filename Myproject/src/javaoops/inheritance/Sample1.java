package javaoops.inheritance;

// single level inheritance 
class A {
    int a = 10;
}

class B extends A {
    int result;
    int b = 20;

    // Constructor of class B
    B() {
        result = a + b;
        System.out.println(result);
    }
}

public class Sample1 {
    public static void main(String[] args) {
        B obj = new B(); // This will call the constructor and print the result
    }
}


