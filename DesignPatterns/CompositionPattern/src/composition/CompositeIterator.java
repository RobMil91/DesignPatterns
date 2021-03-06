package composition;

import java.util.*;

/**
 * has to implement the Iterator interface
 * in order to be used as such
 * 
 * 
 * 
 * this class is good if you want to iterate over all the objects in the tree 
 * and find specific things for example in the menues
 * @author robin
 *
 */
public class CompositeIterator implements Iterator {
	
	/**
	 * use a Stack now?!
	 */
	Stack stack = new Stack();
	
	public CompositeIterator(Iterator itr) {
		stack.push(itr);
	}

	@Override
	public boolean hasNext() {
		
		if (stack.empty()) {
			return false;
		} else {
			Iterator itr = (Iterator) stack.peek();
			if(!itr.hasNext()) {
				stack.pop();
				return hasNext();
			} else {
				return true;
			}
		}
		
	}

	@Override
	public Object next() {
		
		if (hasNext()) {
			Iterator itr = (Iterator) stack.peek();
			MenuComponent component = (MenuComponent) itr.next();
			
			if(component instanceof Menu) {
				
				//toDO weird that the program doesnt see that the actuall menu is has the method...
				stack.push(component.createIterator());
				
			}
			return component;
		} else {
			
			return null;
		}
		

	}

	@Override
	public void remove() {
		// dont wanna remove just iterator over
		throw new UnsupportedOperationException("");
	}

}
