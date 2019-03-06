package arrayIterators;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ForwardArrayIterator<E> implements Iterator<E> {

	private E[] arr;
	private int currentposition;
	
	public ForwardArrayIterator(E[] arr) { 
		this.arr = arr; 
		this.currentposition=0;
	}
	
	public boolean hasNext() {
//		return this.currentposition<this.  
	}

	public E next() throws NoSuchElementException {
		if (!hasNext())
			throw new 
				NoSuchElementException("No more elements to iterate over."); 
		// rewrite
		return null;
	}

	public void remove() throws UnsupportedOperationException {
		throw new UnsupportedOperationException(
				"Remove peration not implemented.");
		// do not implement
	}
}
