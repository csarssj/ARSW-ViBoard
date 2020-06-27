package edu.escuelaing.eci.arsw.sketch.dao;

import org.springframework.data.repository.CrudRepository;
import edu.escuelaing.eci.arsw.sketch.bean.Room;

public interface IRoomDao extends CrudRepository <Room, Long>{

}
