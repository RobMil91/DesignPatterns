package example;

public class Main {

	public static void main(String[] args) {
		
		//how is this not a problem?
		ChocalateBoiler boiler1 = ChocalateBoiler.getInstance();
		ChocalateBoiler boiler2 = ChocalateBoiler.getInstance();
		
		boiler1.indicate(1);
		System.out.println(boiler1.toString());
		boiler2.indicate(2);
		System.out.println(boiler2.toString());
		
		System.out.println("boiler1.toString(): " + boiler1.toString());
	}
}
