package ducks;

import quacking.Squeak;
import flying.FlyNoWay;

public class Rubberduck extends Duck {

	
	
	public Rubberduck() {
		
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
		
	
		
		
	}
}
