package automationbatch;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayNullValue {

	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(12);
		a1.add(13);
		a1.add(14);
		a1.add(15);
		a1.add(null);
		System.out.println(a1);
		
		Iterator<Integer>i1 = a1.iterator();
		
		while(i1.hasNext())
		{
			if(i1.next()==null)
			{
				i1.remove();
			}
		}
		
		System.out.println(a1);
	}
}
				
		