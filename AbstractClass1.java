package automationbatch;

abstract class AbsClas1
{

abstract void method1();
}



public class AbstractClass1 extends AbsClas1 {
	
	public static void main (String[]args)
	{
		
		AbstractClass1 a1=new AbstractClass1();
		a1.method1();
	}
	
	
	void method1() {
		
		System.out.println("Print the logic");
		
	}
}


