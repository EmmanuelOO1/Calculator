package uk.ac.rhul.cs2800;

import java.util.ArrayList;
//import java.util.List;
import java.util.EmptyStackException;

/**
 * Represents a stack of NumValues.
 * 
 * @author emmanuelokolie
 *
 */
public class NumStack {
    int size = 0;
	ArrayList<Float> numstack = new ArrayList<Float>();

	/**
	 * Returns the size of the NumStack
	 * 
	 * @return Size of the NumStack.
	 */
	public int size() {
		return size;
	}

	/**
	 * Pushes a Float to the NumStack.
	 * 
	 * @param Float to be pushed to the NumStack.
	 */
	public void push(float f) {
		numstack.add(f);
		size++;
	}

	/**
	 * Pops values from the NumStack.
	 * 
	 */
	public void pop() {
		if (size == 0) {
			throw new EmptyStackException();
		}

		Float oldEntry = numstack.get(size - 1);
		numstack.remove(oldEntry);
		size--;
	}

	/**
	 * Checks whether the NumStack is Empty or not.
	 * 
	 * @return Returns a boolean value based on whether the NumStack is empty or not
	 */
	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}

}
