package com.exercise;

public class ExceptionDemo {

	static class MyClass{
		
		int a = 5;	
		int b =6;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass myClass = null;
		myClass = new MyClass();
		int c;
		try {
			c = myClass.a/myClass.b;
			System.out.println("value: "+c);
			
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("final!");
	}

}
