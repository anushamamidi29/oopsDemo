package com.valuemomentum.traning.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("jim");
		al.add("jerry");
		al.add("john");
		al.add(1,"jive");
		System.out.println(al);
		System.out.println("Element at 2nd position:"+al.get(2));
		ListIterator<String> ltr=al.listIterator();
		
		System.out.println("Traverse Elements in forward direction");
		while(ltr.hasNext()) {
			System.out.println(ltr.next());
		}
		System.out.println("Traverse Elements in Backward direction");
		while(ltr.hasPrevious()) {
			System.out.println(ltr.previous());
		}
    
	}

}