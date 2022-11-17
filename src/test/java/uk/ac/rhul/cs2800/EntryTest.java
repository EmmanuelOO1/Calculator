package uk.ac.rhul.cs2800;

//import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EntryTest {
  private Entry nf;
  private Entry nf2;
  private Entry ns;

  // B4 setup
  @BeforeEach
  public void setup() {
    nf = new Entry(5.0f);
  }

  // 1
  // Entering a value to the class entry
  @Test
  void entryValue() {
    assertEquals(nf.getValue(), 5.0f);
  }

  // 2
  // Entry class should be able to print everything in a toString when it only contains a float
  @Test
  void printEntry() {
    assertEquals(nf.toString(), "5.0");
  }

  // 3
  // Entry class should be able to tell if two entries are equal
  @Test
  void entryEntryUnequal() {
    nf = new Entry(5.0f);
    nf2 = new Entry(5.0f);
    assertTrue(nf.equals(nf2));
  }

  // 4
  // Entry stack Must be dynamic and as such must be able to hold a string too

  // 5
  // Converting to a Before each to remove a code smell
  @BeforeEach
  public void setup2() {
    ns = new Entry("S");
  }

  // 6
  // Entering a String into the class entry
  @Test
  void enterString() {
    assertEquals(ns.getString(), "S");
  }

  // 7
  // Entry class should be able to print everything in a toString when it only contains a String
  // Test currently fails as I need to see the difference between a float toString and a string to
  // string
  // Changed toString method so 0.0 is passes as not a variable
  @Test
  void printString() {
    assertEquals(ns.toString(), "S");
  }



}
