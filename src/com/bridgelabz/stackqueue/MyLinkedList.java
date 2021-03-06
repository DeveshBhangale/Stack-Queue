package com.bridgelabz.stackqueue;

public class MyLinkedList<K> {
	
	INode<K> head;
	private INode<K> tail;
	
	public void add(INode<K> newNode) {
		if(tail == null) {
			tail = newNode;
		}
		if(head == null) {
			head = newNode;
		}
		else {
			INode<K> tempNode = head;
			head = newNode;
			head.setNext(tempNode);
		}
		
	}
	public void print() {
		INode<K> tempNode = head;
		StringBuffer str = new StringBuffer("My Nodes: ");
		while(tempNode != null) {
			str.append(tempNode.getKey());
			if(!tempNode.equals(tail))
				 str.append("->");
			tempNode = tempNode.getNext();
		}
		System.out.println(str);
	}
	
	public INode<K> pop() {
		INode<K> tempNode = this.head;
		this.head = head.getNext();
		return tempNode;
	}
	
	public void deQueue(){
		while(head!=null) {
			System.out.println("Removing "+ head.getKey() +" from linkedlist");
			head = head.getNext();
		}
	}
	
}
