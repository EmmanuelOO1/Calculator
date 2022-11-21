package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.*;

import java.util.EmptyStackException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestStrStack {
    private StrStack strStack;

    @BeforeEach
    public void setup() {
	strStack = new StrStack();
    }

    // 1
    // Should be able to check the size of the StrStack
    @Test
    void testSize() {
	assertEquals(strStack.size(), 0, "List size should be zero at this point");
    }

    // 2
    // Should be able to push strings to the StrStack
    @Test
    void testPush() {
	strStack.push("Hi");
	assertEquals(strStack.size(), 0, "Not yet implemented");
    }

    // 3
    @Test
    void testPop() {
	assertThrows(EmptyStackException.class, () -> strStack.pop(),"You cannot pop from an empty StrStack should throw an exeption");

	
    }

}
