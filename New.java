package newpackage;

import java.util.Arrays;

public class New {

	public static void main(String[] args) {
		
		String input1 = "saw";
		String input2 = "was";
		
		char[] c1 = input1.toCharArray();
		char []c2 = input2.toCharArray();
		
		
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		 
		if(Arrays.equals(c1, c2))
		{
			System.out.println("Its anagram");
			
		}
		else
		{
			System.out.println("not anagram");
		}
		

	}

}
