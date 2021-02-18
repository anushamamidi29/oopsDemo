package com.valuemomentu.traning.streams;

import java.io.Serializable;

public class Employee implements Serializable{
public String name ;
public String address;
public transient int ssn;
public int number;

public void checkmail() {
	System.out.println("Mailing a check to"+name+" "+address);
	
}
}
