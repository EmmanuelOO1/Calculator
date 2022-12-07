package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class TestRevPolishCalc {
  private RevPolishCalc values;

  @BeforeEach
  public void setup() {
    values = new RevPolishCalc();
  }

  // 1
  // RevPolishCalc should be able to add two positive numbers
  @Test
  void testAddPositive() {
    assertEquals(values.evaluate("2 3 +"), 5.0f, "2+ 3 should be 5");
  }

  // 2
  // RevPolishCalc should be able to add two negative numbers.
  @Test
  void testAddNegative() {
    assertEquals(values.evaluate("-2 -3 +"), -5.0f, "-3+ -2 should be -5");
  }

  // 3
  // RevPolishCalc should be able to subtract two numbers.
  @Test
  void testSubtract() {
    assertEquals(values.evaluate("2 3 -"), -1.0f, "3 - 2 should be 1");
  }

  // 4
  // RevPolishCalc should be able to times two numbers.
  @Test
  void testTimes() {
    assertEquals(values.evaluate("6 3 *"), 18.0f, "6 * 3 should be 18");
  }

  // 5
  // RevPolishCalc should be able to times two numbers.
  @Test
  void testTimesNegative() {
    assertEquals(values.evaluate("6 -3 *"), -18.0f, "6 * -3 should be -18");
  }


  // 6
  // RevPolishCalc should be able to divide two numbers.
  @Test
  void testDivide() {
    assertEquals(values.evaluate("6 2 /"), 3.0f, "6 / 2 should be 3");
  }

  // 7
  // RevPolishCalc should be able to divide two negative numbers.
  @Test
  void testDivideNegative() {
    assertEquals(values.evaluate("6 -3 /"), -2f, "6 * -3 should be -2");
  }



}
