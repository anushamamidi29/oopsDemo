package com.valuemomentu.traning.streams;

import java.io.*;

public class BufferedOutputDemo {

	public static void main(String[] args)throws Exception {
FileOutputStream fout=new FileOutputStream("c:/Demo/f1.txt");
BufferedOutputStream bout=new BufferedOutputStream(fout);
String s="sachin is my favourite player";
byte b[]=s.getBytes();
bout.write(b);
bout.flush();
bout.close();
fout.close();
System.out.println("success");
}

}
