package game;

import fixtures.Room;

/*
 * Representation for our player as they move throughout
 * the house
 */
public class Player {
	private Room currentRoom;
	
	public Room getCurrentRoom() {
		return currentRoom;
	}
	
	public void setCurrentRoom(Room currentRoom) {
		this.currentRoom = currentRoom;
	}
}
