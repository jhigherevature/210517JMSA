package animal;

/*
 * import statements will determine the 'default'
 * class type when creating object references.
 * 
 * You can use the fully qualified class name if you
 * want to use other classes, from other packages which
 * share the same name as another class you are referencing
 */
import java.util.Date;
//import java.sql.Date; // error - class name collision

public class Dog {
	String name;
	String breed;
	double weight;
	int age;
	
	Date adopted;
	java.sql.Date otherDate;
	
	/*
	 * Constructors : special methods (subroutines technically)
	 * that are used to create/initialize the values on an
	 * object from a class.
	 * 
	 * In Java, every class must have a constructor. If
	 * you do not define your own constructor java will 
	 * provide one for you. If you define a custom 
	 * constructor then the default constructor will not 
	 * be given to your class.
	 * 
	 * Syntax:
	 * <access_modifier - typically public> <name-of-class-exactly>
	 * ex:
	 * default consturctor looks like the following:
	 * public Dog () { }
	 * 
	 * default constructors are declared, public and take no arguments/declare no parameters
	 */
	public Dog(String name, String breed, double weight, int age) {
		/*
		 * Specifically the 'this' keyword is a reference to
		 * the current class/object in which the 'this' keyword
		 * is used.
		 * 
		 * The 'this' keyword is used to disambiguate between
		 * the names of the parameters used in this method, and
		 * the fields (which exist in the instance scope) on our
		 * Dog class.
		 * 
		 * Note that sharing the name of a parameter and it's
		 * associated field on a class is a convention that is
		 * used, not a hard-set rule in java
		 * 
		 * We use the 'this' keyword due to 'variable shadowing'
		 * variables at a class/instance scope will reside in
		 * the shadow of variables in the method/block scope level
		 * if they share the same name.
		 */
		this.name = name;
		this.breed = breed;
		this.weight = weight;
		this.age = age;
		doStuff();
		// we do some more things here...
	}
	
	public Dog(String name, int age) {
		/*
		 * The 'this()' method is a reference to
		 * another constructor on our class...
		 * 
		 * This is used to consolidate the logic of
		 * our constructors
		 */
		this(name, "no breed provided", 0.00, age);
	}
	
	public Dog(String name, String breed) {
		this(name, breed, 0.00, 1);
	}

	public Dog() {
		this("Default", "no breed", 0.00, 1);
	}
	
	public void doStuff() {
		/*
		 * This method is used to showcase consolidation
		 * of logic using the 'this' keyword in constructors
		 * image that we had complex code we perform
		 * everytime we create a Dog object
		 */
	}
	
	public void bark() {
		System.out.println("Woof Woof");
	}
}
