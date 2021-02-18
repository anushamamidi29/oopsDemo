
public class EmployeeDetailsTest {

	public static void main(String[] args) {
		EmployeeDetails e1=new EmployeeDetails();
		EmployeeDetails e2=new EmployeeDetails();
		EmployeeDetails e3=new EmployeeDetails();
        e1.input();
        e2.input();
       e3.input();
        
        System.out.println("NAME YEAROFJOIN SALARY ADDRESS");
        e1.display();
        e2.display();
       e3.display();
	}

}
