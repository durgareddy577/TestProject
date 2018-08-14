package com.durga;

public class MyThread extends Thread
{
    @Override
    public void run() 
    {
          for(int i=0;i<=9;i++)
          {
        	  System.out.println("my thread");
          }
    }
}
