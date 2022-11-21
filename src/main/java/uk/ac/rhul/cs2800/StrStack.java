package uk.ac.rhul.cs2800;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * A String Stack
 * 
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

    public void pop() {
	if (size == 0) {
	    throw new EmptyStackException();
	}

	String oldEntry = StrStack.get(size - 1);
	StrStack.remove(oldEntry);
	size--;
    
    }

}
