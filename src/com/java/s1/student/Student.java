package com.java.s1.student;

public class Student {
	
	//Data 저장 용도
	
	String name;
	int number;
	int kor;
	int eng;
	int math;

	int total;
	double avg;
	
	public void makeTotal() {
//		System.out.println("참조변수 this");
//		System.out.println("참조변수 this : "+this);
		this.total = kor + eng + math;
	//	hello();
	}
	
	public void makeAvg() {
		this.avg = total / 3.0;
	}
	
//	public void hello() {
//		System.out.println("안녕하세요.");
//	}
}
