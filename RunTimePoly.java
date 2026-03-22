package automationbatch;

class ParentClass
{
	void login()
	{
		System.out.println("Login using mobile number");
	}
}

public class RunTimePoly extends ParentClass {
	
	void login()
	{
		System.out.println("Login using email id");
	}

	public static void main(String[] args) {
		
		
		RunTimePoly r1 = new RunTimePoly();
		r1.login();

	}

}
