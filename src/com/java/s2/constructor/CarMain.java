package com.java.s2.constructor;

public class CarMain {

	public static void main(String[] args) {
		//변수 선언 = new 생성자호출
		Car car = new Car();
//		car.brand = "k7";
//		car.company = "kia";
//		car.cc = 2000;
		car.info();
		Car car2 = new Car("volvo");
		car2.info();
		
		Car car3 = new Car("k3", "white");
		car3.info();
		
		Car car4 = new Car("k5", "red", 5000);
		car4.info();
	}

}
