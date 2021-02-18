package com.valuemomentu.traning.streams;

import java.io.*;

public class DeserializeDemo {

	public static void main(String[] args)  {
Employee e=null;
try {
	FileInputStream finput=new FileInputStream("c:/Demo/employee.ser");
	ObjectInputStream in= new ObjectInputStream(finput);
	e=(Employee)in.readObject();
	in.close();
	finput.close();
}catch(IOException i) {
	i.printStackTrace();
	return;
	
}catch(ClassNotFoundException c) {
	System.out.println("Empoyee class not found");
	c.printStackTrace();
	return;
	
}
System.out.println("Deserialized Employee");
System.out.println("_____________________");
System.out.println("Name:"+e.name);
System.out.println("Address:"+e.address);
System.out.println("SSN:"+e.ssn);
	System.out.println("Number:"+e.number);
	}

}
