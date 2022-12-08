package uk.ac.rhul.cs2800;

@SuppressWarnings("serial")
public class InvalidExpressions extends Exception {
  private String string;
  
  public void InvalidExpression(String ErrorM) {
    this.string = ErrorM;
  }
  
  public String toString() {
    return string;
  }
  
}
