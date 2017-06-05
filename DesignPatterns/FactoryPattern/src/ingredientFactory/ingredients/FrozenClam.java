package ingredientFactory.ingredients;

import ingredientFactory.ingredients.interfaces.Clams;

public class FrozenClam implements Clams {
	
	/**
	 * name can be privat in the lower subclasses i think
	 * maybe protected if you wanna create further dependencies
	 */
	private String name;
	
	public FrozenClam() {
		this.name = "Frozen Clam";
	}

	@Override
	public void implementShit() {
		// TODO Auto-generated method stub
		
	}
	
	public String toString() {
		return this.name;
	}

}
