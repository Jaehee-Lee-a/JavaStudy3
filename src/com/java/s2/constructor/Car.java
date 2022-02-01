package com.java.s2.constructor;

public class Car {
	String brand;
	public static String company = "Kia";
	String color;
	int cc;
	
	//기본 생성자
	public Car() {
		this("k9");
//		this.company = "Kia";
//		this.brand = "k9";
//		this.color = "black";
//		this.cc = 5000;
	} 
	
	//생성자 오버로딩
	public Car(String brand) {
		this(brand, "black");
//		this.company = "Kia";
//		this.brand = brand;
//		this.color = "black";
//		this.cc = 5000;
	}
	
	public Car(String brand,String color) {
		this(brand,color,5000);
//		this.company = "Kia";
//		this.brand = brand;
//		this.color = color;
//		this.cc = 5000;
	}
	
	public Car(String brand, String color, int cc) {
		this.brand = brand;
		this.color = color;
		this.cc = cc;
	}
	
	//멤버메서드
	public void info() {
		System.out.println("멤버메서드");
		System.out.println(Car.company);
		System.out.println(this.brand);
		System.out.println(this.color);
		System.out.println(this.cc);
	}
}
