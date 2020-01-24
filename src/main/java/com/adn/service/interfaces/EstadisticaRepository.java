package com.adn.service.interfaces;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import com.adn.service.entidades.Estadistica;

@SpringBootApplication
public interface EstadisticaRepository extends JpaRepository<Estadistica, Long>{
	
	List<Estadistica> findByRespuesta(String respuesta);

	Estadistica findById(long id);
	
	
	
	
	

}
