package composition;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * also inherites the MenuComponent 
 * so it can be identified as one
 * @author robin
 *
 *
 *you could use implements Iterator here...? usefull? senseful
 */
public class Menu extends MenuComponent {

	
	/**
	 * its possible to iterate over the Menu
	 * its the first step to use an Iterator over the entire
	 * Composition interesting if you need to search for something
	 * 
	 */
	Iterator iterator = null;
	
	ArrayList menuComponents = new ArrayList();
	String name;
	String desc;
	
	
	public Menu(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}
	
	
	public Iterator createIterator() {
		
		if (iterator == null) {
			
			iterator = new CompositeIterator(menuComponents.iterator());
		}
		return iterator;
	}
	
	/**
	 * the overrides are voluntary but if you do at least the 
	 * return type has to be the same
	 */
	//@override
	public void add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
	}
	
	//@override
	public void remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
	}
	
	//@override
	public MenuComponent getChild(int i) {
		return (MenuComponent)menuComponents.get(i);
	}
	
	
	
	/**
	 * 
	 * 
	 * 
	 * ---------------------------the usual getters
	 */


	public String getName() {
		return name;
	}


	public String getDescription() {
		return desc;
	}
	
	

	public void print() {
		//std part
		System.out.println("\n" + getName());
		System.out.println(",  " + getDescription());
		System.out.println("---------------------------------");
		
		//create an iterator whose iterating over the Composition elements
		Iterator iterator = menuComponents.iterator();
		
		while(iterator.hasNext()) {
			
			/**
			 * kind of the first use the same interface of all components?!
			 */
			MenuComponent menuComponent = (MenuComponent)iterator.next();
			menuComponent.print();
		}
		
		
	}
	
	
	
}
