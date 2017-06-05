package device;

import quacking.QuackBehavior;

/**
 * 
 * The device class devices that could
 * potentially simulate quacks for hunting
 * 
 */
public abstract class Device {

	protected QuackBehavior quackBehavior;
	
	public void perfomSound() {
		//uses thes quack from the QuackBehavior class with is a little bad,
		//you should probably make a new interface and so on
		quackBehavior.quack();
	}
	
	public void display() {
		
		throw new IllegalArgumentException("not implemented yet");
	}
	
	/**
	 * change up the quack to match whatever you need
	 * also really good that not every class kind has to create his own setter
	 * @param quackBehavior
	 */
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
