package com.valuemomentum.traning.concurrency;
//java program to illustrate yeild() mwthod
class MyThread6 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+ "in control");
		
		}
	}
}
//Driver class
public class YeildDemo {

	public static void main(String[] args) {
MyThread6 t =new MyThread6();
t.start();

for(int i=0;i<5;i++) {
	//control passes to child thread
	Thread.yield();
	//after execution of child thread main thread takes over
	System.out.println(Thread.currentThread().getName()+ " in control");
}

	}

}
