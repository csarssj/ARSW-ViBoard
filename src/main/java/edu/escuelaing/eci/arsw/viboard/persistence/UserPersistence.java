package edu.escuelaing.eci.arsw.viboard.persistence;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import edu.escuelaing.eci.arsw.viboard.models.Room;
import edu.escuelaing.eci.arsw.viboard.models.User;

public interface UserPersistence {
	public void newRoom(Room room) throws ViBoardException;

	public Room getRoom (Long id) throws ViBoardException;
	
	public void addUserRoom(User user,String pass) throws ViBoardException;
	
	public ArrayList<User> getUsersOfRoom(Long id) throws ViBoardException;
    
	public ArrayList<String> getCreatedRoom (Room romm) throws ViBoardException;

    public ArrayList<Room> getRooms() throws ViBoardException;

    public void deleteRoom(Long id) throws ViBoardException;

}
