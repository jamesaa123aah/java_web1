package com.exercise;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			ok(5,0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
   public static void ok(int a, int b) throws Exception{
	
	   int c = a/b;
	   System.out.println(c);
	   
   }
}
