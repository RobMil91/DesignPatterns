package lightExample;

public class Light {
	
	Boolean glowing;
	
	public Light() {
		glowing = false;
	}
	
	
	public void on() {
		System.out.println("light is turned on");
		glowing = true;
	}
	
	public void off() {
		glowing = false;
	}

}
