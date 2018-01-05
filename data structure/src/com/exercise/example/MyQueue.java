package com.exercise.example;

import java.util.LinkedList;

public class MyQueue <E>{

	public MyQueue() {
		// TODO Auto-generated constructor stub
	}
	private LinkedList<E> list = new LinkedList<>();
	
	
	//入队
	public void enterQueue(E e) {
		list.addLast(e);
	}
	//出队
	public E deleteQueue() {
		return list.removeFirst();
	}
}
