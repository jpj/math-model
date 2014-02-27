
package com.solairis.math.model;

/**
 *
 * @author joshjohnson
 */
public class MultiplicationNode extends OperatorNode {

	public MultiplicationNode(Node left, Node right) {
		super(null, left, right);
	}

	@Override
	public Integer calculate() {
		return this.left.calculate() * this.right.calculate();
	}

	@Override
	public String toString() {
		return "(" + this.left.toString() + " * " + this.right.toString() + ")";
	}
	
}
