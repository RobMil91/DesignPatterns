package composition;

import java.util.Iterator;

/**
 * all MenuComponent inheriting classes have to implement 
 * the iterator if you wanna use it globally
 * @author robin
 *
 */
public class MenuItem extends MenuComponent {
	
	String name;
	String descr;

	boolean vege;
	double price;
	
	
//constructor
	public MenuItem(String name, String descr, boolean vege, double price) {
		this.name = name;
		this.descr = descr;
		this.vege = vege;
		this.price = price;
	}
	
	
	public Iterator createIterator() {
		
		return new NullIterator();
		
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return descr;
	}


	public void setDescr(String descr) {
		this.descr = descr;
	}


	public boolean isVege() {
		return vege;
	}


	public void setVege(boolean vege) {
		this.vege = vege;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * This is an override of the super class method!
	 */
	public void print() {
		
		System.out.println("  " + getName());
		if (isVege()) {
			System.out.println("(v)");
		}
		
		System.out.println(", " + getPrice());
		System.out.println("    --" +  getDescription());
		
	}

}