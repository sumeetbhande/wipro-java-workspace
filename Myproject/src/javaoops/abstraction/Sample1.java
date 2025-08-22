package javaoops.abstraction;

abstract class RBI {
    void educationLoan() {
        System.out.println("Rate of Interest 5 %");
    }

    abstract void personalLoan(); 
}

class HDFC extends RBI {
    void personalLoan() {
        System.out.println("Rate of Interest 8%");
    }
}

class YesBank extends RBI {
    void personalLoan() {
        System.out.println("Rate of Interest 9%");
    }
}

public class Sample1 {
    public static void main(String[] args) {
        YesBank obj = new YesBank();
        obj.educationLoan();   // from RBI
        obj.personalLoan();    // overridden in YesBank
    }
}
