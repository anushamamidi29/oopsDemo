import java.util.Scanner;

public class Person {
	private String name;
    private int age;
    private String constituency;
    Scanner s;
    
    Person(){
    	System.out.println("voter Eligibility app");    // create a default 
    	age=0;
    	name="";
    	constituency="Hyderbad";
    	s=new Scanner(System.in);
    	
    }
    Person(String n, int a){
    	name=n;
    	age=a;        // create parameterized constructor
    }
    Person(String n, int a,String b){
    	name=n;
    	age=a;
    	constituency=b;   // create parameterized constructor
    }
    
    public void input() {
    	System.out.println("Enter your name :");
    	name=s.next();
    	System.out.println("Enter your age  :");
    	age=s.nextInt();
    }
    public void display() {
    	System.out.println("Name is :"+name);
    	System.out.println("Age  is :"+age);
    	System.out.println("constituency is :"+constituency);
    }
    
    
}
