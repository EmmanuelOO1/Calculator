package uk.ac.rhul.cs2800;

/**
 * My Infix Standard Calculator.
 *
 * @author emmanuelokolie
 *
 */
public class StandardCalc {
  OpStack values = new OpStack();
  StrStack queue = new StrStack();
  RevPolishCalc rpCalc = new RevPolishCalc();


  /**
   * Evaluate method which is ultimatly responsible for calculations.
   *
   * @param string which hold the nums and operators
   * @return Result of the calculation
   */
  public float evaluate(String string) {
    String[] numSymbols = string.split(" ");
    for (int i = 0; i < numSymbols.length; i++) {
      switch (numSymbols[i]) {
        case "(":
          values.push(Symbol.LEFT_BRACKET);
          break;

        case ")":
          while (!values.top().equals(Symbol.LEFT_BRACKET)) {
            queue.push(values.pop().toString());
          }
          values.pop();
          break;

        case "/":
          values.push(Symbol.DIVIDE);
          break;

        case "*":
          values.push(Symbol.TIMES);
          break;

        case "+":
          while (!values.isEmpty()) {
            if ((values.top().equals(Symbol.DIVIDE)) || (values.top().equals(Symbol.TIMES))) {
              queue.push(values.pop().toString());
            } else {
              break;
            }
          }
          values.push(Symbol.PLUS);
          break;

        case "-":
          while (!values.isEmpty()) {
            if ((values.top().equals(Symbol.DIVIDE)) || (values.top().equals(Symbol.TIMES))) {
              queue.push(values.pop().toString());
            } else {
              break;
            }
          }
          values.push(Symbol.MINUS);
          break;

        default:
          queue.push(numSymbols[i]);
      }
    }

    while (!values.isEmpty()) {
      queue.push(values.pop().toString());
    }


    // used to reverse the order of StrStack queue
    StrStack calcStack = new StrStack();

    while (!queue.isEmpty()) {
      calcStack.push(queue.pop());
    }

    String rpn = "";

    while (!calcStack.isEmpty()) {
      rpn += calcStack.pop() + " ";
    }

    rpn = rpn.trim();



    return rpCalc.evaluate(rpn);


  }

}
