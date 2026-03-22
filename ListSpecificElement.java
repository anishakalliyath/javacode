package automationbatch;

import java.util.ArrayList;
import java.util.List;

public class ListSpecificElement {

	public static void main(String[] args) {
		
		List <Integer>l1 = new ArrayList<Integer>();
		
		l1.add(90);
		l1.add(80);
		l1.add(70);
		l1.add(60);
		
	Boolean b1 =	l1.contains(80);
	System.out.println(b1);
	}

}
