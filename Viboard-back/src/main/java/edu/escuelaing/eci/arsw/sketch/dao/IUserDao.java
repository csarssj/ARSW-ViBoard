package edu.escuelaing.eci.arsw.sketch.dao;

import org.springframework.data.repository.CrudRepository;

import edu.escuelaing.eci.arsw.sketch.bean.User;


public interface IUserDao extends CrudRepository <User, Long> {

}
