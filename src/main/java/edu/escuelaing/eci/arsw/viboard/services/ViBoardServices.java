package edu.escuelaing.eci.arsw.viboard.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.escuelaing.eci.arsw.viboard.models.Room;
import edu.escuelaing.eci.arsw.viboard.models.User;

@Service("viBoardServices")
public class ViBoardServices {
	
	@Autowired
	public void newRoom(Room room) {
		
	}

	public Room getRoom(Long id) {
		return null;
	} 
	
	public void addUserRoom(User user,String pass) {
		
	}
	public ArrayList<User> getUsersOfRoom(Long id) {
        return null;
    }
    public ArrayList<String> getCreatedRoom (Room romm) {
        return null;
    }

    public ArrayList<Room> getRooms(){
        return null;
    }
    public void deleteRoom(Long id)  {
    }
}
