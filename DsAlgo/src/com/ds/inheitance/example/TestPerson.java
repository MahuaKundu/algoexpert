package com.ds.inheitance.example;

public class TestPerson {
	public static void main(String[] args) {
		
		Student s1=new Student("Mahua",33,10,"Graph Theory");
		s1.work();
		System.out.println("--------------------------------------------------------");
		
		Driver d1=new Driver("Ram",20,10,CarDrive.TWOWHEELER);
		d1.work();
		System.out.println("----------------------------------------------------------------------------");
		
		Person p1=new Person("Gyan",10);
		p1.work();
	}

}
