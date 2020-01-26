package com.adn.service.entidades;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@SpringBootApplication
@Entity
@Table(appliesTo = "estadistica")
public class Estadistica {
	
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO, generator = "increment" )
    @GenericGenerator( name="increment", strategy="increment" )
		    
	private Long id;
	
	private String respuesta;
	private String muestra;
	
	protected Estadistica() {}

	  public Estadistica(String respuesta, String muestra) {
	    this.respuesta = respuesta;
	    this.muestra = muestra;
	  }

	  @Override
	  public String toString() {
	    return String.format(
	        "estadistica[id=%d, respuesta='%s', muestra='%s']",
	        id, respuesta, muestra);
	  }

	  public Long getId() {
	    return id;
	  }

	  public String getRespuesta() {
	    return respuesta;
	  }

	  public String getMuestra() {
	    return muestra;
	  }
	


}
