package uk.ac.rhul.cs2800;

import java.util.ArrayList;
//import java.util.List;
import java.util.EmptyStackException;

/**
 * @author emmanuelokolie
 *
 */
public class NumStack {
	int size = 0;
	ArrayList<Float> numstack = new ArrayList<Float>();

	/**
	 * Returns the size of the stack 
	 * @return Size of the numstack.
	 */
	public int size() {
		return size;
	}
	
	/**
	 * Pushes a Float to the numstack.
	 * 
	 * @param Float to be pushed to the numstack.
	 */
	public void push(float f) {
		numstack.add(f);
		size++;
	}

	public void pop() {
		if (size == 0) {
			throw new EmptyStackException();
		}
		
		Float oldEntry = numstack.get(size - 1);
		numstack.remove(oldEntry);
		size--;
	}

	public boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		return false;
	}

}
