package com.ds.inheitance.example;

public class Driver extends Person {

	private int driverId;
	private CarDrive carDrive;

	public Driver() {
		// TODO Auto-generated constructor stub
	}

	public Driver(String name, int age, int driverId, CarDrive carDrive) {
		super(name, age);

		this.driverId = driverId;
		this.carDrive = carDrive;
	}

	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public CarDrive getCarDrive() {
		return carDrive;
	}

	public void setCarDrive(CarDrive carDrive) {
		this.carDrive = carDrive;
	}

	@Override
	public void work() {

		System.out.println("Driver Name is:" + getName() + "," + "Age is:" + getAge() + "," + "Driver id is :"
				+ driverId + ", CarType is:" + carDrive);
	}

}
