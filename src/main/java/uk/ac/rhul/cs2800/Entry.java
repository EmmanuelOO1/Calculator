package uk.ac.rhul.cs2800;

// import java.util.Objects;

/**
 * My Entry Class.
 *
 * @author emmanuelokolie
 *
 */
public class Entry {
  float myFloat;
  String myString;
  Type type;
  Symbol other;

  /**
   * Initialises float value.
   *
   * @param f The entry to be added
   */
  public Entry(float f) {
    myFloat = f;
    type = Type.NUMBER;
  }

  /**
   * Initialises string value.
   *
   * @param s The string to be added
   */
  public Entry(String s) {
    myString = s;
    type = Type.STRING;
  }

  /**
   * Initialises string value.
   *
   * @paramThe string to be added
   */
  public Entry(Symbol which) {
    other = which;
    type = Type.SYMBOL;
  }


  /**
   * Gets float value.
   *
   * @return Float Value
   */
  public float getValue() {
    return myFloat;
  }

  /**
   * Gets string value.
   *
   * @return String Value
   */
  public String getString() {
    return myString;
  }


  /**
   * Converts the content of the entry (float) to a string.
   *
   * @return Returns the Value of the Entry as a String
   */
  @Override
  public String toString() {
    if (myFloat == 0.0) {
      return myString;
    } else {
      return String.valueOf(myFloat);
    }
  }

  
  /**
   * Checks if two entries are equal.
   *
   * @return Returns a boolean value confirming whether the entries are the same or not.
   * 
   */
  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Entry)) {
      return false;
    }
    Entry other = (Entry) o;
    return (this.getValue() == other.getValue());

  }

}
