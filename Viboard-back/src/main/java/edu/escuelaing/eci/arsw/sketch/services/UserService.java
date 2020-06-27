package edu.escuelaing.eci.arsw.sketch.services;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Service;

import edu.escuelaing.eci.arsw.sketch.bean.User;



@Service("UserService")
public interface UserService {

	public User save(User user) throws ViBoardException;

	public User findById(Long id) throws ViBoardException;

	public List<User> findAll() throws ViBoardException;

	public void deleteById(Long id) throws ViBoardException;

	public void deleteAll() throws ViBoardException;

}
