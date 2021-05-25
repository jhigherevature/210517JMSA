package ooppillars;

public class Plane extends Vehicle implements Flyable, Driveable {
	public void fly() {
		System.out.println("Soaring through the air");
	}
	
	/*
	 * To override a method from a parent class, you must
	 * match the method signature exactly
	 */
	@Override
	public void ignition() {
		System.out.println("Planes will start up a bit slower than cars");
	}

	@Override
	public void fillWithFuel() {
		System.out.println("I can be filled mid-flight even");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void soar() {
		// TODO Auto-generated method stub
		
	}
}
