package example;

public class DoubleCheckSingelton {
	
	/**
	 * volatile ensures that multi threats handle the uniqueInstance correctly
	 * when it is initialized to the Singelton instance?!
	 */
	private volatile static DoubleCheckSingelton uniqueInstance;
	
	//private Constructor so you can only create the Singelton from within the class
	 private DoubleCheckSingelton() {};
	 


	 public static  DoubleCheckSingelton getInstance() {
		 
		 //this checks for if the class already exists?!
		 synchronized (DoubleCheckSingelton.class) {
			
		
		 if (uniqueInstance == null) {
			 uniqueInstance = new DoubleCheckSingelton();
		 }
		 
		 
		 
		 }
		 
		 //------------------------------end of checking phase
		 /**
		  * this means only if i want to initiate the Singleton it is checked if there is another one
		  */
		 
		 
		 
		 return uniqueInstance;
	
	 }
}
