package uk.ac.rhul.cs2800;

/**
 *My RevPolish Calculator Class.
 *
 * @author emmanuelokolie
 *
 */
public class RevPolishCalc {
  NumStack values = new NumStack();

  /**
   *Function which evaluates expressions handed to it in string form.
   *
   * @param string of numbers and operands
   *
   * @return The value at the end of the calculation
   */
  public float evaluate(String string) {

    String[] numSymbols = string.split(" ");
    float value1;
    float value2;


    for (int i = 0; i < numSymbols.length; i++) {
      switch (numSymbols[i]) {
        case "+":
          value1 = values.pop();
          value2 = values.pop();
          values.push(value2 + value1);
          break;

        case "-":
          value1 = values.pop();
          value2 = values.pop();
          values.push(value2 - value1);
          break;

        case "*":
          value1 = values.pop();
          value2 = values.pop();
          values.push(value2 * value1);
          break;

        case "/":
          value1 = values.pop();
          value2 = values.pop();
          values.push(value2 / value1);
          break;

        default:
          values.push(Float.parseFloat(numSymbols[i]));
      }
    }

    return values.pop();
  }

}
