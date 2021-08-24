package com.bridgelabz.stackqueue;

public class MyStack<K> {
	private final MyLinkedList<K> l1;
	
	public MyStack() {
		l1 = new MyLinkedList<>();		
	}
	
	public void push(INode<K> element) {
		l1.add(element);
	}
	
	public void printStack() {
		l1.print();
	}
}
