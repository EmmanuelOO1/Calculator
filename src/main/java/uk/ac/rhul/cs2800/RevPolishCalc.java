package uk.ac.rhul.cs2800;
import java.util.Scanner;

public class RevPolishCalc {
  NumStack values = new NumStack();

  public float evaluate(String string) {
    Scanner myScanner = new Scanner(string);  // Create a Scanner object
    
    while(myScanner.hasNext()) { 
      if(myScanner.hasNextFloat()) {
        values.push(myScanner.nextFloat());
        continue;
      }
    }
    float num1 = values.pop();
    float num2 = values.pop();
    values.push(num1 + num2);
    
    return values.pop();  // Output user input
  }

}
