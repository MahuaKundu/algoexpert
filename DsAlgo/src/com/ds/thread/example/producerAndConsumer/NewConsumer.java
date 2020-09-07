package com.ds.thread.example.producerAndConsumer;

public class NewConsumer implements Runnable {

	private MyBlockingQueue<Integer> queue;

	public NewConsumer(MyBlockingQueue<Integer> queue) {
		super();
		this.queue = queue;
	}
	public void run() {
		Integer take = null;
		try {
			while (true) {
				take = queue.take();
				process(take);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void process(Integer take) throws InterruptedException {
		System.out.println("This is Consumer:" + take);
	}
}
