package com.valuemomentum.traning.collections;

import java.util.ArrayList;
import java.util.Collections;
public class ComparatorDemo {

 

public static void main(String[] args) {

ArrayList<Student5> ar=new ArrayList<Student5>();

Student5 s1=new Student5(111,"John","Bengaluru");
Student5 s2=new Student5(121,"Boya","lane");
Student5 s3=new Student5(101,"Rgv","Hyd");
Student5 s4=new Student5(115,"Mike","Newyork");

ar.add(s1);
ar.add(s2);
ar.add(s3);
ar.add(s4);

System.out.println("unsorted array list");
//System.out.println(ar); //to invoke toString method
for(int i=0;i<ar.size();i++)
System.out.println(ar.get(i));

Collections.sort(ar,new SortByRoll());
System.out.println("*************sorted array list by roll number***********");
for(int i=0;i<ar.size();i++)
System.out.println(ar.get(i));

Collections.sort(ar,new SortByName());
System.out.println("**********sorted array list by Name**********");
for(int i=0;i<ar.size();i++)
System.out.println(ar.get(i));

 
}
}