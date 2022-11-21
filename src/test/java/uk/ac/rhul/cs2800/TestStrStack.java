package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestStrStack {
	private StrStack strStack;
	
	
	@BeforeEach
	public void setup() {
		strStack = new StrStack();
	}
	 
	//1 Should be able to check the size of a list 
	@Test
	void testSize() {
		assertEquals(strStack.size(), 0, "List size should be zero at this point");
	}
	
	@Test
	void testPush() {
		strStack.push("Hi");
		assertEquals(strStack.size(), 0, "Not yet implemented");
	}

}
