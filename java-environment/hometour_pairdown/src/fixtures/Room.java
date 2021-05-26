package fixtures;

public class Room extends Fixture {
	/*
	 * Arbitrarily establish 4 exits (north, south, east, west)
	 * per room
	 */
	private Room[] exits = new Room[4];
	
	// If you want extra knick-knacks in your rooms...
	private Fixture[] items;

	public Room(String name, String shortDesc, String longDesc) {
		super(name, shortDesc, longDesc);
	}
	
	public Room[] getExits() {
		return this.exits;
	}
	
	public Room getExit(String direction) { 
		/*
		 * The getExit method can be used to retrieve
		 * a single room based on a command/direction
		 * that is provided
		 */
		return null;
	}
	
	// setter for exits
	public void setExits(Room[] exits) {
		this.exits = exits;
	}
}
