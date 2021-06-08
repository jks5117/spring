package com.base;
/*
 * ():메소드
 * ():생성자
 * ():형전환 연산자
 */
public class Test {

	public static void main(String[] args) {
		float f = 3.14f;
		double d = 3.14;
		f = d;
		//강제 형변환이 되었다.
		f = (float)d;//Casting연산자라고 함.
		d = f;
	}

}
