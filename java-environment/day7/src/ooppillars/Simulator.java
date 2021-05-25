package ooppillars;

public class Simulator {
	public static void main(String[] args) {
//		Vehicle v = new Vehicle("v6", "Honda", 123456, 4, 6);
//		System.out.println(v.cylinders);
//		v.ignition();
//		v.openTrunk();
//		
//		Car c = new Car("v6", "Honda", 123456, 4, 6, "red", true);
//		System.out.println(c.cylinders);
//		c.ignition();
//		c.openTrunk();
//		
//		Bus b = new Bus();
//		b.pickUp(new Passenger());
//		b.dropOff();
//		b.ignition();
//		
//		Plane p = new Plane();
//		p.fly();
		
		/*
		 * reference variables hold more than just
		 * the memory address for objects in the heap,
		 * the two big pieces of data are:
		 * 	-memory address for object
		 *  -the type of object we are looking at
		 *  
		 *  You can create an instance of a parent
		 *  class using the child class constructor
		 */
		Vehicle airplane = new Plane();
		/*
		 * The parent constructor is not sufficient
		 * to describe all of the content within
		 * the subclass
		 */
//		Plane vehicle = new Vehicle();
		airplane.ignition();
		/*
		 * The syntax below showcases covariance
		 * or covariant typing
		 * 
		 * If we cast a parent class reference variable
		 * as a child, we will not get a compilation 
		 * error...
		 * However, it is possible to get a runtime
		 * error, if you are not careful
		 */
		((Plane)airplane).fly();
		
		Vehicle car = new Car();
		/*
		 * the instanceof reserved word is used as
		 * a binary operator that will provide a boolean
		 * when a reference variable is an instance of
		 * some class
		 */
		if (car instanceof Plane)
			((Plane)car).fly();
		
		Car sedan = new Car();
		Bus bus = new Bus();
		Plane plane = new Plane();
		
		Vehicle[] vehicles = {sedan, bus, plane};
		for (Vehicle v : vehicles) {
			v.ignition();
		}
	}
	
	public void cleanVehicle(Vehicle v) {
		
	}
}
