
package com.solairis.math.model;

/**
 *
 * @author joshjohnson
 */
public class ValueNode implements Node {
	
	private final Integer value;

	public ValueNode(Integer value) {
		this.value = value;
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
