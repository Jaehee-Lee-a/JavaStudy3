package com.java.s1.student;

import java.util.Scanner;

public class StudentUtil {

//	public Student search(Student[] students) {
//		// 학생의 번호를 입력
//		// 입력 받은 번호와 일치하는 학생을 찾아서
//		// 리턴
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("검색을 원하는 학생 번호를 입력하세요.");
//		int searchNumber = sc.nextInt();
//		Student stds = null;
//		for (int i = 0; i < students.length; i++) {
//			if (searchNumber == students[i].number) {
//				stds = students[i];
//	
//				break;
//			} 
//		}
//		return stds;
//	}

	public Student[] makeStudents() {
		// 학생 객체를 생성하고 정보를 입력 받는 곳

		// 학생의 수를 입력 받음
		// 키보드로부터 이름, 번호, 국어, 영어, 수학 입력
		// 학생들의 정보를 리턴
		Scanner sc = new Scanner(System.in);
		System.out.println("학생들의 수를 입력하세요.");
		int num = sc.nextInt();
		Student[] student = new Student[num]; // 학생들을 모을 배열 생성
		for (int i = 0; i < student.length; i++) {
			Student stu = new Student();
			System.out.println("이름을 입력하세요.");
			stu.name = sc.next();
			System.out.println("번호를 입력하세요.");
			stu.number = sc.nextInt();
			System.out.println("국어점수를 입력하세요.");
			stu.kor = sc.nextInt();
			System.out.println("영어점수를 입력하세요.");
			stu.eng = sc.nextInt();
			System.out.println("수학점수를 입력하세요.");
			stu.math = sc.nextInt();
			student[i] = stu;

		}
		return student;
	}

//	public Student makestudent() {
//		// 키보드로부터 이름, 번호, 국어, 영어, 수학 입력
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("이름을 입력하세요.");
//		String name = sc.next();
//		System.out.println("번호를 입력하세요.");
//		int number = sc.nextInt();
//		System.out.println("국어점수를 입력하세요.");
//		int kor = sc.nextInt();
//		System.out.println("영어점수를 입력하세요.");
//		int eng = sc.nextInt();
//		System.out.println("수학점수를 입력하세요.");
//		int math = sc.nextInt();
//
//		Student student = new Student();
//		student.name = name;
//		student.number = number;
//		student.kor = kor;
//		student.eng = eng;
//		student.math = math;
//		
//		return student;
//	}

}
