package wrapperClasses;

public class ParseStringToPrimitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strInt = "123";
		String strDouble = "45.3";
		String strBoolean = "True";
		
		int parInt = Integer.parseInt(strInt);
		double parDouble = Double.parseDouble(strDouble);
		boolean parBoolean = Boolean.parseBoolean(strBoolean);
		
		System.out.println(parInt);
		System.out.println(parDouble);
		System.out.println(parBoolean);
		
		System.out.println("Value: " + parInt + ", Type: " + ((Object)parInt).getClass().getSimpleName());
        System.out.println("Value: " + parDouble + ", Type: " + ((Object)parDouble).getClass().getSimpleName());
        System.out.println("Value: " + parBoolean + ", Type: " + ((Object)parBoolean).getClass().getSimpleName());
    }
		

	}


