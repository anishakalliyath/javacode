package automationbatch;

public class CompileTimePoly {
	
	
	static void add(int a,int b)
	{
		int add = a+b;
		
		System.out.println(add);
		}
	
	static void add(int a,double b)
	{
		double add = a+b;
		
		System.out.println(add);
	}
	
	static void add(double a,double b)
	{
		double add = a+b;
		
		System.out.println(add);
	}
	static void add(int a,int b,double c)
	{
		double add = a+b+c;
		
		System.out.println(add);
	}

	public static void main(String[] args) {
		
		add(3,5);
		add(5,2.2);
		add(1.2,2.3);
		add(9,3,4.4);
		

	}

}
