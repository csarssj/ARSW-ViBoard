package edu.escuelaing.eci.arsw.viboard.persistence;

import java.util.ArrayList;


import edu.escuelaing.eci.arsw.viboard.models.Room;
import edu.escuelaing.eci.arsw.viboard.models.User;


public interface ViBoardPersistence {
	
	public void newRoom(Room room);

	public Room getRoom(Long id);
	
	public void addUserRoom(User user,String pass);
	
	public ArrayList<User> getUsersOfRoom(Long id);
    
	public ArrayList<String> getCreatedRoom (Room romm);

    public ArrayList<Room> getRooms();

    public void deleteRoom(Long id);
}
