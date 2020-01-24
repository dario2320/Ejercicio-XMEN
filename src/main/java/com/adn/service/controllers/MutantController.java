package com.adn.service.controllers;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.adn.service.funciones.*;
import com.adn.service.interfaces.EstadisticaRepository;
import com.adn.service.interfaces.EstadisticaService;
import com.adn.service.interfaces.EstadisticaServiceImpl;
import com.google.gson.Gson;
import com.adn.service.beans.Mutant;
import com.adn.service.entidades.*;

@SpringBootApplication
@Controller
public class MutantController {
	@Autowired
	Mutant m;	
	@Autowired
	EstadisticaService e;
	@Autowired
	ModelaMatriz modelamatriz;
	@RequestMapping(method = RequestMethod.GET, value="/getStats")
	
	@ResponseBody
	@GetMapping
	public String getStats() throws JSONException{
		JSONObject jo = new JSONObject();
		int mut = e.BuscarRespuesta("OK").size();
		int hum = e.BuscarRespuesta("FORBIDDEN").size();
		if (hum == 0){hum = 1;}
		//jo.put("Count_mutant_dna", mut);
		//jo.put("Count_human_dna", hum);
		//jo.put("Ratio", mut/hum);
	    m.setCount_mutant_dna(mut);
	    m.setCount_human_dna(hum);
	    m.setRatio((float)mut/hum);
	   
	    //String r = g.toJson(m);
	    
		return  m.toString();
	}
	
    @RequestMapping(method = RequestMethod.POST, value="/Mutant")
	@ResponseBody
	public HttpStatus isMutant(@RequestParam JSONObject value) throws JSONException{
    	int total = 0;
    	org.json.JSONArray json = value.getJSONArray("dna");
    	int l = json.length();
    	if (json.length() >= 4){
    	String[] dna = new String[l];
    	for (int j = 0; j < l; j++) {
			dna[j] = json.getString(j);
			//System.out.println(dna[j]);
		}
    	    total = modelamatriz.Ordena(dna);
  	}
		if (total > 1){
    		e.saveEstadistica(new Estadistica("OK", " "));
    		return HttpStatus.OK;
    	}else{
    		e.saveEstadistica(new Estadistica("FORBIDDEN", " "));
   		return HttpStatus.FORBIDDEN;
    	}
        
    	
	
	}

  }
