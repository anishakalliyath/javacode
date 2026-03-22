package newpackage;

import java.util.Arrays;

public class Array3 {

	public static void main(String[] args) {
		 int[]a=new int[4];
		 a[0]=12;
		 a[1]=12;
		 a[2]=12;
		 a[3]=12;
		 
		 
		 int[]b =new int[a.length];
		  b[0]=10;
		  b[1]=10;
		  b[2]=10;
		  b[3]=10;
		  
		  boolean b1 = Arrays.equals(a, b);
		  System.out.println(b1);
		  
		  if(b1==true)
		  {
			  System.out.println("two are equal");
		  }
		  else
		  {
			  System.out.println(" two are not equal");
		  }
	}

}
