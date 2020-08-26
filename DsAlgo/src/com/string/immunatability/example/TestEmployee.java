package com.string.immunatability.example;

public class TestEmployee {
	public static void main(String[] args) {
		Age age=new Age();
		age.setDay(10);
		age.setMonth(20);
		age.setYear(2010);
		
		Employee e1=new Employee("Mahua", "Chemistry", 100, age);
		System.out.println("Not chnaging any values in employee class"+e1);
		age.setDay(30);//Constrctor  is needed
		System.out.println("After chnaging the values in employee class"+e1);
		Age a1=e1.getAge();
		a1.setDay(20);
		System.out.println("After chnaging the class in the  getAge method"+e1);	
	}

}
