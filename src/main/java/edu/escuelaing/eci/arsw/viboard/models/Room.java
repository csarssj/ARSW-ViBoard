package edu.escuelaing.eci.arsw.viboard.models;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Room {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String pass;
	private String name;
	private User creator;
	private static final int capacity = 8;
	private ArrayList<User> users; 
	
	public Room() {}
	
	public Room(User creator,String name,ArrayList<User> users) {
		this.creator = creator;
		this.name = name;
		this.users = users;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public ArrayList<User> getUsers() {
		return users;
	}
	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCapacity() {
		return capacity;
	}
	public User getCreator() {
		return creator;
	}
	public void setCreator(User creator) {
		this.creator = creator;
	}
	
}
