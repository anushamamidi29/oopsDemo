
public class ThisConstructer {

	
	 ThisConstructer ()
	 {
	     // Calling constructor
	   this("Java Flair");
	 }
	 
	 
	ThisConstructer(String str){
	     
	     System.out.println(str);
	     
	 }
	 
	 public static void main(String[] args) {
		 ThisConstructer d = new ThisConstructer();
	 }
	}
