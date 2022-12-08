package uk.ac.rhul.cs2800;

/**
 * Symbol Enum.
 *
 * @author emmanuelokolie
 *
 */
public enum Symbol {
  LEFT_BRACKET, RIGHT_BRACKET, TIMES, DIVIDE, PLUS, MINUS, INVALID;

  public String toString() {
    if (this == LEFT_BRACKET) {
      return "(";
    } else if (this == RIGHT_BRACKET) {
      return ")";
    } else if (this == TIMES) {
      return "*";
    } else if (this == DIVIDE) {
      return "/";
    } else if (this == PLUS) {
      return "+";
    } else if (this == MINUS) {
      return "-";
    } else {
      return "INVALID";
    }
  }
}
