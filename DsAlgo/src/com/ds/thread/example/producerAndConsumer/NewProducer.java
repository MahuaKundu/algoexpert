package com.ds.thread.example.producerAndConsumer;

public class NewProducer implements Runnable {
	
	private MyBlockingQueue queue;
	
	
	public NewProducer() {
		// TODO Auto-generated constructor stub
	}
	public NewProducer(MyBlockingQueue queue) {
		super();
		this.queue = queue;
	}
	@Override
	public void run() {
		try {
			process();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void process() throws InterruptedException {
		// TODO Auto-generated method stub
		for(int i=0;i<=20;i++)
		{
			System.out.println("This is producer:"+i);
			queue.put(i);
			//Thread.sleep(5000);
		}
	}

}
