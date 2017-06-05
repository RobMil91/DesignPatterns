package basic;
/**
 * The basic code any Singelton has to implement
 * 
 * @author robin
 *
 */
public class Singleton {

	//the program wide reachable unqique instance
	/**
	 * you can create it here with new
	 */
	private static Singleton uniqueInstance;
	
	//private Constructor so you can only create the Singelton from within the class
	 private Singleton() {};
	 
	 /**
	  * Basically the getter for the Instance
	  * it always returns the current Singleton
	  * @return
	  */
	 public static Singleton getInstance() {
		 if (uniqueInstance == null) {
			 uniqueInstance = new Singleton();
		 }
		 //interesting that you can't call it by this. or class name
		 //its private but still in the class?
		 return uniqueInstance;
	 }
	 
	 
	 //toDo give the class Behavior
}
