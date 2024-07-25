package InterfacPackage;

import NewPackage.AddInterface;
import NewPackage.Additional;

public class Class implements AddInterface, Additional{

	public static void main(String[] args) {
		
		AddInterface a = new Class();
		a.red();
		a.green();
		a.yellow();
		Class c=new Class();
		c.alert();
		// TODO Auto-generated method stub
		Additional ad=new Class();
		ad.signboard();
	}

	@Override
	public void red() {
		// TODO Auto-generated method stub
		System.out.println("This is red");
	}

	@Override
	public void green() {
		
		System.out.println("This is Green");
	
	}
	@Override
	public void yellow() {
	System.out.println("This is Yellow");	// TODO Auto-generated method stub
		
	}
	public void alert() {
		
		System.out.println("You need to stop on alert");
	}

	@Override
	public void signboard() {
		System.out.println("when sign board is shown");
		System.out.println("when sign board is shown1");
		System.out.println("when sign board is shown2");
		
	}

}
