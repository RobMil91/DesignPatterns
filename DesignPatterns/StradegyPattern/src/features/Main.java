package features;

import device.*;
import ducks.*;
import flying.*;
import quacking.*;

public class Main {
	
	public static void main(String[] args) {
	/*	
		Duck mallard = new MallardDuck();
		
		mallard.perfomQuack();
		mallard.performFly();
		
		
		
		//doesnt seem to matter if you create a ModelDuck or an Duck as long as you give it the right instance
		ModelDuck modelDuck = new ModelDuck();
		
		modelDuck.performFly();
		
		
		System.out.println("give the duck a rocket,which btw is a dynamically switch of an Behavior during runtime");
		//set the Behavior by creating a  new instance and put it into the setter
		modelDuck.setFlyBehavior(new FlyRocketPower());
		
		modelDuck.performFly();
		
		
		
		Duck rubber = new Rubberduck();
		
		rubber.perfomQuack();
		rubber.performFly();
		
		*/
		Device quackDevice = new QuackDevice();
		
		quackDevice.perfomSound();
		quackDevice.display();
	}

}
