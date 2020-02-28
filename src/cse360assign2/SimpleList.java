package cse360assign2;

/**
 * <h1>CSE 360 Assignment 1</h1>
 * <p>
 * Descripton: Defines the class SimpleList - an integer array
 * of size 10. This list is built as a stack (FILO).
 * @author Brandon Rice
 *
 */


/**
 * <h1>SimpleList</h1>
 * <p>
 * Descripton: SimpleList - an integer array of size 10.
 * This list is built as a stack (FILO).
 * @author Brandon Rice
 *
 */
public class SimpleList {
	
	 /**The integer array used to implement the list.**/
	private int[] list;
	 /**The number of user entered items contained in the list.**/
	private int count;
	
	/**
	 * Constructs the list and sets {@code count} to 0.
	 */
	public SimpleList() {
		list = new int[10];
		count = 0;
	}
	
	/**
	 * Adds an element {@code x} to the beginning of the list
	 * (top of the stack) and updates {@code count} to reflect
	 * the new number of elements.
	 */
	public void add(int x) {
		
		for(int i = count; i > 0; i--) {
			if(i < 10) list[i] = list[i - 1];
		}
		list[0] = x;
		if(count < 10) count++;
	}
	
	/**
	 * Attempts to find and remove the element {@code x} from
	 * the list and updates {@code count} to reflect the new
	 * number of elements.
	 */
	public void remove(int x) {
		int pos = search(x);
		if(pos > -1) {
			for(int i = pos; i < count; i++)
			{
				if(i < 9) list[i] = list[i + 1];
			}
			count--;
		}
	}
	
	/**
	 * Returns {@code count}.
	 */
	public int count() {
		return count;
	}
	
	/**
	 * Creates a space-separated string of the list (stack).
	 */
	public String toString() {
		String str = "";
		for(int i = 0; i < count - 1; i++)
		{
			str += list[i] + " ";
		}
		str += list[count - 1];
		return str;
	}
	
	/**
	 * Attempts to find the element {@code x} in the list.
	 * @return the position of the first {@code x} if found,
	 * otherwise returns -1.
	 */
	public int search(int x) {
		int pos = -1;
		for(int i = 0; i < count; i++) {
			if(list[i] == x) {
				pos = i;
				break;
			}
		}
		return pos;
	}
}
