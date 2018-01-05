package com.exercise.example;

public class C {

	public C() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node<Integer> head = null;
		Node<Integer> tail = null;
		
		head = new Node("node1");
		tail = head;
		//创建新节点 同时和最后一个节点连接起来
		tail.next = new Node("node1data2");
		//尾节点指向新的节点
		tail = tail.next;
		tail.next = new Node("node1data3");
		tail = tail.next;
		
		Node<Integer> current = head;
		//正序遍历
//		while (current!=null) {
//			System.out.println(current.item);
//		    current = current.next;			
//		}

		
		
		current.printListRev(head);
	}
	
	


}

class Node<E>{
	E item;
	Node<E> next;
	
	public Node(E element) {
		// TODO Auto-generated constructor stub
		this.item = element;
		this.next = null;
		
	}
	
	void printListRev(Node<E> head) {
	//倒序遍历链表主要用了递归的思想
	    if (head != null) {
	        printListRev(head.next);
	        System.out.println(head.item);
	    }
	}
}
