import java.util.Scanner;

class RectangleArea{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double l,b;
		System.out.println("Enter the length");
		l=sc.nextDouble();
		System.out.println("Enter the breadth");
		b=sc.nextDouble();
		Area area=new Area(l,b);
		System.out.println("area:"+area.returnArea());
		
	}
}