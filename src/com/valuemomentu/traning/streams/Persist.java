package com.valuemomentu.traning.streams;

import java.io.*;

public class Persist {

	public static void main(String[] args) throws IOException {
		StudentSerializable sp=new StudentSerializable(102,"Anusha");
		
		FileOutputStream fout=new FileOutputStream("c:/Demo/d.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		
		out.writeObject(sp);
		out.flush();
		System.out.println("success");
	}

}
