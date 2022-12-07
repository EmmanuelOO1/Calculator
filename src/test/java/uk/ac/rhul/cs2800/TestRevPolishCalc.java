package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.*;
import java.util.EmptyStackException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestRevPolishCalc {
  private RevPolishCalc values;

  @BeforeEach
  public void setup() {
    values = new RevPolishCalc();
  }
  
  //1
  // RevPolishCalc should be able to add two positive numbers
  @Test
  void testAddPositive() {
    assertEquals(values.evaluate("2  3 + "), 5.0f, "2+ 3 should be 5");
  }
  
  //2
  // RevPolishCalc should be able to add two nevative numbers.
  @Test
  void testAddNegative() {
    assertEquals(values.evaluate("-2  -3 + "), -5.0f, "2+ 3 should be 5");
  }
  
  
  
  

}
