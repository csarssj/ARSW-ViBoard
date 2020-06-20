package edu.escuelaing.eci.arsw.viboard.models;

import javax.persistence.Entity;

@Entity
public class Board {
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
