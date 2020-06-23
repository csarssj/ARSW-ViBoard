package edu.escuelaing.eci.arsw.viboard.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.escuelaing.eci.arsw.viboard.models.Room;
import edu.escuelaing.eci.arsw.viboard.persistence.ViBoardException;

@Service("RoomService")
public interface RoomService {
	
	public Room save(Room room) throws ViBoardException;

	public Room findById(Long id) throws ViBoardException;

	public List<Room> findAll() throws ViBoardException;

	public void deleteById(Long id) throws ViBoardException;

	public void deleteAll() throws ViBoardException;
}
