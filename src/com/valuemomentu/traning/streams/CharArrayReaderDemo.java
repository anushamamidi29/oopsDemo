package com.valuemomentu.traning.streams;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReaderDemo {

	public static void main(String[] args)throws IOException {
		char[] ary = { 'j', 'a', 'v', 'a', 'p', 'r', 'o', 'g', 'r', 'a','m' };  
	    CharArrayReader reader = new CharArrayReader(ary);  
	    int k = 0;  
	    // Read until the end of a file  
	    while ((k = reader.read()) != -1) {  
	      char ch = (char) k;  
	      System.out.print(ch + " : ");  
	      System.out.println(k);  
	    }  
	   
	}

}
