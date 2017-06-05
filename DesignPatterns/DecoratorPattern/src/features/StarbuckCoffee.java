package features;

import beverages.*;
import component.Beverage;
import condiments.*;

public class StarbuckCoffee {

	
	public static void main(String[] args) {
		//all variables can be initiated by Beverage,
		//because they all extend from it
		Beverage beverage = new Espresso();
		
		//put out the cost of an espresso(undecorated) component
		System.out.println(beverage.getDescription() + "$ " + beverage.cost());
		
		
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() + "$ " + beverage2.cost());
		
		/*
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() + "$ " + beverage3.cost());
		*/
		System.out.println("extra whip please");
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() + "$ " + beverage2.cost());
		
	}
}
