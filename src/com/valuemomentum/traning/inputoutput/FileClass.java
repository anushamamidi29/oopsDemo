package com.valuemomentum.traning.inputoutput;

import java.io.File;
import java.io.IOException;

 

public class FileClass {

    public static void main(String [] args)
    {
        File f = new File("C:\\Traning\\java\\OoPSDemo\\src\\com\\valuemomentum\\traning\\inputoutputhello.txt");

        try
        {
            if (f.createNewFile())
            {
                System.out.println("New File created!");
            }
            else {
                System.out.println("The file already exists.");
            }
        }
            catch(IOException e)
            {
                e.printStackTrace();
                
            }
        System.out.println("Name of the file:"+ f .getName());
        System.out.println("Path of the file:"+ f .getPath());

        System.out.println("Parent Directory of the file:"+ f .getParent());

        System.out.println("Last modification of the file"+ f .lastModified());
        System.out.println("Length of the file:"+ f.length()+"Bytes");



        }
    }