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
	public void verify_original_examples_toString() {
		// 1 + 2 * 3 --> (1 + (2 * 3))
		//
		//   +
		//  / \
		//  1  *
		//    / \
		//    2  3
		Node root = new AdditionNode(
			new ValueNode(1),
			new OperatorNode(
				"*",
				new ValueNode(2),
				new ValueNode(3)
			)
		);
		
		assertThat(root.calculate(), is(7));
		assertThat(root.toString(), is("(1 + (2 * 3))"));
	}

}
