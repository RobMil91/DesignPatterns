package teaExample;

/**
 * Tempalate Method is for code reuse
 * @author robin
 *
 */
public class testTemplateMethod {

	
	/**
	 * Main method to show the confinient use
	 * of a Template method
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		System.out.println("make a tea");
		Tea tea = new Tea();
		
		//call the entire Template Method
		tea.prepareRecipe();
		
		
		System.out.println("make a coffee");
		Coffee cof = new Coffee();
		
		cof.prepareRecipe();
	}
}
