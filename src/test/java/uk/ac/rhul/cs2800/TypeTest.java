package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TypeTest {
  Type type;

  // 1
  // Create a Type Enum
  // Create a toString method
  @Test
  void typeString() {
    assertEquals(Type.STRING.toString(), "STRING");
  }

  // 2
  @Test
  void typeNum() {
    assertEquals(Type.NUMBER.toString(), "NUMBER");
  }

  // 3
  @Test
  void typeSymbol() {
    assertEquals(Type.SYMBOL.toString(), "SYMBOL");
  }
  
}
