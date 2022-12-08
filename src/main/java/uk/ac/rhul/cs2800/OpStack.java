package uk.ac.rhul.cs2800;

import java.util.EmptyStackException;

/**
 * My operator Stack.
 *
 * @author emmanuelokolie
 *
 */
public class OpStack {
  // private Stack opStack;
  Rhulstack opStack = new Rhulstack();

  int size = 0;

  /**
   * Returns the current size of the opStack.
   *
   * @return size of opStack
   *
   */
  public Integer size() {
    return size;
  }

  /**
   * Pushes a new Symbol to the stack.
   *
   * @param newSymbol to be added to stack
   */
  public void push(Symbol newSymbol) {
    this.opStack.push(new Entry(newSymbol));
    size++;
  }

  /**
   * Removes the last entry from the list.
   *
   * @return the old entry popped from the list 
   */
  public Object pop() {
    if (size == 0) {
      throw new EmptyStackException();
    }
    Entry oldEntry = opStack.pop();
    size--;
    return oldEntry;

  }

  /**
   * Checks whether opStack is empty. 
   *
   * @return whether opStack is empty or not 
   */
  public Object isEmpty() {
    if (size == 0) {
      return true;
    } else {
      return false;
    }
  }
  
  /**
   * Finds the symbol at the top entry in the stack.
   *
   * @return Returns the top symbol
   */
  public Symbol top() {
    return opStack.top().getSymbol();
  }


}
