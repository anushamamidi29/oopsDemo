

public class Employeeinfo {
	String name;
double salary;
double hours;

void getInfo(String n,double sal,double  hrs) {
	name=n;
	salary=sal;
	hours=hrs;
	
}
 void addSal() {
	 if (salary<500) {
		 salary+=10; 
	 } 
 }
 void addwork() {
	 if(hours>6) {
		 salary+=5;
	 }
 }
 void display() {
	 
	 System.out.println("salary is "+salary);
 }
}
