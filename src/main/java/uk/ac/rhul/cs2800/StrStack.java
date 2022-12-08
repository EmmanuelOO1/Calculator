package uk.ac.rhul.cs2800;

import java.util.EmptyStackException;

/**
 * A String Stack.
 *
 * @author emmanuelokolie
 *
 */
public class StrStack {
  int size = 0;
  Rhulstack strStack = new Rhulstack();

  /**
   * Size of StrStack Function.
   *
   * @return Size of StrStack
   * 
   */
  public Integer size() {
    return size;
  }

  /**
   * Pushes values to the StrStack.
   *
   * @param string to be pushed to the stack
   */
  public void push(String string) {
    Entry newEntry = new Entry(string);

    strStack.push(newEntry);
    size++;
  }

  /**
   * Removes the last Entry from the StrStack.
   *
   * @Returns the entry that was poped from the StrStack
   */
  public String pop() {
    if (size == 0) {
      throw new EmptyStackException();
    }

    Entry oldEntry = strStack.pop();
    size--;
    return oldEntry.getString();

  }

  /**
   * Checks whether StrString is empty.
   *
   * @return True or false if its empty or not
   */
  public boolean isEmpty() {
    if (size == 0) {
      return true;
    }
    return false;
  }

}
