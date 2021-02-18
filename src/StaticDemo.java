
public class StaticDemo {
			static int count;
			//int count;
			StaticDemo()
			{
				count=count+1;
			}
		static void display() {
			System.out.println("the no of objects created:"+count);
		}


	public static void main(String[] args) {
		StaticDemo sd=new StaticDemo();
		StaticDemo sd1=new StaticDemo();
		StaticDemo sd2=new StaticDemo();
       StaticDemo.display();
		//  sd2.display();
	}

}
