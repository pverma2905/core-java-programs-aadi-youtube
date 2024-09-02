package com.oop;

public class Method4 {
    
	//method with parameter with return type
	int add(int a,int b) {
		int c=a+b;
		return c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Method4 r = new Method4();
		int value = r.add(10,30);
		System.out.println(value);
	}
}
