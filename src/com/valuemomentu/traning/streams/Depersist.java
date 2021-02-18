package com.valuemomentu.traning.streams;

import java.io.*;
public class Depersist {

	public static void main(String[] args)throws Exception {
 ObjectInputStream in=new ObjectInputStream(new FileInputStream("c:/Demo/d.txt"));
 StudentSerializable sp=(StudentSerializable)in.readObject();
 System.out.println("Id:"+sp.id+" Name:"+sp.name);
 in.close();
	}

}
