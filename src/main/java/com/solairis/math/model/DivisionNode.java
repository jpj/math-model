
package com.solairis.math.model;

/**
 *
 * @author joshjohnson
 */
public class DivisionNode extends OperatorNode {

	public DivisionNode(Node left, Node right) {
		super(left, right);
	}

	@Override
	public Integer calculate() {
		return this.left.calculate() / this.right.calculate();
	}

	@Override
	public String toString() {
		return "(" +this.left.toString() + " / " + this.right.toString() + ")";
	}
	
}
