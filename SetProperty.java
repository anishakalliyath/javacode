package automationbatch;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetProperty {

	public static void main(String[] args) {
		Set<Character> s1 = new HashSet<Character>();
		
		s1.add('M');
		s1.add('N');
		s1.add('O');
		s1.add('P');
		
		System.out.println(s1);
		
		Iterator<Character>i1=s1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}

	}

}
