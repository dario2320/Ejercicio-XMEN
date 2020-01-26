package com.adn.service.beans;

import java.io.Serializable;
import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class Mutant implements Serializable{
	private static final long serialVersionUID = 1L;
	int count_mutant_dna;
	int count_human_dna;
	double ratio;
	
	@Override
	  public String toString() {
	    return String.format(
	        "ADN:\"{\"count_mutant_dna\":\"%d\", \"count_human_dna\":\"%d\", \"ratio\":\"%.1f\"}\"",
	        count_mutant_dna, count_human_dna, ratio);}
	    
	public int getCount_mutant_dna() {
		return count_mutant_dna;
	}
	public void setCount_mutant_dna(int count_mutant_dna) {
		this.count_mutant_dna = count_mutant_dna;
	}
	public int getCount_human_dna() {
		return count_human_dna;
	}
	public void setCount_human_dna(int count_human_dna) {
		this.count_human_dna = count_human_dna;
	}
	public double getRatio() {
		return ratio;
	}
	public void setRatio(float ratio) {
		this.ratio = ratio;
	}
	
	

	

}
