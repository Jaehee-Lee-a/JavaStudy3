package com.java.s1.method;

import java.util.Scanner;

public class MethodMain {

	public static void main(String[] args) {
		System.out.println("MainMethod Start");

		ReturnStudy rs = new ReturnStudy(); // 메소드 사용을 위해 객체 생성
		rs.test1(); // 참조변수명.멤버들 (메소드 사용)
		int num = rs.test2();
		System.out.println("Main : " + num);
		
		String name = rs.test3();
		System.out.println("Test3 : "+name);
		
		double num2 = Math.random();
		System.out.println("Math.random : "+num2);
		
		Scanner sc = rs.test4();
		System.out.println("나이를 입력하세요.");
		int age = sc.nextInt();
		
		System.out.println("age : "+age);
		System.out.println("MainMethod Finish");
	}
}
