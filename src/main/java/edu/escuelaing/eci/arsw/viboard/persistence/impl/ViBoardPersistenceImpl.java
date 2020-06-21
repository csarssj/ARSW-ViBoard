package edu.escuelaing.eci.arsw.viboard.persistence.impl;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import edu.escuelaing.eci.arsw.viboard.models.Room;
import edu.escuelaing.eci.arsw.viboard.models.User;
import edu.escuelaing.eci.arsw.viboard.persistence.ViBoardPersistence;

@Service
public class ViBoardPersistenceImpl implements ViBoardPersistence {

	@Override
	public void newRoom(Room room) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Room getRoom(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addUserRoom(User user, String pass) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<User> getUsersOfRoom(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<String> getCreatedRoom(Room romm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Room> getRooms() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteRoom(Long id) {
		// TODO Auto-generated method stub
		
	}

}
