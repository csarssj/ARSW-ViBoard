package edu.escuelaing.eci.arsw.sketch.services.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.escuelaing.eci.arsw.sketch.bean.User;
import edu.escuelaing.eci.arsw.sketch.dao.IUserDao;
import edu.escuelaing.eci.arsw.sketch.services.UserService;
import edu.escuelaing.eci.arsw.sketch.services.ViBoardException;



@Service
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
