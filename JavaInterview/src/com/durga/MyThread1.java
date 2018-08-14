package com.durga;

public class MyThread1 extends Thread 
{
      @Override
    public void run() {
    	for(int i=0;i<=9;i++)
    	{
    		try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		System.out.println("MYthread1");
    	}
    }
}
