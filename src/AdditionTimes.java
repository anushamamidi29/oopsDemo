
public class AdditionTimes {
	double hours;
	double minutes;
	double seconds;
	 
	public AdditionTimes(double h,double m,double s) {
		hours=h;
		minutes=m;
		seconds=s;
		}
	   void add(AdditionTimes t1) {
		   this.hours+=t1.hours;
		   this.minutes+=t1.minutes;
		   this.seconds+=t1.seconds;
		   
	   }
	   void check() {
		   if(this.seconds>=60) {
			   this.minutes+=1;
			   this.seconds-=60;
		   }
		   if(this.minutes>=60) {
			   this.hours+=1;
			   this.minutes-=60;
		   }
		   if(this.hours>=24) {
			   this.hours-=24;
			   
		   }
	   }
	   void dispaly() {
			System.out.println(this.hours +" hr:"+this.minutes +" min:"+this.seconds +" sec");
		}
		
	public static void main(String[] args) {
		AdditionTimes t=new AdditionTimes(4,10,50);
		AdditionTimes t1=new AdditionTimes(6,50,15);
		t.add(t1);
		t.check();
		t.dispaly();
	}

}
