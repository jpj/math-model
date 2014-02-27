
package com.solairis.math.model;

/**
 *
 * @author joshjohnson
 */
public abstract class OperatorNode implements Node {
	
	private final String operator;
	protected final Node left;
	protected final Node right;

	public OperatorNode(String operator, Node left, Node right) {
		this.operator = operator;
		this.left = left;
		this.right = right;
	}

	@Override
	public String toString() {
		return null;
	}

	@Override
	public Integer calculate() {
		return null;
	}
	
}
