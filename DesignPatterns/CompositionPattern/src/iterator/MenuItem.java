package iterator;

public class MenuItem {

	String name;
	String descr;

	boolean vege;
	double price;
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescr() {
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


	public MenuItem(String name, String descr, boolean vege, double price) {
		this.name = name;
		this.descr = descr;
		this.vege = vege;
		this.price = price;
	}


}
