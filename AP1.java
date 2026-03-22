package automationbatch;

abstract class AB3
{
	abstract void add();
	abstract void sub();
}

abstract class AB2 extends AB3
{
	abstract void div();
	
	void mul()
	{
		System.out.println("Multiplication");
	}
}

public class AP1 extends AB2{
	
	static void mod()
	{
		System.out.println("Mod");
	}
	public static void main (String[]args)
	{
		AP1 b1 = new AP1();
		b1.div();
		b1.mul();
		b1.add();
		b1.sub();
	}
	
	void div() {
		
		System.out.println("division");
	}
	
	void add() {
		
		System.out.println("addition");
		
		
	}
	
	void sub() {
		System.out.println("subtraction");
	}
	

}
