package com.java.s1.student;

public class StudentView {
	// 출력 전용 class

	// viewStudents - 여러명의 학생의 모든 정보를 출력
	public void viewStudents(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			Student stds = students[i];
			System.out.println("이름 : " + stds.name);
			System.out.println("번호 : " + stds.number);
			System.out.println("국어점수 : " + stds.kor);
			System.out.println("영어점수 : " + stds.eng);
			System.out.println("수학점수 : " + stds.math);
			System.out.println();
		}
	}

//	 viewStudent - 학생의 모든 정보를 출력
	public void viewStudent(Student std) {
		System.out.println("이름 : " + std.name);
		System.out.println("번호 : " + std.number);
		System.out.println("국어점수 : " + std.kor);
		System.out.println("영어점수 : " + std.eng);
		System.out.println("수학점수 : " + std.math);

	}

	public void viewMessage(String message) {
		// 문자열 출력
		System.out.println("---------------------------");
		System.out.println(message);
		System.out.println("---------------------------");
	}
}
