package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.*;
import java.util.EmptyStackException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestOpStackTest {
  private OpStack opStack;

  @BeforeEach
  public void setup() {
    opStack = new OpStack();
  }

  // 1
  // Should be able to check the size of the StrStack
  @Test
  void testSize() {
    assertEquals(opStack.size(), 0, "List size should be zero at this point");
  }


  // 2
  // Adding a symbol to oSstack
  @Test
  void testPush() {
    opStack.push(Symbol.PLUS);
    assertEquals(opStack.size(), 1, "size should be 1 at this point ");
  }


  // 3
  // Adding a symbol to opStack
  @Test
  void testPushPop() {
    opStack.push(Symbol.PLUS);
    opStack.pop();
    assertEquals(opStack.size(), 0, "size should be 0 at this point ");
  }


  // 4
  // Trying to pop from an empty stack should cause an exception
  @Test
  void testEmptyPop() {
    assertThrows(EmptyStackException.class, () -> opStack.pop(),
        "Poping from an empty stack should throw exeption");
  }
  
  
  // 5
  // Check if empty When pushed to thrice then popped from thrice
  @Test
  void testisEmpty() {
    opStack.push(Symbol.PLUS);
    opStack.push(Symbol.MINUS);
    opStack.push(Symbol.LEFT_BRACKET);
    opStack.pop();
    opStack.pop();
    opStack.pop();
    assertEquals(opStack.isEmpty(), true,
        "Testing whether isEmpty will return the correct values wh");
  }
  
  
  // 6
  // Check if empty When pushed to once without being popped from
  @Test
  void testisEmptyFalse() {
    opStack.push(Symbol.RIGHT_BRACKET);
    assertEquals(opStack.isEmpty(), false, "Stack is not empty therefore should be false");
  }



}
