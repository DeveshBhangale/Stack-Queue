package com.bridgelabz.stackqueue;

public class MyNode<K> implements INode<K> {
	private K key;
	private INode next;

	public MyNode(K key) {
		this.key = (key);
		this.next = (null);
	}

	
	public K getKey() {
		return key;
	}
	
	
	public INode<K> getNext() {
		return next;
	}

	public void setNext(INode next) {
		this.next = next;
	}


	public void setKey(K key) {
		this.key = key;
	}

}
