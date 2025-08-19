package wrapperClasses;

public class PrimitiveWrapperConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 10;
		double d = 45.3;
		char c = 'd';
		
		Integer iobj = Integer.valueOf(i);
		Double dobj = Double.valueOf(d);
		Character cobj = Character.valueOf(c);
		
		int ia = iobj.intValue();
		double da = dobj.doubleValue();
		char ca = cobj.charValue();
		
		System.out.println(i);
		System.out.println(iobj);
		System.out.println(ia);
		
		System.out.println(d);
		System.out.println(dobj);
		System.out.println(da);
		
		System.out.println(c);
		System.out.println(cobj);
		System.out.println(ca);

	}

}
