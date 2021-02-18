package com.valuemomentu.traning.streams;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {

	public static void main(String[] args) {
try {
	Writer w=new FileWriter("C:/Demo/data.txt");
	String content="She sells sea shells on the sea shore";
	w.write(content);
	w.close();
	System.out.println("Data written");
}
catch(IOException e){
	e.printStackTrace();
}
	}

}
