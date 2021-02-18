
public class specialist extends Doctor {
protected String speciality;
 specialist(){
	 
 }
 specialist(final String str,final int num,final String add,final String special){
	 super(str,num,add);
	 speciality=special;
 }
 void display() {
	 super.display();          //call base class method
	 System.out.println("The Speciality is"+speciality);
 }
}
