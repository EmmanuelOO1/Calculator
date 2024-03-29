package uk.ac.rhul.cs2800;

import java.util.EmptyStackException;

/**
 * Represents a stack of NumValues.
 *
 * @author emmanuelokolie
 *
 */
public class NumStack {
  int size = 0;
  Rhulstack numstack = new Rhulstack();

  /**
   * Returns the size of the NumStack.
   *
   * @return Size of the NumStack.
   */
  public int size() {
    return size;
  }

  /**
   * Pushes a Float to the NumStack.
   * @return 
   *
   * @paramThe Float to be pushed to the NumStack.
   * 
   */
  public void push(float f) {
    Entry newEntry = new Entry(f);

    numstack.push(newEntry);
    size++;
  }

  /**
   * Pops values from the NumStack.
   * 
   */
  public float pop() {
    if (size == 0) {
      throw new EmptyStackException();
    }
    Entry oldEntry = numstack.pop();
    size--;
    return oldEntry.getValue();
  }

  /**
   * Checks whether the NumStack is Empty or not.
   *
   * @return Returns a boolean value based on whether the NumStack is empty or not
   * 
   */
  public boolean isEmpty() {
    if (size == 0) {
      return true;
    }
    return false;
  }

}
