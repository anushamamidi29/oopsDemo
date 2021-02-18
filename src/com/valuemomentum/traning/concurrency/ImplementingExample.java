package com.valuemomentum.traning.concurrency;
class Count1 implements Runnable
{
	Thread t1;
   Count1()
   {
     t1=new Thread(this,"My Runnable Thread");
     System.out.println("my thread created" + this);
     t1.start();
   }
   public void run()
   {
     try
     {
        for (int i=0 ;i<10;i++)
        {
           System.out.println("Printing the count " + i);
           Thread.sleep(1000);
        }
     }
     catch(InterruptedException e)
     {
        System.out.println("my thread interrupted");
     }
     System.out.println("My thread run is over" );
   }
}
public class ImplementingExample {
	 public static void main(String args[])
	   {
	      Count1 cnt1 = new Count1();
	      try
	      {
	         while(cnt1.t1.isAlive())
	         {
	           System.out.println("Main thread will be alive till the child thread is live");
	           Thread.sleep(1500);
	         }
	      }
	      catch(InterruptedException e)
	      {
	        System.out.println("Main thread interrupted");
	      }
	      System.out.println("Main thread's run is over" );
	   }
}
