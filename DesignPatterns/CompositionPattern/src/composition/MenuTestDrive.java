package composition;

public class MenuTestDrive {
	
	public static void main(String[] args) {
		
		
		
		/**
		 * Create the single Menues
		 */
		MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
		MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
		MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
		MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert stuff");
		
		
		/**
		 * need to create the top of the tree now
		 * 
		 */
		MenuComponent allMenus = new Menu("ALL MENUS", "all the menus combined");
		
		/**
		 * adding something into itself objectvise,  because it is the same interface/abstract class
		 * 
		 * creating the first layer, which means all the nodes that ar connected to the top (allMenues)
		 */
		allMenus.add(pancakeHouseMenu);
		allMenus.add(cafeMenu);
		allMenus.add(dinerMenu);
		
		
		/**
		 * the global adding is really handy..
		 */	
		dinerMenu.add(new MenuItem("Pasta", "Spagetti with Marina Sauce", true, 3.89));
		
		//now it is possible to add an entire menue to the diner Menue
		// we want dessert to be there
		//this should also work if i want the same desserMenue in the Cafe and so on	
		dinerMenu.add(dessertMenu);
		
		dessertMenu.add(new MenuItem("Apple Pie", "well pie", true, 30.00));
		
		
		/**
		 * ----------------------now the test data is created------------------------
		 * the three has 3 submenues which are empty besides the dinerMenue which has desser Object(MenuComponent) 
		 * and Spagetti
		 */
		
		//testobject
		
		Waitress waiter = new Waitress(allMenus);
		waiter.printMenu();
		
		
		
	}

}
