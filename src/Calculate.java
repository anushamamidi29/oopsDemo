
public class Calculate {
void sum() {
	System.out.println("Method overloading");
	
}
void sum(int a,int b) {
	System.out.println("sum is:"+(a+b));
	
}
void sum(float a,float b) {
	System.out.println("sum is:"+(a+b));
	
}
void sum(String a,String b) {
	System.out.println("Concatination is "+(a+b));
	
}

	public static void main(String[] args) {
     Calculate cal=new Calculate();
    cal.sum();
    cal.sum(20, 10);            //sum(int a,int b) is called

    cal.sum(22.5f, 44.9f);        //sum(float a,float b) is called
    cal.sum("Hello", "World");    //sum(String a,String b) is called

	}

}
