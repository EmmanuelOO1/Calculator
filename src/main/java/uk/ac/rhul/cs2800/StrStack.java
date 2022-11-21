package uk.ac.rhul.cs2800;

import java.util.ArrayList;


/**
 * A String Stack 
 * @author emmanuelokolie
 *
 */
public class StrStack {
	int size = 0;
    ArrayList<String> StrStack = new ArrayList<String>();


	public Integer size() {
		return size;
	}

	public void push(String string) {
		StrStack.add(string);
	}

}
