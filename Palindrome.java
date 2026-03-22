package newpackage;

public class Palindrome {

	public static void main(String[] args) {
		String input = "noon";
		String reverse ="";
		
		char[]c1 = input.toCharArray();
		
		for(int i=0;i<=3;i++)
		{
			char c2 =c1[i];
			reverse = reverse+c2;
		}
			System.out.println(reverse);
		
if(input.equals(reverse))
{
	System.out.println("Palindrome");
}
else
{
	System.out.println("Not palindrome");
}
	}

}
