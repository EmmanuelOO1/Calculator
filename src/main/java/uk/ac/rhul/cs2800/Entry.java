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

  /**
   * Initialises float value.
   *
   * @param f The entry to be added
   */
  public Entry(float f) {
    myFloat = f;
  }

  /**
   * Initialises string value.
   *
   * @param s The string to be added
   */
  public Entry(String s) {
    myString = s;
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

    // String results[] = new String[2];
    // if (!Objects.isNull(myString)) {
    // results[0] = myString;
    // }
    // if (!Objects.isNull(myFloat)) {
    // results[1] = String.valueOf(myFloat);
    // }
    // System.out.print(results[1]);
    // return results[0] + " " + results[1];

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
