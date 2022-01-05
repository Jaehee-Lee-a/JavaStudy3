package com.java.s1.student;

public class StudentView {
	// 출력 전용 class

	// viewStudents - 여러명의 학생의 모든 정보를 출력
	public void viewStudents(Student[] students) {
		for (int i = 0; i < students.length; i++) {
//			Student std = students[i];
//			this.viewStudent(std);
			this.viewStudent(students[i]);
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
		System.out.println("총점 : " + std.total);
		System.out.println("평균 : " + std.avg);

	}

	public void viewMessage(String message) {
		// 문자열 출력
		System.out.println("---------------------------");
		System.out.println(message);
		System.out.println("---------------------------");
	}
}
