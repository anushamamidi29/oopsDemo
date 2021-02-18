package com.valuemomentum.traning.concurrency;

public class JoinDemo extends Thread {
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
 JoinDemo jd1=new JoinDemo();
 JoinDemo jd2=new JoinDemo();
 JoinDemo jd3=new JoinDemo();
 
 jd1.start();
 try {
	jd1.join();    //join method wait for the thread to die
} catch (InterruptedException e) {
	e.printStackTrace();
}       //wait for current  thread to die
 
 
 jd2.start();
 jd3.start();
 
 
 
	}

}
