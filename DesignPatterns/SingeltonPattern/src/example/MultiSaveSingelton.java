package example;


public class MultiSaveSingelton {
	
	/**
	 * you can create it here with new
	 */
	private static MultiSaveSingelton uniqueInstance;
	
	//private Constructor so you can only create the Singelton from within the class
	 private MultiSaveSingelton() {};
	 

	 /**
	  * ----------------------------synchronized Method!!!!!!----------------
	  * this ensures that only one threat can enter the Singelton
	  * performance problem arguable 
	  * @return
	  */
	 public static synchronized MultiSaveSingelton getInstance() {
		 if (uniqueInstance == null) {
			 uniqueInstance = new MultiSaveSingelton();
		 }
		 //interesting that you can't call it by this. or class name
		 //its private but still in the class?
		 return uniqueInstance;
	 }
	 

}
