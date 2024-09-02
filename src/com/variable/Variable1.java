package com.variable;

public class Variable1 {
	
	static int z=10; // static variable
	int c=100; // instance variable
	Variable1(int a){ // local variable
		int b=20; // local variable
		System.out.println(b);
	}
	
	void add(int b) { // local variable
		int a=10; // local variable
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Variable1 v = new Variable1(10);
		System.out.println(v.z);   // access static variable
		System.out.println(Variable1.z);
		System.out.println(v.c);
		v.add(10);
	}

}
