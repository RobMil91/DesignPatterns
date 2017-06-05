package adapter;

public class TurkeyAdapter implements Duck{
	
	/**
	 * get an instance of a Turkey in here
	 */
	Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}

	/**
	 * Super easy adapter method
	 */
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		turkey.gobble();
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		/**
		 * now i have got the problem that the turkey cant
		 * fly as well as a duck
		 * to adapt i let the turkey fly 5 times as much as
		 * a duck would. This is an very basic example of how 
		 * difficult it can be to adapt the methods
		 * this might add extra behavior which seems unwanted in the patter?
		 * 
		 */
		for (int i = 0; i < 5; i++) {
			turkey.fly();
		}
		
	}

}
