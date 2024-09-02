package com.constructor;

public class Constructor1 {

	Constructor1(){  
	// non parameterised constructor and default constructor
		System.out.println("constructor call");
	}
	
	// parameterised constructor
	Constructor1(int a){
		System.out.println("constructor call2 "+a);
	}
	
	Constructor1(int a,String s){
		System.out.println("constructor call2 "+a+" "+s);
	}
	
	void add() {
		System.out.println("hiii");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor1 c = new Constructor1();
		c.add();
		c.add();
		
		Constructor1 c1 = new Constructor1();
		c1.add();
		c1.add();
		
		Constructor1 c2 = new Constructor1(10);
		c2.add();
		c2.add();
		
		Constructor1 c3 = new Constructor1(10,"pranav");
		c3.add();
		c3.add();
	}

}
