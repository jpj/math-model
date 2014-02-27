
package com.solairis.math.model;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author joshjohnson
 */
public class NodeTest {
	
	private Node node;
	
	@Before
	public void setUp() {
		this.node = new Node(null, "+", null, null);
	}
	
	@Test
	public void verify_Node_has_left() {
		Node left = this.node.left();
	}
	
	@Test
	public void verify_Node_has_right() {
		Node right = this.node.right();
	}
	
	@Test
	public void verify_Node_has_value() {
		Integer value = this.node.value();
	}
	
	@Test public void verify_Node_has_operator() {
		String operator = this.node.operator();
	}
	
	@Test public void verify_Node_has_calculate() {
		this.node.calculate();
	}
	
}
