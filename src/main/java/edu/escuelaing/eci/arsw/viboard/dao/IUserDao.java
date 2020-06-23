package edu.escuelaing.eci.arsw.viboard.dao;

import org.springframework.data.repository.CrudRepository;

import edu.escuelaing.eci.arsw.viboard.models.User;

public interface IUserDao extends CrudRepository <User, Long> {

}
