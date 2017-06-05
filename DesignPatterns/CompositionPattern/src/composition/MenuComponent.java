package composition;

/**
 * Composition pattern
 * @author robin
 * 
 * this Component interface should
 * implement as much methods as possible
 * that are commmon between the actual objects
 * this is important for transparency
 * 
 * 
 * 
 * 
 * methods like getChild, add and remove
 * shoudnt work on leafs of the tree?!
 *
 */
public abstract class MenuComponent {

	/**
	 *  method use its own class to add it to its structure
	 * @param menuComp
	 * 
	 * 
	 * 
	 * 
	 * 
	 * here come the Menu composition methods
	 */
	public void add(MenuComponent menuComp) {
		
		throw new UnsupportedOperationException("");
	}
	
	public void remove(MenuComponent menuComp) {
		
		throw new UnsupportedOperationException("");
	}
	
	/**
	 * 
	 * @param ispecific attribute for datastructure
	 */
	public MenuComponent getChild(int i) {
		
		throw new UnsupportedOperationException("");
	}
	
	
	
	
	
	/**
	 * Here are tje "operation methods"
	 * they are used by the MenuItems
	 * 
	 * 
	 * 
	 */
	
	
	public String getName() {
		
		throw new UnsupportedOperationException("");
	}
	
	public String getDescription() {
		
		throw new UnsupportedOperationException("");
	}
	
	public double getPrice() {
		
		throw new UnsupportedOperationException("");
	}
	
	public boolean isVegetarian() {
		
		throw new UnsupportedOperationException("");
	}
	
	/**
	 * print is used by both the composition methods and the menueItems methods
	 */
	public void print() {
		
		throw new UnsupportedOperationException("");
	}
	
	
}