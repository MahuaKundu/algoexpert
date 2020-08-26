package com.string.immunatability.example;

public final class Employee {

	private final String name;
	private final String deptNo;
	private final int id;
	private final Age age;

	public Employee(String name, String deptNo, int id,Age age) {
		super();
		this.name = name;
		this.deptNo = deptNo;
		this.id = id;
		/**Age cloneAge = new Age();
	    cloneAge.setDay(age.getDay());
	    cloneAge.setMonth(age.getMonth());
	    cloneAge.setYear(age.getYear());**/
	    this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getDeptNo() {
		return deptNo;
	}

	public Age getAge() {
		Age cloneAge=new Age(age.getDay(), age.getMonth(), age.getYear());
		
		return cloneAge; 
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [name=");
		builder.append(name);
		builder.append(", deptNo=");
		builder.append(deptNo);
		builder.append(", id=");
		builder.append(id);
		builder.append(", age=");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}
}
