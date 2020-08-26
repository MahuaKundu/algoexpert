package com.java.exception.concept;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionExample {
	
	public static void  main(String args[]) throws IncorrectFileNameException 
	{
		File file = new File("C:\\Users\\Facadmin\\Desktop\\Table Topic.txt");
		FileInputStream fileInputStream=null;
		
		try
		{
			fileInputStream=new FileInputStream(file);
			while(fileInputStream.read()!=-1)
			{
				System.out.println(fileInputStream.read());
			}
		}
		catch(FileNotFoundException ex)
		{
			throw new IncorrectFileNameException("File is missing");
			//ex.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			System.out.println(" I am inside the finally block!!!");
			try
			{
				fileInputStream.close();
			}
			catch(IOException ex)
			{
				System.out.println(ex);
			}
		}

	}
}
