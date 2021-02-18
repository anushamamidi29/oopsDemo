package com.valuemomentum.traning.strings;

public class Tester {
	int eid;
	String name;
	double sal;
	public Tester(int eid, String name, double sal) {
		super();
		this.eid = eid;
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Tester [eid=" + eid + ", name=" + name + ", sal=" + sal + "]";
	}
	

}
