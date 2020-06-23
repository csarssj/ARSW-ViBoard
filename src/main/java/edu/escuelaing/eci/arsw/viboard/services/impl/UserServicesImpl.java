package edu.escuelaing.eci.arsw.viboard.services.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import edu.escuelaing.eci.arsw.viboard.dao.IUserDao;
import edu.escuelaing.eci.arsw.viboard.models.User;
import edu.escuelaing.eci.arsw.viboard.persistence.ViBoardException;
import edu.escuelaing.eci.arsw.viboard.services.UserService;

public class UserServicesImpl implements UserService  {
	@Autowired
	private IUserDao userP;

	@Override
	public User save(User user) throws ViBoardException {
		return userP.save(user);
	}

	@Override
	public User findById(Long id) throws ViBoardException {
		return (User) userP.findById(id).orElse(null);
	}

	@Override
	public List<User> findAll() throws ViBoardException {
		return (List<User>) userP.findAll();
	}

	@Override
	public void deleteById(Long id) throws ViBoardException {
		userP.deleteById(id);
		
	}

	@Override
	public void deleteAll() throws ViBoardException {
		userP.deleteAll();
		
	}
}
