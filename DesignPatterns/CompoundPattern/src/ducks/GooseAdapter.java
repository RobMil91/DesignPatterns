package ducks;

/**
 * introduce the adapter pattern to the mix
 * @author robin
 *
 */
public class GooseAdapter implements Quackable{

	
	Goose goose;
	
	public GooseAdapter(Goose goose) {
		// TODO Auto-generated constructor stub
		this.goose = goose;
	}
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		goose.honk();
		
	}
	
	
	

}
