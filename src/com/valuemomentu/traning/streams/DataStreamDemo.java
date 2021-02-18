package com.valuemomentu.traning.streams;

import java.io.*;
public class DataStreamDemo {

 

    public static void main(String [] args) throws IOException
    {
        DataInputStream d = new DataInputStream(new FileInputStream("C:\\Demo\\a.txt"));
        DataOutputStream out = new DataOutputStream(new FileOutputStream("C:\\Demo\\b.txt"));
        
        String count;
        while((count = d.readLine())!=null)
        {
            String u = count.toUpperCase();
            System.out.println(u);
            out.writeBytes(u+ ",");
            d.close();
            out.close();
        
    }
    
}
}