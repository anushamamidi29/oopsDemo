
public class ThisDemo {
     int instvar;
      ThisDemo(int instvar){
    	  this.instvar=instvar;
    	  System.out.println("this reference="+this);
    	  
      }
	public static void main(String[] args) {
		ThisDemo d=new ThisDemo(8);
		System.out.println("Object Refernce="+ d);

	}

}
