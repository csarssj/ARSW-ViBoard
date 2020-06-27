package edu.escuelaing.eci.arsw.sketch.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.escuelaing.eci.arsw.sketch.bean.Room;



@Service("RoomService")
public interface RoomService {
	
	public Room save(Room room) throws ViBoardException;

	public Room findById(Long id) throws ViBoardException;

	public List<Room> findAll() throws ViBoardException;

	public void deleteById(Long id) throws ViBoardException;

	public void deleteAll() throws ViBoardException;
}
