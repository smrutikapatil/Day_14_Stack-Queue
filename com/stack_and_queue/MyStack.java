package com.stack_and_queue;

public class MyStack<T> {
	private final MyLinkedList myLinkedList;

	public MyStack() {
		this.myLinkedList = new MyLinkedList();
	}

	public INode enqueue(MyNode<Integer> myenqueueNode) {
		return myLinkedList.enqueue(myenqueueNode);
	}

	public INode dequeue() {
		return myLinkedList.dequeue();
	}

	public void push(INode myNode) {
		myLinkedList.add(myNode);
	}

	public INode peak() {
		return myLinkedList.head;
	}

	public INode pop() {
		return myLinkedList.pop();
	}

	public void printStack() {
		myLinkedList.printMyNode();
	}
}
