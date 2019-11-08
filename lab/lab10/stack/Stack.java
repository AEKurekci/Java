package stack;

import java.util.List;

public interface Stack<T> {

	
	/**
	 * Adds the item on top of the stack.
	 * @param item
	 */
	public void push(Object item);
	
	/**
	 *  Removes and returns the item from the top of the stack
	 * @return the item removed from the top
	 */
	public Object pop ();
	
	/**
	 * Returns true if stack does not contain any item
	 * @return
	 */
	public boolean empty();
	
	public List<T> toList();
	
	
	public void addAll(Stack<T> aStack);

}