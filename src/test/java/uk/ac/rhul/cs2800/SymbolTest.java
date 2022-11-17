package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SymbolTest {
	Symbol symbol;
	
	//Test 1
	@Test
	void testLEFT_BRACKET() {
		assertEquals(Symbol.LEFT_BRACKET.toString(), "LEFT_BRACKET");	
	}
	
	//Test 2
	@Test
	void testRIGHT_BRACKET() {
		assertEquals(Symbol.RIGHT_BRACKET.toString(), "RIGHT_BRACKET");	
	}
	
	//Test 3
	@Test
	void testTIMES() {
		assertEquals(Symbol.TIMES.toString(), "TIMES");	
	}
	
	//Test 4
	@Test
	void testDIVIDE() {
		assertEquals(Symbol.DIVIDE.toString(), "DIVIDE");	
	}
	
	//Test 5
	@Test
	void testPLUS() {
		assertEquals(Symbol.PLUS.toString(), "PLUS");	
	}
	
	//Test 6
	@Test
	void testMINUS() {
		assertEquals(Symbol.MINUS.toString(), "MINUS");	
	}

	//Test 7
	@Test
	void testINVALID() {
		assertEquals(Symbol.INVALID.toString(), "INVALID");	
	}
	
}
