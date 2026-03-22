package automationbatch;

import java.util.ArrayList;

public class CompareArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(12);
		a1.add(13);
		a1.add(14);
		a1.add(15);
		System.out.println(a1);
		
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(12);
		a2.add(13);
		a2.add(14);
		a2.add(15);
		System.out.println(a2);
		
		Boolean b1 = a1.equals(a2);
		System.out.println(b1);
	}

}
