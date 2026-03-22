package automationbatch;

interface I1
{
	void method1();
	void method();
}


abstract class AB1 implements I1
{
	abstract void login1();
	abstract void login2();
	
	void login3()
	{
		System.out.println("Login 3");
	}
	
	void login4()
	{
		System.out.println("Login 4");
	}
}

public class Combination extends AB1 {
	
	static void add()
	{
		System.out.println("Addition");
		
	}
	 static void sub()
	 {
		 
		 System.out.println("Subtraction");
	 }
	 
	 public static void main (String[]args)
	 {
		 add();
		 sub();
	 }
	 
	 public void method1() {
		
		
	 }
	  public void method() {
		
		
	 }
	
	 void login1() {
		
	 }
	 
	 void login2() {
		
	 }
	

}
