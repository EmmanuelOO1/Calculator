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
	 
	
	@Test
	void testSize() {
		assertEquals(strStack.size(), 0, "")
	}
	
	@Test
	void testPush() {
		
		assertEquals("Not yet implemented");
	}

}
