package uk.ac.rhul.cs2800;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.List;

/**
 * Represents a Stack of Entry Values.
 *
 * @author emmanuelokolie
 *
 */
public class Rhulstack {
	int size = 0;
	List<Entry> value = new ArrayList<Entry>();

	/**
	 * Returns the Length of Stack.
	 *
	 * @return Return the size of Stack
	 */
	public int size() {
		return size;
	}

	/**
	 * Pushes Entrys to the Stack.
	 *
	 * @param i New Entry
	 * 
	 */
	public void push(Entry i) {
		value.add(size, i);
		size += 1;
	}

	/**
	 * Pops values from the Stack.
	 *
	 * @return value popped
	 */
	public Entry pop() {
		if (size == 0) {
			throw new EmptyStackException();
		}

		Entry oldEntry = value.get(size - 1);
		value.remove(oldEntry);
		size--;
		return oldEntry;

	}

	/**
	 * Returns the Top most value of a Stack.
	 *
	 * @return Top Stack Value
	 */
	public Entry top() {
		if (size == 0) {
			throw new EmptyStackException();
		} else {

			// Popping out the entry and to find out the top and then adding it back on top
			Entry top = pop();
			push(top);
			return top;
		}
	}
	

}
