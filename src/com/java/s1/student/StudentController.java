package com.java.s1.student;

import java.util.Scanner;

public class StudentController {
	public void start() {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		StudentUtil su = new StudentUtil(); //정보 입력
		StudentView sv = new StudentView(); //정보 출력
		Student [] students = null; //학생들의 정보를 담을 객체
		
		while(flag) {
			System.out.println("번호를 선택하세요.");
			System.out.println("1. 학생들의 정보 입력"); //util class
			System.out.println("2. 학생들의 정보 출력");  //view class
			System.out.println("3. 프로그램 종료"); // 3누르기 전까지 무한반복 
			int select = sc.nextInt();
			
			switch(select) {
			case 1 :
				students = su.makeStudents();
				break;
			case 2 :
				sv.viewStudents(students);
				break;
			default :
				System.out.println("프로그램을 종료합니다.");
				flag = false;
				break;
	
			}//switch 끝
		}//while 끝
	}//메소드 끝
} //class 끝
