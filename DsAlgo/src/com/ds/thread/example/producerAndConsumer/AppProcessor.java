package com.ds.thread.example.producerAndConsumer;

public class AppProcessor {
	
	public static void main(String args[])
	{
		MyBlockingQueue queue=new MyBlockingQueue<Integer>(10);
		
		Thread t1=new Thread(new NewConsumer(queue));
		Thread t2=new  Thread(new NewProducer(queue));
		
		t1.start();
		t2.start();
		
	}

}
