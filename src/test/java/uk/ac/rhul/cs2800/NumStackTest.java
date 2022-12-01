package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.EmptyStackException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NumStackTest {
  private NumStack numStack;

  @BeforeEach
  // Setting up a new instance of NumStack before every test
  public void setup() {
    numStack = new NumStack();
  }

  // 1
  // Should be able to check the size of the NumStack
  @Test
  void testSize() {
    assertEquals(numStack.size(), 0, "Testing whether I can check the size of the numstack");
  }

  // 2
  // Should be able to add to the size of the NumStack
  @Test
  void testPush() {
    numStack.push(1.0f);
    assertEquals(numStack.size(), 1, "Testing whether I can push to the numstack");
  }

  // 3
  // Should be able to pop from the NumStack
  @Test
  void testPop() {
    numStack.push(3.0f);
    numStack.pop();
    assertEquals(numStack.size(), 0, "Testing whether I can pop from the stack");
  }

  // 4
  // Test whether the method will throw an exception when popping from an empty stack
  @Test
  void testPopEmptyExeption() {
    numStack.push(5.0f);
    numStack.pop();
    assertThrows(EmptyStackException.class, () -> numStack.pop(),
        "You cannot pop from an empty stack should throw an exeption");
  }

  // 5
  // Check if empty When pushed to twice then popped from twice
  @Test
  void testisEmpty() {
    numStack.push(4.0f);
    numStack.push(5.1f);
    numStack.push(6.2f);
    numStack.pop();
    numStack.pop();
    numStack.pop();
    assertEquals(numStack.isEmpty(), true,
        "Testing whether isEmpty will return the correct values wh");

  }

  // 6
  // Check if empty When pushed to once without being popped from
  @Test
  void testisEmptyFalse() {
    numStack.push(4.0f);
    assertEquals(numStack.isEmpty(), false, "Testing whether I can push an Entry to the stack");

  }



}
