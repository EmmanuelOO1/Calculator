package uk.ac.rhul.cs2800;

//import java.util.Scanner;

public class RevPolishCalc {
  NumStack values = new NumStack();

  public float evaluate(String string) {
//    Scanner myScanner = new Scanner(string); // Create a Scanner object
//
//  //  while (myScanner.hasNext()) {
//  //    if (myScanner.hasNextFloat()) {
//  //      values.push(myScanner.nextFloat());
//  //      continue;
//
//   //     }
//      
//    
//    Scanner scanner = new Scanner(string);  // Create a Scanner object
//    String userName = scanner.nextLine();  // Read user input
//    System.out.println("Username is: " );  // Output user input
      
    float value1;
    float value2;
    
    String[] numSymbols = string.split(" ");
        
    for(int i = 0; i < numSymbols.length; i++) {
      switch(numSymbols[i]) {
        case"+":
          value1 = values.pop();
          value2 = values.pop();
          values.push(value2 + value1);
          break;
          
        case"-":
            value1 = values.pop();
            value2 = values.pop();
            values.push(value2 - value1);
          break;
          
        case"*":
          value1 = values.pop();
          value2 = values.pop();
          values.push(value2 * value1);
          break;
          
        case"/":
          value1 = values.pop();
          value2 = values.pop();
          values.push(value2 / value1);
          break;
          
        default:
          values.push(Float.parseFloat(numSymbols[i]));
          
          
        
      }
      
    }



    //float num1 = values.pop();
    //float num2 = values.pop();
    //values.push(num1 + num2);

    return values.pop(); // Output user input
  }

}
