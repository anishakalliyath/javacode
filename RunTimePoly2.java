package automationbatch;
class BiggClass
{
	void login()
	{
		System.out.println("Login using mobile number");
	}
}

public class RunTimePoly2 extends BiggClass{
		
		void login()
		{
			System.out.println("Login using email id");
		}

		public static void main(String[] args) {
			
			if(1>1)
			{			
			RunTimePoly r1 = new RunTimePoly();
			r1.login();
			}
			
			else
				
			{
				BiggClass p1 = new BiggClass();
				p1.login();
			}

		}
}

	
