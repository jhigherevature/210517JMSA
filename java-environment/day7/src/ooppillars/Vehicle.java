package ooppillars;

/*
 * You are not required to extend the object class
 * since Java will automatically do this for you
 * if you do not
 */
public abstract class Vehicle extends Object {
	public String engineSize;
	public String make;
	public long modelNumber;
	public int wheelCount;
	public int cylinders;
	
	/*
	 * HAS-A (or composite) relationships
	 * establish a reference to independent objects
	 * that will exist to serve a purpose for our
	 * class, but is not descriptive of our class
	 * as a whole by themselves
	 */
	public Passenger driver;
	public Passenger[] passengers;
	
	public Vehicle(String engineSize, String make, long modelNumber, int wheelCount, int cylinders) {
		super(); // implicit
		System.out.println("This is the vehicle class constructor");
		this.engineSize = engineSize;
		this.make = make;
		this.modelNumber = modelNumber;
		this.wheelCount = wheelCount;
		this.cylinders = cylinders;
	}
	
	public Vehicle(int wheelCount) {
		this.wheelCount = wheelCount;
	}

	/*
	 * Below is what the 'default' constructor
	 * looks like in Java!
	 */
	public Vehicle() {
		super();
	}
	
	public void ignition() {
		System.out.println("The vehicle has started up");
	}
	
	/*
	 * abstract methods do not require a body to be implemented
	 * within an abstract class. Note that abstract methods
	 * can reside within abstract classes, but cannot reside
	 * within non-abstract classes
	 */
	public abstract void fillWithFuel();
}
