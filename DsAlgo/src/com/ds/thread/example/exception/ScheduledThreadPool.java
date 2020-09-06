package com.ds.thread.example.exception;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class ScheduledThreadPool {

	public static void main(String args[]) throws InterruptedException {
		String source = "C:\\Users\\Facadmin\\Desktop\\FileMove1\\";
		String destination = "C:\\Users\\Facadmin\\Desktop\\FileMove2\\";
		oneThreadExceptionHandler(source, destination);
		//scheduledThreadpoolhandler(source, destination);
	}

	private static void scheduledThreadpoolhandler(String source, String destination) {
        RunnableTaskForSchulderThread task = new RunnableTaskForSchulderThread(source, destination);
		final ThreadFactory factory = new ThreadFactory() {
            @Override
			public Thread newThread(Runnable target) {
				final Thread thread = new Thread(target);
				System.out.println("Creating new worker thread");
				thread.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
                   @Override
					public void uncaughtException(Thread t, Throwable e) {
						System.out.println(t.getName() + " Uncaught Exception" + e);
					}
				});
				return thread;
			}
		};
		ExecutorService schedulderpool = Executors.newFixedThreadPool(5, factory);
        schedulderpool.execute(task);
		schedulderpool.execute(task);
        System.out.println(" Completed all the tasks@@@@");
        System.out.println("Completed all threads");
	}
	
	private static void oneThreadExceptionHandler(String source, String destination) throws InterruptedException {
		
		  Thread.UncaughtExceptionHandler h = new Thread.UncaughtExceptionHandler() {
		  @Override public void uncaughtException(Thread th, Throwable ex) {
		  System.out.println(th.getState());
		  System.out.println("Uncaught exception QQQ: " + ex);
		  
		  } };
		 
		RunnableTaskForOneThread task = new RunnableTaskForOneThread(source, destination);
		Thread t1 = new Thread(task);
		t1.setUncaughtExceptionHandler(h);
		t1.start();
		t1.join();
		System.out.println(t1.getState());
	}
}
