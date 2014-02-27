package com.solairis.math.model;

/**
 *
 * @author joshjohnson
 */
public class Node {

	private final Integer value;
	private final String operator;
	private final Node left;
	private final Node right;

	public Node(Integer value, String operator, Node left, Node right) {
		this.value = value;
		this.operator = operator;
		this.left = left;
		this.right = right;
	}

	public Integer calculate() {
		if (this.operator != null) {
			switch (this.operator) {
				case "+":
					return this.left.calculate() + this.right.calculate();
				case "*":
					return this.left.calculate() * this.right.calculate();
				default:
					throw new RuntimeException("Unrecognized operator " + this.operator);
			}
		} else if (this.value != null) {
			return this.value;
		}

		return null;
	}

	@Override
	public String toString() {
		if (this.operator != null) {
			switch (this.operator) {
				case "+":
					return "(" + this.left.toString() + " + " + this.right.toString()+")";
			}
		} else if (this.value != null) {
			return this.value.toString();
		}
		
		return null;
	}

}
