package com.java.s1.student;

public class StudentMain {

	public static void main(String[] args) {
		//makeStudent 호출
		//이름, 번호, 국어, 영어, 수학 출력
		StudentUtil stdutil = new StudentUtil();

	//	Student std = stdutil.makestudent();
		Student [] students = stdutil.makeStudents();
		for(int i = 0; i< students.length;i++) {
			Student student = students[i];
			System.out.println("이름 : "+student.name); //이름
			System.out.println("번호 : "+student.number); //번호
			System.out.println("국어점수 : "+student.kor); //국어
			System.out.println("영어점수 : "+student.eng); //영어
			System.out.println("수학점수 : "+student.math); //수학
			System.out.println();
		}
		
		
	}

}
