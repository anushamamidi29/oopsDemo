package com.valuemomentum.traning.strings;

public class StringBufferDemo1 {

	public static void main(String[] args) {
StringBuffer str=new StringBuffer("JamesGosling");
int l=str.length();
System.out.println("The lenght of String is"+l);
System.out.println("The Capacity of the string is"+str.capacity());
System.out.println("the substring is "+str.substring(0, 5));
str.replace(5, 10, "Java");
System.out.println(str);
System.out.println("The Reverse String is "+str.reverse());
str.delete(2, 5);
System.out.println(str);
}

}
