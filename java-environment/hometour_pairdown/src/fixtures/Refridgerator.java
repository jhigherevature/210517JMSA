package fixtures;

/*
 * Sample class that can be used
 */
public class Refridgerator extends Fixture {
	// constructor
	public Refridgerator(String name, String shortDesc, String longDesc) {
		super(name, shortDesc, longDesc);
	}
	
	public void open() {
		/* describe what happens when you open the fridge
		 * 
		 * Should you have an 'Openable' interface? or an
		 * 'Interactable' interface?
		 */
	}
}
