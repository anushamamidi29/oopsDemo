package com.valuemomentum.traning.collections;
import java.util.*; 
public class Student5 { 
    int rollno; 
    String name,address; 
     
    //generating constructors 
    public Student5(int rollno, String name, String address) { 
        super(); 
        this.rollno = rollno; 
        this.name = name; 
        this.address = address; 
    } 
  
    @Override//used to print student properties in main when object is given in sop 
    public String toString() { 
        return "Student5 [rollno=" + rollno + ", name=" + name + ", address=" + address + "]"; 
    } 
} 
  
class SortByRoll implements Comparator{ 
  
    public int compare(Student5 s1, Student5 s2) { 
        return s1.rollno-s2.rollno; 
    }

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	} 
     
} 
class SortByName implements Comparator{ 
  
    public int compare(Student5 s1, Student5 s2) { 
         
        return s1.name.compareTo(s2.name); 
    }

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	} 
     
}