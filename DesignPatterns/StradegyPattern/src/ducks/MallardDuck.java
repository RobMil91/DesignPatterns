package ducks;


import quacking.*;
import flying.*;

public class MallardDuck extends Duck {
	
	/**
	 * Constructor 
	 * QuackBehavior and flyBehavior are variables from the mother class Duck
	 */
	public MallardDuck() {
		
		/**
		 * implementation of the Mallard Ducks abilities
		 * we use the instances that implement a FlyBehavior
		 * or QuackBehavior to choose so
		 */
		quackBehavior = new Quack(); //we want it to really quack
		flyBehavior = new FlyWithWings(); // we want a Mallard duck to fly with its wings
		
		//this is programming to an implemenation... other design patterns should help..
	}
	
	
	
	//is this some kind of overwrite? cause duck class has the same Method
	//this method is hiding that fact i think
	public void display() {
		
		System.out.println("i am a real mallard duck");
	}
	

	

}
