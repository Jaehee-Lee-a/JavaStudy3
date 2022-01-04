package com.java.s1.student;

public class StudentMain {

	public static void main(String[] args) {
		//makeStudent 호출
		//이름, 번호, 국어, 영어, 수학 출력
		StudentUtil stdutil = new StudentUtil();

		Student std = stdutil.makestudent();

		System.out.println("이름 : "+std.name); //이름
		System.out.println("번호 : "+std.number); //번호
		System.out.println("국어점수 : "+std.kor); //국어
		System.out.println("영어점수 : "+std.eng); //영어
		System.out.println("수학점수 : "+std.math); //수학
		
	}

}
