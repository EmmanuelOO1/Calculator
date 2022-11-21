package uk.ac.rhul.cs2800;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * A String Stack.
 * 
 * @author emmanuelokolie
 *
 */
public class StrStack {
    int size = 0;
    ArrayList<String> StrStack = new ArrayList<String>();

    /**
     * Size of StrStack Function.
     * 
     * @return Size of StrStack
     */
    public Integer size() {
	return size;
    }

    /**
     * Pushes values to the StrStack.
     * 
     * @param string to be pushed to the stack
     */
    public void push(String string) {
	size = size + 1;
	StrStack.add(string);
    }

    /**
     * Removes the last Entry from the StrStack.
     * 
     */
    public void pop() {
	if (size == 0) {
	    throw new EmptyStackException();
	}

	String oldEntry = StrStack.get(size - 1);
	StrStack.remove(oldEntry);
	size--;
    
    }

    /**
     * Checks whether StrString is empty.
     * 
     * @return True or false if its empty or not
     */
    public Object isEmpty() {
	if(size == 0) {
	    return true;
	} 
	return false;
    }

}
