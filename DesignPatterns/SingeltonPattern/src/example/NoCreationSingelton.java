package example;

public class NoCreationSingelton {
	
	/**
	 * ----------------------------------the class is always initiated------------------------------
	 * if it is not needed it was a waste...
	 * but this ensure it cant be created twice?!
	 * 
	 */
	private static NoCreationSingelton uniqueInstance = new NoCreationSingelton();
	
	//private Constructor so you can only create the Singelton from within the class
	 private NoCreationSingelton() {};
	 

	 /**
	  * Beacause it is always initiated there is no need to
	  * cheack if there is an instance, and if you have to create a new one
	  * @return the only unqiue instance
	  */
	 public static NoCreationSingelton getInstance() {

		 return uniqueInstance;
	 }
	 

}
