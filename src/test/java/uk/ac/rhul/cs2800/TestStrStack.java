package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
    assertEquals(strStack.size(), 1,
        "pushed one string to stack so the size of stack should be one");
  }

  // 3
  @Test
  void testPop() {
    assertThrows(EmptyStackException.class, () -> strStack.pop(),
        "You cannot pop from an empty StrStack should throw an exeption");
  }

  // 4
  @Test
  void testPushthenPop() {
    strStack.push("Hello There");
    strStack.pop();
    assertEquals(strStack.size(), 0,
        "You cannot pop from an empty StrStack should throw an exeption");
  }


  // 5
  // Check if empty When pushed to twice then popped from twice
  @Test
  void testisEmpty() {
    strStack.push("Hello");
    strStack.push("My");
    strStack.push("Name");
    strStack.pop();
    strStack.pop();
    strStack.pop();
    assertEquals(strStack.isEmpty(), true,
        "Testing whether isEmpty will return the correct values when stack is empty");

  }

  // 6
  // Check ifEmptys return when Stack is not empty
  @Test
  void testNotEmpty() {
    strStack.push("Hi");
    assertEquals(strStack.isEmpty(), false,
        "Testing whether isEmpty will return the correct values when stack is not empty");
  }

}
