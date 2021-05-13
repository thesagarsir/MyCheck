package com.test;

public class A {
	
	
	void printName() {
		
		System.out.println("Aniket");
		
	}
	
	void addtion(int a, int b){
		
		int c = a+b;
		
		System.out.println(c);
		
	}
	
	
	public static void main(String[] args) {
		
		A a =  new A();
		a.printName();
		a.addtion(50, 50);
	}
}

