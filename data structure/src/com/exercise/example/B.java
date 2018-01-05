package com.exercise.example;

import java.awt.FontFormatException;

public class B {

	public B() {
		// TODO Auto-generated constructor stub
	}
	
	void functionA(int size){
		int[] oldA = new int[10];
		for (int i = 0; i < oldA.length; i++) {
			oldA[i] = i++;
		}
		
		if (size>oldA.length) {
			int[] newA = new int[size];
			for (int i = 0; i < newA.length; i++) {
				if (i<oldA.length) {
					newA[i] = oldA[i];
				}else {
					newA[i] = 9;
				}
				
			}
			
		}else {
			int[] newA = new int[oldA.length];
			for (int i = 0; i < newA.length; i++) {
					newA[i] = oldA[i];

				
			}
		}
		
		
		for (int i = 0; i < size; i++) {
			
			System.out.println();
		}
		
	}
	
}
