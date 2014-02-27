package com.solairis.math.model;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

/**
 *
 * @author joshjohnson
 */
public class NodeTest {
	
	@Test
	public void verify_original_examples_calculates() {
		// 1 + 2 * 3 --> (1 + (2 * 3))
		//
		//   +
		//  / \
		//  1  *
		//    / \
		//    2  3
		Node root = new AdditionNode(
			new ValueNode(1),
			new MultiplicationNode(
				new ValueNode(2),
				new ValueNode(3)
			)
		);
		
		assertThat(root.calculate(), is(7));
		assertThat(root.toString(), is("(1 + (2 * 3))"));
	}
	
	@Test
	public void verify_division_example() {
		Node root = new AdditionNode(
			new ValueNode(1),
			new DivisionNode(
				new ValueNode(6),
				new ValueNode(2)
			)
		);
		
		assertThat(root.calculate(), is(4));
		assertThat(root.toString(), is("(1 + (6 / 2))"));
	}

}
