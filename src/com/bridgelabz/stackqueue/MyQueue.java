package com.bridgelabz.stackqueue;

public class MyQueue<K> {
	private final MyLinkedList<K> l1;
	
	public MyQueue() {
		l1 = new MyLinkedList<>();		
	}
	
	
	// Use Case 3
	public void enqueue(INode<K> element) {
		l1.add(element);
	}

	public void printQueue() {
		l1.print();
	}
	
	public void deQueue() {
		l1.deQueue();
	}
}
