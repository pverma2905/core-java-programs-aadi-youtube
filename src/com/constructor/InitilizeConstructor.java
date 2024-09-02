package com.constructor;

public class InitilizeConstructor {
	
	int id;
	String name;
	
	InitilizeConstructor(int eid, String ename){
		id=eid;
		name=ename;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InitilizeConstructor i1 = new InitilizeConstructor(101,"aadi");
		System.out.println(i1.id+" "+i1.name);
		InitilizeConstructor i2 = new InitilizeConstructor(102,"pranav");
		System.out.println(i2.id+" "+i2.name);
		InitilizeConstructor i3 = new InitilizeConstructor(103,"shalaj");
		System.out.println(i3.id+" "+i3.name);

	}

}
