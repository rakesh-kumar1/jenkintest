package com.tcs.jenkins;

public class TestClass {
	
	public static void main(String[] args) {
		System.out.println("In the test class......");
		System.out.println("Testing auto build in jenkins");
		System.out.println("Printing numbers from 1 to 10");
		
		for(int i=0;i<=10;i++) {
			
			System.out.println(+i);
		}
		
		
		new TestClass().sayHello();
		
			
	}
	
	
	
	public void sayHello () {
		
		System.out.println("Hello World from Jenkins using maven --- auto build. !!");
	}

}
