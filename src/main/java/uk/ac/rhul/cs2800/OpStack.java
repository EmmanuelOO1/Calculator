package uk.ac.rhul.cs2800;


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
   * Functon returns the current size of the opStack.
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

}
