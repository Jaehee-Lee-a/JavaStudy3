package com.java.s1.student;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
	StudentController sc = new StudentController();
	sc.start();
	Student student = new Student();
	student.name = "jaehee";
	student.kor = 10;
	student.eng = 10;
	student.math = 10;
//	student.hello();
	student.makeTotal();
//	System.out.println("참조변수 student : "+student);
//	System.out.println("Student Total : "+student.total);
//	Student student2 = new Student();
//	
//	student2.kor = 20;
//	student2.eng = 20;
//	student2.math = 20;
//	System.out.println("참조변수 student2 : "+student2);
//	student2.makeTotal();
//	System.out.println("Student2 Total : "+student2.total);
//	
	System.out.println("종료");
//		학생 1명 출력 test		
//		Student std = new Student();
//		std.name = "이재희";
//		std.number = 13;
//		std.kor  = 99;
//		std.eng = 87;
//		std.math = 62;
//		sv.viewStudent(std);
//		
//		//makeStudent 호출
//		//이름, 번호, 국어, 영어, 수학 출력
//		StudentUtil stdutil = new StudentUtil();
//
//	//	Student std = stdutil.makestudent();
//		Student [] students = stdutil.makeStudents();
//		for(int i = 0; i< students.length;i++) {
//			Student student = students[i];
//			System.out.println("이름 : "+student.name); //이름
//			System.out.println("번호 : "+student.number); //번호
//			System.out.println("국어점수 : "+student.kor); //국어
//			System.out.println("영어점수 : "+student.eng); //영어
//			System.out.println("수학점수 : "+student.math); //수학
//			System.out.println();
//		}
		
		
	}

}
