package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.EmptyStackException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// all the tests are work 10 marks max

class TestStack {
  private Rhulstack rs;

  // 1
  // Testing whether i can build a rhul Stack
  // removing a once and only once smell by setting up a setup method

  @BeforeEach
  public void setup() {
    rs = new Rhulstack();
  }

  // 2
  @Test
  void testSize() {
    rs = new Rhulstack();
  }

  // 3
  // Attempt to Refactor
  // rs.push(new Entry(1.0f));
  @Test
  void testPush() {
    rs.push(new Entry(1));
    assertEquals(rs.size(), 1, "Testing whether I can push an Entry to the stack");
  }

  // 4
  @Test
  void testEmptyPop() {
    assertThrows(EmptyStackException.class, () -> rs.pop(),
        "Poping from an empty stack should throw exeption");
  }

  // 5
  @Test
  void pushThenPop() {
    rs.push(new Entry(1.0f));
    assertEquals(rs.pop().getValue(), 1.0f);
    assertEquals(rs.size(), 0, "Pushed 1 and popped 1 and expect size to be 0 ");
    assertThrows(EmptyStackException.class, () -> rs.pop(),
        "You cannot pop from an empty stack should throw an exeption");

  }

  // 6
  @Test
  void pushTwice() {
    rs.push(new Entry(1));
    rs.push(new Entry(2));
    assertEquals(rs.pop().getValue(), 2.0f);
    assertEquals(rs.pop().getValue(), 1.0f);
    assertEquals(rs.size(), 0, "Pushed 1 then 2 and poped 2 then 1 and expect size to be 0 ");
    assertThrows(EmptyStackException.class, () -> rs.pop(),
        "You cannot pop from an empty stack should throw an exeption");

  }

  // 7
  @Test
  void pushLoads() {
    for (int x = 0; x < 1000; x += 1) {
      rs.push(new Entry(x + 1));
    }
    assertEquals(rs.size(), 1000);
  }

  // 8
  // Stack should be able to pop from the Very top of the Stack
  @Test
  void pushTop() {
    rs.push(new Entry(1));
    assertEquals(rs.top().getValue(), 1.0f);
    rs.pop();
  }


  // 9 Top when empty
  @Test
  void emptyTop() {
    rs.push(new Entry(1));
    rs.pop();
    assertThrows(EmptyStackException.class, () -> rs.top());
  }

  // 10 clear stack
  @Test
  void pushTwiceClearStack() {
    rs.push(new Entry(3));
    rs.push(new Entry(3));
    for (int x = 0; x < 1000; x += 1) {
      if (rs.size() == 0) {
        assertThrows(EmptyStackException.class, () -> rs.pop());
      } else {
        rs.pop();
      }
    }
  }



}

