package com.fundamentalConcept;

public class Operator {
	
	public static void main(String[] args) {
		int a=100, b=50;
		// arthmetic
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		// relational
		System.out.println(100<=100);
		System.out.println(100<20);
		System.out.println(100==100);
		
		// logical
		System.out.println(10!=20 && 10<20 && 10==20);
		System.out.println(10>20 || 10==20);
		System.out.println(!(10>20));
		
		//postfix -> increment/decrement
		
		int x=5;
		int y=5;
		System.out.println(++x);
		System.out.println(x++);
		System.out.println(x);
		System.out.println(--y);
		System.out.println(y--);
		System.out.println(y);
		
		// ternary operator
		int r=10, s=20;
		System.out.println(r>s?r:s);
		
		
		
		
	}

}
