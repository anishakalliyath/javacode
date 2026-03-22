package newpackage;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		int[]a1= new int[4];
		a1[0]=10;
		a1[1]=20;
		a1[2]=30;
		a1[3]=40;
		
		


try
{
	a1[4]=10;
	
}

catch(ArrayIndexOutOfBoundsException e)
{
	System.out.println("Handled the exception" +e);
}

System.out.println(Arrays.toString(a1));
	}

}
