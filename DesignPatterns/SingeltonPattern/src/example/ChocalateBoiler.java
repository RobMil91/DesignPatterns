package example;

import basic.Singleton;

/**
 * A Chocalate Boiler which has boild milk and choclate together
 * should be initiated only once
 * @author robin
 *
 */
public class ChocalateBoiler {

	private boolean empty;
	private boolean boiled;
	private int number;
	
	//unique instance
	private static ChocalateBoiler uniqueInstance;
	
	private ChocalateBoiler() {
		
		this.empty = true;
		this.boiled = false;
	}
	
	 public static ChocalateBoiler getInstance() {
		 if (uniqueInstance == null) {
			 uniqueInstance = new ChocalateBoiler();
		 }

		 return uniqueInstance;
	 }
	
	 
	 public void fill() {
		 
		 if(this.empty) {
			 empty = false;
			 boiled = false;
			 //fill in choclate
		 }
	 }
	 
	 /**
	  * My indicator method to see if i work on the same object
	  * @param num
	  */
	 public void indicate(int num) {
		 this.number = num;
	 }
	 
	 public String toString() {
		 return String.valueOf(this.number);
	 }
}
