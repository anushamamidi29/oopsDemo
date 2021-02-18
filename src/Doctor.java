
public class Doctor {
protected String name;
protected int idnumber;
protected String address;
Doctor(){
}
Doctor(final String n,final int id,final String add){
	name=n;
	idnumber=id;
	address=add;
}
void display() {
	System.out.println("The name is:"+name);
	System.out.println("The Idnumber is:"+idnumber);
	
	System.out.println("The Address is:"+address);

}
}
