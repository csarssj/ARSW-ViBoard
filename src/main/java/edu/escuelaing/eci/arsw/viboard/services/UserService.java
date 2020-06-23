package edu.escuelaing.eci.arsw.viboard.services;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Service;


import edu.escuelaing.eci.arsw.viboard.models.User;
import edu.escuelaing.eci.arsw.viboard.persistence.ViBoardException;

@Service("UserService")
public interface UserService {

	public User save(User user) throws ViBoardException;

	public User findById(Long id) throws ViBoardException;

	public List<User> findAll() throws ViBoardException;

	public void deleteById(Long id) throws ViBoardException;

	public void deleteAll() throws ViBoardException;

}
