package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.*;

import java.util.EmptyStackException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NumStackTest {
  private NumStack Numstack;
	
  @BeforeEach
  public void setup() {
    Numstack = new NumStack();
  }
 
  //1
  @Test
  void testSize() {
    Numstack.size();
    assertEquals(Numstack.size(), 0, "Testing whether I can push an Entry to the stack");
  }
  
  //2
  @Test
  void testPush() {
    Numstack.push(1.0f);
    assertEquals(Numstack.size(), 1, "Testing whether I can push an Entry to the stack");
  }
  
  //3
  @Test
  void testPop() {
    Numstack.push(3.0f);
	Numstack.pop();
    assertEquals(Numstack.size(), 0, "Testing whether I can push an Entry to the stack");
  }
  
  //4
  // Test whether the method will throw an exception when popping from an empty stack 
  @Test
  void testPopEmptyExeption() {
	   Numstack.push(5.0f);
	   Numstack.pop();
	   assertThrows(EmptyStackException.class, () -> Numstack.pop(),"You cannot pop from an empty stack should throw an exeption");
  }  
  
  //5
  //Check if empty When pushed to twice then popped from twice 
  @Test
  void testisEmpty() {
    Numstack.push(4.0f);
    Numstack.push(5.1f);
    Numstack.push(6.2f);
    Numstack.pop();
    Numstack.pop();
    Numstack.pop();
    assertEquals(Numstack.isEmpty(), true, "Testing whether I can push an Entry to the stack");
	  
  }
  
  //6
  //Check if empty When pushed to once without being popped from
  @Test
  void testisEmptyFalse() {
    Numstack.push(4.0f);
    assertEquals(Numstack.isEmpty(), false, "Testing whether I can push an Entry to the stack");
	  
  }
  
  
  
  
  

}
