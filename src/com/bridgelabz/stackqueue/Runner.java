package com.bridgelabz.stackqueue;



public class Runner {

	public static void main(String[] args) {
		
		MyStack<Integer> myStack = new MyStack<>();
		MyNode<Integer> firstNode = new MyNode<>(70);
		MyNode<Integer> secondNode = new MyNode<>(30);
		MyNode<Integer> thirdNode = new MyNode<>(56);
		
		// Use Case 1
		myStack.push(firstNode);
		myStack.push(secondNode);
		myStack.push(thirdNode);
		myStack.printStack();
	}

}
