package com.exercise.example;

import java.util.LinkedList;

public class MyStack<E> {

	public MyStack() {
		// TODO Auto-generated constructor stub
	}
	
	private LinkedList<E> list = new LinkedList<>();
	
	//ÈëÕ¾
	public void enter(E e) {
		
		list.addLast(e);
	}
	//³öÕ½
	public E delete() {
		
		System.out.println(list.getLast());
		return list.removeLast();
		
	}
}
