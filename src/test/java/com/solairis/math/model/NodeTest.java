package com.solairis.math.model;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

/**
 *
 * @author joshjohnson
 */
public class NodeTest {
	
	@Test(expected = RuntimeException.class)
	public void verify_RuntimeException_on_invalid_operator() {
		Node node = new Node(null, "blah", null, null);
		Integer result = node.calculate();
	}
	
	@Test
	public void verify_original_examples_toString() {
		// 1 + 2 * 3 --> (1 + (2 * 3))
		//
		//   +
		//  / \
		//  1  *
		//    / \
		//    2  3
		Node root = new Node(
			null,
			"+",
			new Node(1, null, null, null),
			new Node(
				null,
				"*",
				new Node(2, null, null, null),
				new Node(3, null, null, null)
			)
		);
		
		assertThat(root.calculate(), is(7));
		assertThat(root.toString(), is("(1 + (2 * 3))"));
	}

}
