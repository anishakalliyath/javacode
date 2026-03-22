package automationbatch;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionInterface {

	public static void main(String[] args) {
		
		Collection<Integer> c1 = new ArrayList<Integer>();
		
		c1.add(90);
		c1.add(91);
		c1.add(92);
		c1.add(93);
		c1.add(94);
System.out.println(c1);

Iterator<Integer>i1 = c1.iterator();

while(i1.hasNext())
{
	System.out.println(i1.next());
}

	}

}
