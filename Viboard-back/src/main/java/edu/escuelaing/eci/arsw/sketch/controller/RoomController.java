package edu.escuelaing.eci.arsw.sketch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.escuelaing.eci.arsw.sketch.bean.Room;
import edu.escuelaing.eci.arsw.sketch.services.RoomService;
import edu.escuelaing.eci.arsw.sketch.services.ViBoardException;

@RestController
@RequestMapping("/api")
public class RoomController {
	
	@Autowired
	private RoomService room;
	
	@GetMapping("/rooms")
	public List<Room> findAll() throws ViBoardException{
		return room.findAll();
	}
}
