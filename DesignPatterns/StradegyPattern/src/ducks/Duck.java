package ducks;

import quacking.QuackBehavior;
import flying.FlyBehavior;

/**
 * Duck class that uses the interfaces of flying
 * and quacking
 * @author robin
 *
 */
public abstract class Duck {
	
	//instance variables hold a reference to the specific behavior
	//at runtime!
	protected FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	
	
	//constructor set these??
	//no this class is not intended to be instanciated
	
	



	/**
	 * Method to use Quack from the instance that implements a quackBehavior
	 */
	public void perfomQuack() {
		
		quackBehavior.quack();
		
	}

	/**
	 * Method to use Fly from the instance that implements a flyBehavior
	 */
	public void performFly() {
		
		flyBehavior.fly();
	}
	
	
	public void swim() {
		
		throw new IllegalArgumentException("not implemented yet");
	}
	
	public void display() {
		
		throw new IllegalArgumentException("not implemented yet");
	}
	
	/**
	 * Setter for flyBehavior
	 * @param flyBeh
	 */
	public void setFlyBehavior(FlyBehavior flyBeh) {
		
		this.flyBehavior = flyBeh;
	}
	//auto include
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	

}
