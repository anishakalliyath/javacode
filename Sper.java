package newpackage;

import java.util.Scanner;

public class Sper
{


	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the value of a");
		
		int a = s1.nextInt();
		
		System.out.println("ENter the value of b");
		
		int b = s1.nextInt();
		
	
		
		System.out.println("the valus of c is");
		int c = a+b;
		System.out.println(c);
		s1.close();
	}

}
