package patternVersion;

import ducks.DuckCall;
import ducks.Goose;
import ducks.GooseAdapter;
import ducks.MallardDuck;
import ducks.Quackable;
import ducks.RedHeadDuck;
import ducks.RubberDuck;

public class DuckSimulator {
	
	public static void main(String[] args) {
		DuckSimulator simu = new DuckSimulator();
		simu.simulate();
	}
	
	void simulate() {
		
		//create ducks
		Quackable mallardDuck = new MallardDuck();
		Quackable redheadDuck = new RedHeadDuck();
		Quackable duckcall = new DuckCall();
		Quackable rubberDuck = new RubberDuck();
		/**
		 * adding an adapted goose
		 * basically adding the adapter pattern into the mix
		 */
		Goose goose = new Goose();
		Quackable gooseDuck = new GooseAdapter(goose);
		
		
		
		System.out.println("\nDuck Simulator: ");
		
		
		
		simulate(mallardDuck);
		simulate(rubberDuck);
		simulate(duckcall);
		simulate(redheadDuck);
		simulate(gooseDuck);
		
	}
	
	void simulate(Quackable duck) {
		
		duck.quack();
		
	}

}
