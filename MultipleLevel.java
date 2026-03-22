package automationbatch;

interface I3
{
	void method3();
}
 interface I4
 {
	 void method4();
	 
 }
public class MultipleLevel implements I3,I4
{

	public static void main(String[]args)
	{
		MultipleLevel h1 = new MultipleLevel();
		h1.method3();
	}

	
	public void method4() {
		
		System.out.println("Method 4");
		
		
	}

	
	public void method3() {
		System.out.println("Method 3");
		
		
	}
}
