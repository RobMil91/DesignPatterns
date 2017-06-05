package ducks;

import flying.FlyNoWay;
import quacking.MuteQuack;

public class ModelDuck extends Duck {

	
	public ModelDuck() {
		
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyNoWay();
	}
	

	public void display() {
		
		System.out.println("you see an modelDuck");
	}
}
