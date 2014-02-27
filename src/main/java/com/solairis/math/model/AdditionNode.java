
package com.solairis.math.model;

/**
 *
 * @author joshjohnson
 */
public class AdditionNode extends OperatorNode {

	public AdditionNode(Node left, Node right) {
		super(null, left, right);
	}

	@Override
	public Integer calculate() {
		return this.left.calculate() + this.right.calculate();
	}

	@Override
	public String toString() {
		return "(" + this.left.toString() + " + " + this.right.toString() + ")";
	}
	
}
