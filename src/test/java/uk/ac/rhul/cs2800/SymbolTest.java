package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SymbolTest {
	Symbol symbol;
	
	//Test 1
	@Test
	void testLEFT_BRACKET() {
		assertEquals(Symbol.LEFT_BRACKET.toString(), "(");	
	}
	
	//Test 2
	@Test
	void testRIGHT_BRACKET() {
		assertEquals(Symbol.RIGHT_BRACKET.toString(), ")");	
	}
	
	//Test 3
	@Test
	void testTIMES() {
		assertEquals(Symbol.TIMES.toString(), "*");	
	}
	
	//Test 4
	@Test
	void testDIVIDE() {
		assertEquals(Symbol.DIVIDE.toString(), "/");	
	}
	
	//Test 5
	@Test
	void testPLUS() {
		assertEquals(Symbol.PLUS.toString(), "+");	
	}
	
	//Test 6
	@Test
	void testMINUS() {
		assertEquals(Symbol.MINUS.toString(), "-");	
	}

	//Test 7
	@Test
	void testINVALID() {
		assertEquals(Symbol.INVALID.toString(), "INVALID");	
	}
	
}
