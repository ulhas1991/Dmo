package com.threading.day1;

public class MainClass {

	public static void main(String[] args) {
		ThreadingClass startThread=new ThreadingClass();
		Thread t1=new Thread(startThread);
		Thread t2=new Thread(startThread);
		t1.start();
		t2.start();

	}

}
