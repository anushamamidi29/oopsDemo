package com.valuemomentum.traning.collections;

import java.util.ArrayList;

import java.util.Collections;

public class ComparableDemo {

	public static void main(String[] args) {
ArrayList<Student1> al=new ArrayList<Student1>();
al.add(new Student1(111,"anusha",21));
al.add(new Student1(102,"anusha",15));
al.add(new Student1(120,"anusha",19));
Collections.sort(al);
for (Student1 sd:al) {
	System.out.println(sd.rollno+" "+sd.name+" "+sd.age);
}

	}

}
