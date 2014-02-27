package com.solairis.math.model;

/**
 *
 * @author joshjohnson
 */
public class Node {

	private final String operator;
	private final Node left;
	private final Node right;

	public Node(String operator, Node left, Node right) {
		this.operator = operator;
		this.left = left;
		this.right = right;
	}

	public Integer calculate() {
		switch (this.operator) {
			case "+":
				return this.left.calculate() + this.right.calculate();
			case "*":
				return this.left.calculate() * this.right.calculate();
			default:
				throw new RuntimeException("Unrecognized operator " + this.operator);
		}
	}

	@Override
	public String toString() {
		switch (this.operator) {
			case "+":
				return "(" + this.left.toString() + " + " + this.right.toString() + ")";
			case "*":
				return "(" + this.left.toString() + " * " + this.right.toString() + ")";
		}
		return null;
	}

}
