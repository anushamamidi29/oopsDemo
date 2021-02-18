package com.valuemomentum.traning.collections;

public class Student1 implements Comparable<Student1>{
	int rollno;
	String name;
	int age;
	public Student1(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	
	
	 public int compareTo(Student1 st) {
	        if(age==st.age)
	            return 0;
	        else if(age>st.age)
	            return 1;
	        else
	            return -1;
	    }
}