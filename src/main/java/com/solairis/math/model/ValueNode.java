
package com.solairis.math.model;

/**
 *
 * @author joshjohnson
 */
public class ValueNode extends Node {
	
	private final Integer value;

	public ValueNode(Integer value) {
		super(null, null, null);
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
