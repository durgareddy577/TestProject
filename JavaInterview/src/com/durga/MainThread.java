package com.durga;

public class MainThread {

	public static void main(String[] args) {
		MyThread m=new MyThread();
		m.setPriority(8);
		MyThread1 m1=new MyThread1();
		m.setPriority(8);
		m.start();
		m1.start();

	}

}
