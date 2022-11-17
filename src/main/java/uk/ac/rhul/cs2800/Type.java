package uk.ac.rhul.cs2800;

/**
 * Created a Enum of type.
 *
 * @author emmanuelokolie
 *
 */
public enum Type {
  STRING, NUMBER, SYMBOL,;

  /**
   * toSting method returns the string representation of the Enum.
   *
   * @return string representation of the Enum
   */
  public String toString() {
    return this.name();
  }

}


