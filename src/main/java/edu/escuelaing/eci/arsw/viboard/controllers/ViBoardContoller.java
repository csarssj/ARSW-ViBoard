package edu.escuelaing.eci.arsw.viboard.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.escuelaing.eci.arsw.viboard.models.Room;
import edu.escuelaing.eci.arsw.viboard.models.User;


@RestController
@RequestMapping(value= "/rooms")
public class ViBoardContoller {
	
	@Autowired
	
	
	@RequestMapping(method = RequestMethod.POST)
	public void newRoom(Room room) {
		
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/rooms/{roomId}")
	public Room getRoom(Long id) {
		return null;
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/rooms")
	public ArrayList<Room> getRooms() {
		return null;
	}
	
	@RequestMapping (method = RequestMethod.PUT,value = "/{roomId}/{user}")
	public void addUserRoom(User user, String pass) {

	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/rooms/{roomId}/users")
	public ArrayList<User> getUsersOfRoom(Long id) {
		return null;
	}
	
	@RequestMapping(method = RequestMethod.GET,path = "/rooms/{user}")
	public ArrayList<String> getCreatedRoom(Room room) {
		return null;
	}

	
	@RequestMapping(method = RequestMethod.DELETE, path = "/rooms/{roomId}")
	public void deleteRoom(Long id) {
	}
}
