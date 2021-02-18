package com.valuemomentum.traning.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetUserDefined {

	public static void main(String[] args) {
 Set<Employee> emp=new HashSet<Employee>();
	Employee e1=new Employee(100,"john", 20000);
	Employee e2=new Employee(101,"mary", 3000);
	Employee e3=new Employee(102,"jim", 2400);
	Employee e4=new Employee(100,"josh", 25000);
	
	emp.add(e1);
	emp.add(e2);
	emp.add(e3);
	emp.add(e4);
	for(Employee e:emp) {
		System.out.println(e.id +" "+e.name+" "+e.salary);
	}
	
	
	}

}
