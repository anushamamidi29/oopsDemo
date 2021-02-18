
public class TestDoctor {

	public static void main(String[] args) {
		specialist spobj=new specialist("mary", 1234, "newyork","Medicine");
		spobj.display();
		Nonspecialist nsobj=new Nonspecialist("john",12345,"sydney");
nsobj.display();
	}

}
