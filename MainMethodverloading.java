package automationbatch;

public class MainMethodverloading {

	public static void main()
	{
		System.out.println("method 1");
	}
	public static void main(int a , int b)
	{
		System.out.println("method 2");
	}
	public static void main(int a,double b)
	{
		System.out.println("method 3");
	}
	public static void main(double a, double b)
	{
		System.out.println("method 4");
	}
	public  void main(double a,int b)
	{
		System.out.println("method 5");
	}
	
	public static void main(String[] args) {
		
		System.out.println("method 6");
		
		main();
		main(2,3);
		main(2,3.3);
		main(2.2,4.4);
		MainMethodverloading a1 = new MainMethodverloading();
		a1.main(2.3, 5);
		
		
	}

}
