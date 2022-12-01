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
    return this.name();
  }


}
