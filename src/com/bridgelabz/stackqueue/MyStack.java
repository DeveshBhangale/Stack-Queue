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
	
	public void peek(){
		System.out.println(l1.head.getKey());
	}
	
	public INode<K> pop(){
		return l1.pop();
	}	
}
