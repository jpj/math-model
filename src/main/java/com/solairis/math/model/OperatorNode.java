
package com.solairis.math.model;

/**
 *
 * @author joshjohnson
 */
public abstract class OperatorNode implements Node {
	
	protected final Node left;
	protected final Node right;

	public OperatorNode(Node left, Node right) {
		this.left = left;
		this.right = right;
	}
	
}
