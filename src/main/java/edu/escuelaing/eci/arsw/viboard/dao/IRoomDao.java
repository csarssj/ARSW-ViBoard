package edu.escuelaing.eci.arsw.viboard.dao;

import org.springframework.data.repository.CrudRepository;

import edu.escuelaing.eci.arsw.viboard.models.Room;

public interface IRoomDao extends CrudRepository <Room, Long>{

}
