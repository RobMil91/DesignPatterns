package device;

import java.awt.DisplayMode;

import quacking.Quack;

/**
 * the actual quack device
 * @author robin
 *
 */
public class QuackDevice extends Device{

	public QuackDevice() {
		
		this.quackBehavior = new Quack();
	}
	
	public void display() {
		
		System.out.println("this is an quacking device");
	}
	
}
