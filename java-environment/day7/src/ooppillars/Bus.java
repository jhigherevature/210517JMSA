package ooppillars;

public class Bus extends Vehicle implements Driveable {
	/*
	 * The following methods are not fully implemented
	 * but are used to showcase polymorphism and
	 * polymorphic references
	 */
	public void pickUp(Passenger... newPassengers) {
		System.out.println("Picking up passengers");
	}
	
	public void dropOff() {
		System.out.println("Dropping off passengers...");
	}

	@Override
	public void fillWithFuel() {
		System.out.println("I need more gas than a car");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		
	}
}
