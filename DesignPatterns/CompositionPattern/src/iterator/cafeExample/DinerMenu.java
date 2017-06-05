package iterator.cafeExample;

import iterator.DinerMenuIterator;
import iterator.MenuItem;

import java.util.Iterator;

public class DinerMenu {

	static final int Max_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
	

	public DinerMenu(int numberOfItems, MenuItem[] menuItems) {
		this.numberOfItems = numberOfItems;
		this.menuItems = menuItems;
	}
	
	// add items here
	
	
	public Iterator createIterator() {
		return new DinerMenuIterator(menuItems);
	}
	/*
	public Iterator getIterator() {
		return menuItems.iterator() 
		//rework dont get it...
	}
	*/
}
