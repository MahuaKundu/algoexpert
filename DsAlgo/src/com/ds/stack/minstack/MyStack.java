package com.ds.stack.minstack;

import java.util.Stack;

// Using Nodedata
public class MyStack {
	private Stack<NodeData> stack;
	private NodeData test;
	private int min;

	public MyStack() {
		stack = new Stack<NodeData>();
	}

	public void push(int data) {
		min = data;
		if (!stack.isEmpty()&& (min = getMin())>data) {
			min = data;
		}
		test = new NodeData(data, min);
		stack.push(test);
	}

	public int pop() {

		return stack.pop().getData();
	}

	public int getMin() {
		return stack.peek().getMinValue();
	}

	@Override
	public String toString() {
		return stack.toString();
	}

}
