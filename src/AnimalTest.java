 class Animal {
	String name;
	public void eat() {
		System.out.println("i can eat");
	} 
 }
	 class Dog extends Animal{                  //Inherit from animal class
		void display() {
			 System.out.println("my name is "+name);      
		}
	  
	}

public class AnimalTest {

	public static void main(String[] args) {
		// Create an object to the sub class
		Dog labrodor =new Dog();
// access fields of super class
		labrodor.name="rohu";
		labrodor.display();
		labrodor.eat();
	}

}
