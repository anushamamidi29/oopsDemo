package com.valuemomentum.traning.collections;

class Sample<T>{                           //generic class
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
public class GenericClassDemo {

	public static void main(String[] args) {
 Sample<Integer > s=new Sample<Integer>();            //creating obj for generic class
 s.setData(15);
 System.out.println("Display From Generic class of type Integer:"+s.getData());
 
 Sample<String > s1=new Sample<String>();            //creating obj for generic class
 s1.setData("Anusha");
 System.out.println("Display From Generic class of type String:"+s1.getData());
 

 Sample<Float> s2=new Sample<Float>();            //creating obj for generic class
 s2.setData(120.3f);
 System.out.println("Display From Generic class of type Float:"+s2.getData());
	}

}
