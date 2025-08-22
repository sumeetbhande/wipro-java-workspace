package javaeightinterface.lambda;

interface FuncInterface{
	void  abstractFun (int x);
	
	default void func() {
		System.out.println("default function...");
	}
}

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     FuncInterface obj = (int x) -> System.out.println(2*x);
     obj.abstractFun(5);
	}

}
