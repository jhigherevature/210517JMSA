package ooppillars;

/*
 * The 'extends' keyword enables inheritance
 * for classes in java
 */
public class Car extends Vehicle implements Driveable {
	public String color;
	public boolean tintedWindows;
	/*
	 * If your parent class does not contain a 
	 * no-args constructor, then you must match
	 * the arguments of at least one constructor
	 * in your parent class
	 */
	public Car(String engineSize, String make, long modelNumber, int wheelCount, int cylinders, String color, boolean tintedWindows) {
		/*
		 * The 'super' keyword is a reference to the
		 * parent class of a child class
		 */
		super(engineSize, make, modelNumber, wheelCount, cylinders);
//		this();
		this.color = color;
		this.tintedWindows = tintedWindows;
		/*
		 * Composite relationships will provide access
		 * to qualities of the composite object indirectly
		 * we cannot access the 'name' of our driver using
		 * the car class reference, we have to reference
		 * the reference variable for the driver on
		 * the car object to access the properties of that
		 * passenger object
		 */
//		this.driver.name = "Joe Highe";
	}
	
	public Car(int wheelCount) {
		super(wheelCount);
	}
	
	public Car() {
		/*
		 * Remember that you can use the 'this'
		 * keyword to call another constructor
		 * on your class. This can be used to
		 * replace the call to 'super' because
		 * another constructor is still being called
		 * HOWEVER, these consolidated constructor
		 * calls using the 'this' keyword, must still
		 * make their way back to the object class
		 * eventually...
		 */
		this("v6", "Honda", 123456, 4, 6, "silver", false);
	}

	public void openTrunk() {
		System.out.println("Trunk opened");
	}
	
	/*
	 * note: the @Override annotation is not required here...
	 * 
	 * When implementing an abstract method, we must match
	 * the method signature of the parent class, not including
	 * the 'abstract' keyword
	 */
	@Override
	public void fillWithFuel() {
		System.out.println("At a gas station");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		
	}
}
