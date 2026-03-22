package automationbatch;


class K2
{
	K2()
	{
		System.out.println("COmstructor 1");
	}
	K2 (int a)
	{
		
		this ();
		System.out.println("Constructor 2");
}
}

public class K1 extends K2
{
	
	
	K1()
	{
		super(100);
		System.out.println("Constructor 3");
	}
 K1 (int a)
{
	 
	 this();
	System.out.println("Constructor 4");
}
 
 public static void main(String[]args)
 {
	 new K1(100);
 
}
}

