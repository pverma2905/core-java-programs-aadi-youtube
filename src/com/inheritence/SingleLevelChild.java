package com.inheritence;

public class SingleLevelChild extends SingleLevelParent {
	
	void m2() {
		System.out.println("child class method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleLevelChild b1 = new SingleLevelChild();
		b1.m2();
		b1.m1();
		b1.aadi();

	}

}
