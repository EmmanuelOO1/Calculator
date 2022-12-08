package uk.ac.rhul.cs2800;

public class StandardCalc {
  OpStack values = new OpStack();
  RevPolishCalc rpCalc = new RevPolishCalc();

  // LIFO STACK
  // FIFO QUEUE
  // Process all symbols

  // enqueue any num
  // push any operator on stack

  // when i pop i keep track of presedence
  // presedence = PEMDAS

  // queue = string stack

  
  // Read a token
  //if its a number add it to a queue
  //if its a operator
  //    While there is an operator with greater presidence
  
  //            Pop operators from the stack onto the output queue
  //        push current operator onto the stack
  //    If its a left bracker push it at the top of the stack
  //    if its a right bracker
  //        While theres not a left at the top of the stack
  //            pop operators from the stack onto the queue
  //        pop the left bracket from the stack and discard it
  //While there are operators on the stack pop them to queue

  public float evaluate(String string) {

    String[] numSymbols = string.split(" ");

    for (int i = 0; i < numSymbols.length; i++) {

      switch (numSymbols[i]) {
        case "/":
          values.push(Symbol.DIVIDE);
          break;

        case "*":
          values.push(Symbol.TIMES);
          break;

        case "+":
          // if values is not empty
            // if the top of values is * or /
              // the while loop w/ greater precedence thing
          
          values.push(Symbol.PLUS);
          break;

        case "-":
          // if values is not empty
          // if the top of values is * or /
            // the while loop w/ greater precedence thing
          
          values.push(value2 / value1);
          break;

        case "(":
          break;
          
        case ")":
          break;
          
      }
    }
    return;
  }

}
