package com.adn.service.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.adn.service.funciones.*;

@Controller
public class MutantController {
	
	ModelaMatriz modelamatriz;
	@RequestMapping(method = RequestMethod.GET, value="/getStats")
	
	@ResponseBody
	public String getStats(){
	return "true";
	}
	
    @RequestMapping(method = RequestMethod.POST, value="/Mutant")
	
	@ResponseBody
	public HttpStatus isMutant(String[] dna){
    	int total = 0;
    	if (dna.length >= 4){
    	total = modelamatriz.Ordena(dna);
    	}
    	if (total == 4){
    		return HttpStatus.OK;
    	}else{
    		return HttpStatus.FORBIDDEN;
    	}
    		
    	
	
	}

}
