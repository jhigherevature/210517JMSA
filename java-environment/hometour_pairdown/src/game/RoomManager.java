package game;

import fixtures.Room;

public class RoomManager {
	private Room startingRoom;
	
	/*
	 * Basic array to hold onto all rooms in our house
	 */
	private Room[] rooms;
	
	public RoomManager(int roomCount) {
		// TODO: Implement
		super();
	}
	
	public void init() {
		// TODO: Implement
		/*
		 * method that is used to create our house... 
		 * create multiple Room object and/or Knick-Knacks (Fixtures)
		 * within those rooms. Establish exits, etc...
		 */
	}

	// Find a single room...
	public Room getRoom(int index) {
		// TODO: Implement
		return null;
	}
	
	/*
	 * Used to find a specific room using the room's name
	 */
	public Room getRoom(String roomName) {
		// TODO: Implement
		return null;
	}
	
	/*
	 * Getters and Setters...
	 */
	public Room getStartingRoom() {
		return this.startingRoom;
	}
	
	public void setStartingRoom(Room startingRoom) {
		this.startingRoom = startingRoom;
	}
	
	public Room[] getRooms() {
		return this.rooms;
	}
	
	public void setRooms(Room[] rooms) {
		this.rooms = rooms;
	}
}
