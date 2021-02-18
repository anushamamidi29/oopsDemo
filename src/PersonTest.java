
public class PersonTest {

	public static void main(String[] args ) {
		Person p=new Person();              // invoke default constructor
		Person p1=new Person("anusha",22);
		Person p2=new Person("anusha",22,"Hyderbad"); //Parameterized constructor 
			p.input();
			p.display();
			p1.display();
			p2.display();
	}

}
