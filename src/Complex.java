
public class Complex {
   double real;
   double imaginary;
   
   public Complex(double r,double i) {
	   real=r;
	   imaginary=i;
	   
   }
	 void add(Complex c1) {
		 this.real +=c1.imaginary;
		 this.imaginary +=c1.imaginary;
		  }
	void dispaly() {
		System.out.println(this.real+"+i"+this.imaginary);
	}
	
	public static void main(String[] args) {
	Complex c=new Complex(10.3,15.7);
	Complex c1=new Complex(0.89,65.7);
	c.add(c1);
System.out.println("the addition of Complex numbers is ");
   c.dispaly();
   c1.dispaly();
	}

}
