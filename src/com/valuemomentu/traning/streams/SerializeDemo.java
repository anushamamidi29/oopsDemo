package com.valuemomentu.traning.streams;

import java.io.*;

public class SerializeDemo {

	public static void main(String[] args) {
Employee e=new Employee();
e.name="anusha";
e.address="hyderbad";
e.ssn=1113344;
e.number=101;
try {
	FileOutputStream fout=new FileOutputStream("c:/Demo/employee.ser");
    ObjectOutputStream out=new ObjectOutputStream(fout);
	out.writeObject(e);
	out.close();
	fout.close();
	System.out.printf("Serailized data is stored in c:/Demo/employee.ser");
}catch(IOException i) {
	i.printStackTrace();
}
	}

}
