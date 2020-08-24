package com.ds.stack.minstack;

public class NodeData {

	private int data;
	private int minValue;

	public NodeData() {
		// TODO Auto-generated constructor stub
	}

	public NodeData(int data, int minValue) {
		super();
		this.data = data;
		this.minValue = minValue;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public int getMinValue() {
		return minValue;
	}

	public void setMinValue(int minValue) {
		this.minValue = minValue;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("data=").append(data).append(", minValue=").append(minValue).append("\n");
		return builder.toString();
	}

}
