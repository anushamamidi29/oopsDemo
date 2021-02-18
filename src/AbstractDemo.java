abstract class Animals{
	abstract void makeSound();
	public void eat() {
		System.out.println("i can eat");
	}
	
}
class Cat extends Animals{
	//provide implementation of abstract method
	public void makeSound()
{
		System.out.println("Meow-Meow");}
}
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cat c1=new Cat();
c1.makeSound();
c1.eat();
	}

}
