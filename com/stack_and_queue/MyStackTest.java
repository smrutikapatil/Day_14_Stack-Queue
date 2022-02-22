package com.stack_and_queue;
import org.junit.Assert;
import org.junit.Test;

public class MyStackTest {
	@Test
	public void enQueueElement() {
		MyStack myStack = new MyStack();
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		myStack.printStack();
	}
}
	