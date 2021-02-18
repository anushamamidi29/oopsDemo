import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	      String n;
		double sal,hrs;
		System.out.println("Enter Name:");
          n=sc.next();
		System.out.println("Enter salary:");
		sal=sc.nextDouble();
		System.out.println("Enter worked hours:");
		hrs=sc.nextDouble();
		
		Employeeinfo e1=new Employeeinfo();
		e1.getInfo(n,sal,hrs);
		e1.addSal();
		e1.addwork();
		e1.display();

	}

}
