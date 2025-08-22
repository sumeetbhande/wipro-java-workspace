package javaoops.interfce;

interface MicroPhone{
	void Volume();
}

public class Sample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MicroPhone obj= new MicroPhone() {
			@Override
			public void Volume() {
				// TODO Auto-generated method stub
				System.out.println("Volume is High !!!");
			}
	};
	obj.Volume();

}
}