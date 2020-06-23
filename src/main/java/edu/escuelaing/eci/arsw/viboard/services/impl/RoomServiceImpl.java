package edu.escuelaing.eci.arsw.viboard.services.impl;

import edu.escuelaing.eci.arsw.viboard.dao.IRoomDao;
import edu.escuelaing.eci.arsw.viboard.models.Room;
import edu.escuelaing.eci.arsw.viboard.persistence.ViBoardException;
import edu.escuelaing.eci.arsw.viboard.services.RoomService;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomServiceImpl implements RoomService {
	
	@Autowired
	private IRoomDao roomP;

	@Override
	@Transactional
	public Room save(Room room) throws ViBoardException {
		return (Room) roomP.save(room);
	}

	@Override
	@Transactional
	public Room findById(Long id) throws ViBoardException {
		return roomP.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public List<Room> findAll() throws ViBoardException {
		return (List<Room>)roomP.findAll();
	}

	@Override
	@Transactional
	public void deleteById(Long id) throws ViBoardException {
		roomP.deleteById(id);
	}

	@Override
	@Transactional
	public void deleteAll() throws ViBoardException {
		roomP.deleteAll();
		
	}
}
