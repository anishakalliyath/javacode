package newpackage;

import java.util.Arrays;

public class NewClass {
	
	public static void main(String[]args)
	{
		String k1="testing";
		
		String[]k2=k1.split("t",2);
		
		System.out.println(Arrays.toString(k2));
		
		String k3 =k1.repeat(5);
		System.out.println(k3);
		
		Boolean b1 = k1.isBlank();
		System.out.println(b1);
		
		int b2 =k1.lastIndexOf("t");
		System.out.println(b2);
		
		int b3 =k1.indexOf("g");
		System.out.println(b3);
	}

}
