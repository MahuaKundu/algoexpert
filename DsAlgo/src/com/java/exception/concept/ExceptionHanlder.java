package com.java.exception.concept;

import java.io.UncheckedIOException;
import java.lang.Thread.UncaughtExceptionHandler;

public class ExceptionHanlder implements UncaughtExceptionHandler {

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		// TODO Auto-generated method stub
		System.out.println("Thread name"+t.getName());
		System.out.println("Exception class Name:"+e.getMessage());
		new Thread(new Task()).start();
	}

}
