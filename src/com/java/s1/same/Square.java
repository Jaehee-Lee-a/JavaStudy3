package com.java.s1.same;

public class Square {
	int garo;
	int sero;
	
	
	public boolean same (Square s) {
		//멤버변수 garo랑 매개변수로 받은 객체의 garo가 같고
		//멤버변수 sero랑 매개변수로 받은 객체의 sero가 같으면 true reutrn
		//하나라도 틀리면 false return
		
		if((this.garo == s.garo) && (this.sero == s.sero))
			return true;
		else
			return false;
	}
}
