
public class Contact {
void createContact(String name,int num) {
	System.out.println("Name:"+name +" "+"Number:"+num);
	

}
void createContact(String name,int num1,int num2) {
	System.out.println("Name:"+name+" "+"Number:"+num1+" "+"Alternate number:"+num2);
	
	

}
	public static void main(String[] args) {
   Contact cc=new Contact();
   cc.createContact("anusha", 1234567890);
   cc.createContact("anusha", 1234567890, 912345678);
	}

}
