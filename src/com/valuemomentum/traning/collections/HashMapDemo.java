package com.valuemomentum.traning.collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
HashMap<Integer,String> languages=new HashMap();
languages.put(1, "java");
languages.put(2, "c");
languages.put(3, "javascript");
languages.put(4, "Python");
System.out.println("Hashmap:"+languages);
//get method to get value
String value=languages.get(1);

System.out.println("value at index 1:"+value);
System.out.println("value at index 3:"+languages.get(3));
//return set view of keys
System.out.println("keys:"+languages.keySet());
//return set view of values

System.out.println("values:"+languages.values());
//return set view of keys/value pairs

System.out.println("keys/value Mapping:"+languages.entrySet());
languages.replace(2, "c++");
System.out.println(languages.entrySet());
System.out.print("keys:");
for(Integer key:languages.keySet())
{
System.out.print(key+"- "+languages.get(key));
System.out.print(",");
}


//iterate through key/value entries
System.out.print("\nEntries: ");
for (Entry<Integer, String> entry : languages.entrySet()) {
System.out.print(entry);
System.out.print(", ");
}

	}

}
