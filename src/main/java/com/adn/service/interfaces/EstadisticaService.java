package com.adn.service.interfaces;

import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.adn.service.entidades.Estadistica;
@SpringBootApplication
public interface EstadisticaService {
	
	 public Boolean saveEstadistica(Estadistica estadistica);
	 
	 List<Estadistica> BuscarRespuesta(String respuesta);

}
