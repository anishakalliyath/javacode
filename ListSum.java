package automationbatch;

import java.util.ArrayList;
import java.util.List;

public class ListSum {

	public static void main(String[] args) {
		
		List<Integer> l1 = new ArrayList<Integer>();
		
		l1.add(10);
		l1.add(11);
		l1.add(12);
		l1.add(13);
		l1.add(15);
		System.out.println(l1);
		
		double sum = 0;
		
		for(int i=0;i<l1.size();i++)
		{
			sum = sum+l1.get(i);
		}
System.out.println(sum);
	}

}
