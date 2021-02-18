import java.util.Scanner;

public class EmployeeDetails {
String name;
int yearofjoining;
double salary;
String address;
Scanner s;

void input() {
	s=new Scanner(System.in);
	System.out.println("Enter Name:");
	name=s.next();
	System.out.println("Enter Yearofjoining:");
	yearofjoining=s.nextInt();
	System.out.println("Enter salary:");
	salary=s.nextDouble();
	System.out.println("Enter Address:");
	address=s.next();
}
void  display() {
	
	System.out.print(name     +"\t"  );
	
	System.out.print(yearofjoining    +"\t"  );
	
	System.out.print(salary   +"\t"  );

	System.out.print(address    +"\t"  );
	System.out.println( );
	
}
}
