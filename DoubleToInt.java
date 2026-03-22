package automationbatch;



import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class DoubleToInt {

	public static void main(String[] args) {
		Vector<Integer> a1= new Vector<Integer>();
		a1.add(12);
		a1.add(22);
		a1.add(32);
		a1.add(42);
		
		System.out.println(a1);
	Iterator<Integer>i1 = a1.iterator();
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		ListIterator<Integer>i2 = a1.listIterator();
		
		while(i2.hasPrevious())
		{
			System.out.println(i2.previous());
		}
}
}