
package com.solairis.math.model;

/**
 *
 * @author joshjohnson
 */
public class ValueNode extends Node {

	public ValueNode(Integer value) {
		super(value, null, null, null);
	}

	@Override
	public Integer calculate() {
		return this.value;
	}

	@Override
	public String toString() {
		return this.value.toString();
	}
	
}
