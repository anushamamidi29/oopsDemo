
public class ConstructerDemo {
	int id;
	ConstructerDemo(){
		System.out.println("in constructer ");             //Default constructer 
		id=10;
		
	}
    void display() {
    	System.out.println(id);
    }
	public static void main(String[] args) {
	//define objects and invokes constructor 
		ConstructerDemo obj1=new ConstructerDemo();
		ConstructerDemo obj2=new ConstructerDemo();
		obj1.display();
		obj2.display();
	}

}
