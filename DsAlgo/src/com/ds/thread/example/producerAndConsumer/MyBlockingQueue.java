package com.ds.thread.example.producerAndConsumer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyBlockingQueue<E> {

	private Queue<E> queue;
	private int max = 16;
	private ReentrantLock lock = new ReentrantLock(true);
	private Condition notFull = lock.newCondition();
	private Condition notEmpty = lock.newCondition();

	public MyBlockingQueue(int size) {
		queue = new LinkedList();
		this.max = size;
	}

	public void put(E e) throws InterruptedException {
		lock.lock();
		try {
			while (queue.size() == max) {
				notFull.await();
			}
			queue.add(e);
			notEmpty.signal();
		} finally {
			lock.unlock();
		}
	}

	public E take() throws InterruptedException {
		lock.lock();
		try {
			while (queue.size() == 0) {
				notEmpty.await();
			}
			E item = queue.poll();
			notFull.signal();
			return item;
		} finally {
			lock.unlock();
		}

	}
}
