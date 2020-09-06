package com.ds.thread.example.exception;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Date;

public class RunnableTaskForOneThread implements Runnable {
	private String source;
	private String destination;

	public RunnableTaskForOneThread(String source, String destination) {
		this.source = source;
		this.destination = destination;
	}

	
	@Override
	public void run() {
		System.out.println("Started Task to move File from" + source + " to->" + destination + " at " + new Date());
		

			
			if (true) {
				System.out.println("This");
				throw new IllegalArgumentException("This is one exception");
			}
			if (source == null || destination == null) {
				return;
			}
			File sDir = new File(source);
			if (sDir.exists()) {
				String contents[] = sDir.list();
				System.out.println("List of files and directories in the specified directory:");
				for (int i = 0; i < contents.length; i++) {
					System.out.println(contents[i]);
					try {
						System.out.println(Paths.get(source + contents[i]));
						System.out.println(Paths.get(destination));
						Files.move(Paths.get(source + contents[i]), Paths.get(destination + contents[i]),
								StandardCopyOption.REPLACE_EXISTING);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						//e.printStackTrace();
					}
				}

			}
		
	}
}
