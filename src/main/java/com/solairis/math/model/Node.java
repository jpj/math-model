
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
	
	public Node left() {
		return this.left;
	}
	
	public Node right() {
		return this.right;
	}
	
	public Integer value() {
		return this.value;
	}
	
	public String operator() {
		return this.operator;
	}
	
	public Integer calculate() {
		return null;
	}
	
}
