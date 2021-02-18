package com.valuemomentum.traning.collections;

class Employee1
{
	private String name;

	public Employee1(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
	interface pair<K,V>{
		public K getKey();
		public V getValue();
	}
	class OrderedPair<K, V>  implements pair<K,V>{
	private K Key;
	private V Value;
	
	public OrderedPair(K key, V value) {
		super();
		Key = key;
		Value = value;
	}
	@Override
	public K getKey() {
		return Key;
	}
	@Override
	public V getValue() {
		return Value;
	}

		
}
public class GenericMultipleTypeParameters {

	public static void main(String[] args) {
OrderedPair<Integer,String> op=new OrderedPair<Integer,String>(101,"Java");
System.out.println(op.getKey()+":"+op.getValue());

OrderedPair<String,String> op1=new OrderedPair<String,String>("DataBase","Mysql");
System.out.println(op1.getKey()+":"+op1.getValue());

OrderedPair<Integer,Employee1> op2=new OrderedPair<Integer,Employee1>(10,new Employee1("Anusha"));
System.out.println(op2.getKey()+":"+op2.getValue().getName());

	}

}
