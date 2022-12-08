package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StandardCalcTest {
  private StandardCalc standardCalc;
  
  @BeforeEach
  public void setup() {
    standardCalc = new StandardCalc();
  }
  
  // 1
  //  should be able to add two positive numbers
  @Test
  void testAddPositive() {
    assertEquals(standardCalc.evaluate("2 + 3"), 5.0f, "2+ 3 should be 5");
  }
  
  
  // 2
  //  should be able to add two negative numbers
  @Test
  void testAddNegative() {
    assertEquals(standardCalc.evaluate("-2 + -3"), 5.0f, "-2+ -3 should be 5");
  }
  
  
  // 3
  //should be able to add two negative numbers
  @Test
  void testMinus() {
    assertEquals(standardCalc.evaluate("3 - 2"), 1.0f, "3 - 2 should be 1");
  }
  

}
  

