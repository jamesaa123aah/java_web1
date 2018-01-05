package com.exercise.example;

import javax.swing.plaf.basic.BasicBorders.FieldBorder;

public class Digui {

	public Digui() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibo(3));
	}
	
	
	public static long fibo(int n) {
		
		if(1==n || 0==n){
			return 0;
		}
		else{
			long a = fibo(n-1);
			long b = fibo(n-2);
			long result = a+b;
			
			return result;
		}
		
		
	}
}
