import java.util.Scanner;

//class declaration
class Trainee {
	int tid;
	String tname;
	String technology;                 //define properties
	float salary;
	//define methods
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id,Name,Technology,Salary of the trainee");
		tid=sc.nextInt();
		tname=sc.next();
		technology=sc.next();
		salary=sc.nextFloat();
		
	}
	float calculate(){
		float stipend=salary-200;
		return stipend;
	
	}
	void display() {
		System.out.println("************Trainee Details**********");
		System.out.println("Traineeid  :"+tid);
		System.out.println("TraineeName:"+tname);
		System.out.println("Technology :"+technology);
		//System.out.println("Salary     :"+salary);
	}

	
}
public class TestTrainee {

	public static void main(String[] args) {
		//creating object for class
		Trainee t1=new Trainee();
		Trainee t2=new Trainee();
		
		//calling methods
		t1.input();
		t2.input();
		float s1=t1.calculate();
		float s2=t2.calculate();
		
		t1.display();
		System.out.println("stipend :"+s1);
		t2.display();
		System.out.println("stipend :"+s2);
	}

}
