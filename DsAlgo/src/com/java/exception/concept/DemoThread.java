package com.java.exception.concept;

public class DemoThread {
	
	public static void main(String args[])
	{
		System.out.println("Moon");
		System.out.println(Thread.currentThread().getName());
		/*
		 * Task task=new Task(); Thread t1=new Thread(task); t1.start();
		 * 
		 * ExceptionHanlder ex=new ExceptionHanlder(); ex.uncaughtException(t1, e);
		 */
	}
}
