package com.oop;

public class Main3getterssettersAddfunctionality {
	public static void main(String[] args) {
		Car3getterssettersAddfunctionality car = new Car3getterssettersAddfunctionality();
		car.setSpeed (10);
		car.setDoors ("closed");
		car.setEngine ("on");
		car.setDrivers ("seated");
		//calling the function
		System.out.println (car.run ());
	}

}
