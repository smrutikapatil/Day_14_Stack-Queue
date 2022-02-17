package com.stack_and_queue;

public class MyStack<T> {
	private final MyLinkedList myLinkedList;

	public MyStack() {
		this.myLinkedList = new MyLinkedList();
	}

	public void push(INode myNode) {
		myLinkedList.add(myNode);
	}

	public void printStack() {
		myLinkedList.printMyNode();

	}

	public INode peak() {
		return myLinkedList.head;
	}

	public INode pop() {
		return myLinkedList.pop();	
		
	}

}
