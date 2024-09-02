package com.conditionalStatement;

public class Demo {
	
	public static void main(String[] args) {
		int percentage=90;
		if(percentage>=80) {
		System.out.println("very good");
		}else if(percentage>60 && percentage<=79) {
			System.out.println("good");
		}else {
			System.out.println("average");
		}
		System.out.println("if ke baad");
	}

}
