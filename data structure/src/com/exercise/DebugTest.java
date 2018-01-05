package com.exercise;

import javax.swing.JFrame;

public class DebugTest {

	public static void main(MyString[] args) {
		
		int[] ints = new int[20];
		for (int i = 0; i < ints.length+1; i++) {
			try {
				ints[i] = i+1;
				System.out.println(i+1);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.err.println("数组越界");
			}
		}				
				
		
		// TODO Auto-generated method stub
		System.out.println("dada");
		System.err.println("this is erro");
		System.out.println(new JFrame(){
			
			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return "thid id";
				
				
			}
		});

	}

}
