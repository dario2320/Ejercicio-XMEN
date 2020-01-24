package com.adn.service.interfaces;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.adn.service.entidades.Estadistica;
@SpringBootApplication
@Service
public class EstadisticaServiceImpl implements EstadisticaService{
	 @Autowired
     public EstadisticaRepository estadisticaRepository;    
	 
	 @Override
	 public Boolean saveEstadistica(Estadistica estadistica) {          
		 try {
             estadisticaRepository.save(estadistica);
			 return true;
               
          } catch (Exception e) {
        	  System.out.println(e.getMessage());
               return false;
          }     
		 }
	 @Override
	 public List<Estadistica> BuscarRespuesta(String respuesta){
		return estadisticaRepository.findByRespuesta(respuesta);
	 }
	 
	
}
