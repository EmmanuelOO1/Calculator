package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.*;
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
  // Adding a symbol to opstack
  @Test
  void testPush() {
    opStack.push(Symbol.PLUS);
    assertEquals(opStack.size(), 1,"size should be 1 at this point ");
  }

}
