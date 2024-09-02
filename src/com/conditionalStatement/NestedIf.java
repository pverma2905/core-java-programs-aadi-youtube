package com.conditionalStatement;

public class NestedIf {
	
	public static void main(String[] args) {
		String name="aadi";
		boolean javaDeveloper = false;
		boolean javaTrainer = true;
		
		if(name.equals("aadi")) {
			if(javaDeveloper) {
				System.out.println(name+" is a java developer");
			}else {
				System.out.println(name+" is a java trainer");
			}
		}else if(name.equals("pranav")) {
			if(javaDeveloper) {
				System.out.println(name+" is a java developer");
			}else {
				System.out.println(name+" is a java trainer");
			}
		}else {
			System.out.println("unknown");
		}
	}

}
