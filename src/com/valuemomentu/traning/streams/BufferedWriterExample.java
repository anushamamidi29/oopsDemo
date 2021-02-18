package com.valuemomentu.traning.streams;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample{ 


public static void main(String args[]) { 

// Writing to a file using BufferedWriter in Java 
try { 
	//creating writer object in append mode-true
	FileWriter writer = new FileWriter("c:/demo/Names.txt",true);

BufferedWriter bwr = new BufferedWriter(writer);  

bwr.write("James"); 
bwr.write("\n"); // bwr.newLine();
bwr.write("Hobert"); 
bwr.write("\n"); // bwr.newLine();
bwr.write("Anusha mamidi ");

bwr.close(); 

System.out.println("succesfully written to a file"); } 
catch (IOException ioe) { 
ioe.printStackTrace(); 

}
 } 
}
