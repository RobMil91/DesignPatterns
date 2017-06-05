package iterator.cafeExample;

import iterator.Menu;
import iterator.MenuItem;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu{
	
	Hashtable menuItems = new Hashtable();
	
	
	public CafeMenu() {
		addItem("Veggie Burger", "Veggie s in  this burger", true, 3.99);
		addItem("Burriot", "well afucking burrito", true, 4.29);
	}
	
	
	
	public void addItem(String name, String desc, boolean vegeta, double price) {
		
		MenuItem menuItem = new MenuItem(name, desc, vegeta, price);
		menuItems.put(menuItem.getName(), menuItem);
		
	}



	@Override
	public Iterator createIterator() {
		// Hashmap iterator works on values
		return menuItems.values().iterator();
	}

}
