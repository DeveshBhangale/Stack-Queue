package com.bridgelabz.stackqueue;



public class Runner {

	public static void main(String[] args) {
		
		MyStack<Integer> myStack = new MyStack<>();
		MyQueue<Integer> myQueue = new MyQueue<>();
		MyNode<Integer> firstNode = new MyNode<>(70);
		MyNode<Integer> secondNode = new MyNode<>(30);
		MyNode<Integer> thirdNode = new MyNode<>(56);
		
		// Use Case 1
		myStack.push(firstNode);
		myStack.push(secondNode);
		myStack.push(thirdNode);
		myStack.printStack();
		
		// Use Case 2
		myStack.peek();
		myStack.pop();		
		myStack.printStack();
		
		// Use Case 3
		myQueue.enqueue(thirdNode);
		myQueue.enqueue(secondNode);
		myQueue.enqueue(firstNode);
		myQueue.printQueue();
	}

}
