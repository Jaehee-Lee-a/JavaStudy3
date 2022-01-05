package com.java.s1.same;

public class SquareMain {

	public static void main(String[] args) {
		Square s1 = new Square();
		Square s2 = new Square();
		s1.garo = 3;
		s1.sero = 4;
		s2.garo = 4;
		s2.sero = 4;
		System.out.println(s1.same(s2));
		
		s1.garo = 4;
		s1.sero = 4;
		s2.garo = 4;
		s2.sero = 4;
		System.out.println(s1.same(s2));
	}

}
