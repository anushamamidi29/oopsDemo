package com.valuemomentum.traning.concurrency;

public class HeavyWorkRunnable implements Runnable{

	@Override
	public void run() {
System.out.println("Doing heavy Processing -START"+Thread.currentThread().getName());
try {
Thread.sleep(1000);
//Get database connection delete unused data from database
doDBProcessing();

}catch(InterruptedException e) {
	e.printStackTrace();
}
System.out.println("Doing Heavy Processing -END"+Thread.currentThread().getName());
	}
private void doDBProcessing() throws InterruptedException {
	Thread.sleep(5000);
}
}
