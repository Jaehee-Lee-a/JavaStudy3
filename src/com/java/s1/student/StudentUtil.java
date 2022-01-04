package com.java.s1.student;

import java.util.Scanner;

public class StudentUtil {

	public Student makestudent() {
		// 키보드로부터 이름, 번호, 국어, 영어, 수학 입력
		Scanner sc = new Scanner(System.in);

		System.out.println("이름을 입력하세요.");
		String name = sc.next();
		System.out.println("번호를 입력하세요.");
		int number = sc.nextInt();
		System.out.println("국어점수를 입력하세요.");
		int kor = sc.nextInt();
		System.out.println("영어점수를 입력하세요.");
		int eng = sc.nextInt();
		System.out.println("수학점수를 입력하세요.");
		int math = sc.nextInt();

		Student student = new Student();
		student.name = name;
		student.number = number;
		student.kor = kor;
		student.eng = eng;
		student.math = math;
		
		return student;
	}

}
