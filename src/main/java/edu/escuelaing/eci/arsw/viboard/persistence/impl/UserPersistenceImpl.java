package edu.escuelaing.eci.arsw.viboard.persistence.impl;

import java.util.ArrayList;
import java.util.Optional;

import edu.escuelaing.eci.arsw.viboard.models.Room;
import edu.escuelaing.eci.arsw.viboard.models.User;
import edu.escuelaing.eci.arsw.viboard.persistence.UserPersistence;
import edu.escuelaing.eci.arsw.viboard.persistence.ViBoardException;

public class UserPersistenceImpl implements UserPersistence{

	@Override
	public void newRoom(Room room) throws ViBoardException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Room getRoom(Long id) throws ViBoardException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addUserRoom(User user, String pass) throws ViBoardException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<User> getUsersOfRoom(Long id) throws ViBoardException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<String> getCreatedRoom(Room romm) throws ViBoardException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Room> getRooms() throws ViBoardException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteRoom(Long id) throws ViBoardException {
		// TODO Auto-generated method stub
		
	}
	
}
