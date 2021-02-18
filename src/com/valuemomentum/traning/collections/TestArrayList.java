package com.valuemomentum.traning.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {
    List <String> al= new ArrayList<String>();     // Create an arraylist
        al.add("anusha");
        al.add("mamidi");
		al.add("anusha");         //adding elements to ArrayList
		al.add("sha");
		
		//traverse elements using iterator
		Iterator<String> itr=al.iterator();
		  while(itr.hasNext()) {
			System.out.println(itr.next());
			
			}
		  System.out.println(al);
		  
		  System.out.println(al.get(1)); // get one particular element
		  System.out.println(al);
		  
		  al.add(2,"m.anusha"); // adding element in specified index
			System.out.println(al);

		  al.remove(3); //deleting element in specified index
		  System.out.println(al);
		  
		  al.set(3, "mamidi anusha");         // adding element in specified index
		  System.out.println(al);
		  
		  System.out.println("display using foreach ");
			for(String i:al) {
				System.out.println(i);
		}
	}
	
}

