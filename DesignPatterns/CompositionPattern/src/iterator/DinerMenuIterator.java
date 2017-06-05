package iterator;

import java.util.Iterator;

/**
 * This helps the diner because they dont need to add
 * much code
 * just the iterator method is enough
 * @author robin
 *
 */
public class DinerMenuIterator implements Iterator{
	
	MenuItem[] items;
	int position = 0;
	
	public DinerMenuIterator(MenuItem[] items) {
		// TODO Auto-generated constructor stub
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		
		if (position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
		
	}



	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public Object next() {
		// TODO Auto-generated method stub
		
		MenuItem menuItem = items[position];
		position++;
		
		return menuItem;
	}

}
