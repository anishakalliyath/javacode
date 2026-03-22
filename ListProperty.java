package automationbatch;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListProperty {

	public static void main(String[] args) {
		 
		List <Integer>l1 = new ArrayList<Integer>();
		
		l1.add(23);
		l1.add(24);
		l1.add(25);
		l1.add(26);
		l1.add(27);
	System.out.println(l1);
	
	Iterator<Integer>i1 =l1. iterator();
	 while(i1.hasNext())
	 {
		 System.out.println(i1.next());
	 }
	 
	 ListIterator<Integer>i2 =l1.listIterator();
	 while(i2.hasNext())
	 {
		System.out.println(i2.next()); 
	 }
	 
	 while(i2.hasPrevious())
	 {
		 System.out.println(i2.previous());
	 }
	}

}
