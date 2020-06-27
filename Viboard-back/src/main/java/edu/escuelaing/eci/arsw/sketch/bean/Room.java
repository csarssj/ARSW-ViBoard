package edu.escuelaing.eci.arsw.sketch.bean;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rooms")
public class Room {

	@Id
	private Long id;
	
	private String tittle;
	private String pass;
	private String creator;
	private int capacity;
	
	public Room() {}
	
	/*public Room(User creator,String tittle,ArrayList<User> users) {
		this.creator = creator;
		this.tittle = tittle;
		//this.users = new ArrayList<User>();
		//this.users.add(creator);
		//this.users = users;
	}*/

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
	/*public ArrayList<User> getUsers() {
		return users;
	}
	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}*/
    public String getTittle() {
		return tittle;
	}
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	
}
