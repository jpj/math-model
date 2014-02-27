package com.solairis.math.model;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Before;
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
	public void verify_test_construction() {
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
	}

	@Test
	public void verify_addition_node_calculation() {

		Node addition = new Node(
			null,
			"+",
			new Node(2, null, null, null),
			new Node(3, null, null, null)
		);
		
		assertThat(addition.calculate(), is(5));
	}
	
	@Test
	public void verify_can_handle_2_additions() {
		Node add = new Node(
			null,
			"+",
			new Node(5, null, null, null),
			new Node(null, "+",
				new Node(11, null, null, null),
				new Node(27, null, null, null)
			)
		);
		
		assertThat(add.calculate(), is(43));
	}
	
	@Test
	public void verify_toString() {
		Node add = new Node(null, "+",
			new Node(1, null, null, null),
			new Node(2, null, null, null)
		);
		
		String result = add.toString();
		assertThat(result, is("(1 + 2)"));
	}
	
	@Test
	public void verify_slightly_more_complex_toString() {
		// 1 + 2 + 3 --> (1 + (2 + 3))
		Node add = new Node(null, "+",
			new Node(1, null, null, null),
			new Node(null, "+",
				new Node(2, null, null, null),
				new Node(3, null, null, null)
			)
		);
		
		String result = add.toString();
		assertThat(result, is("(1 + (2 + 3))"));
	}

}
