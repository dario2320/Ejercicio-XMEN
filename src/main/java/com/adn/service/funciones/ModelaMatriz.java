package com.adn.service.funciones;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ModelaMatriz {
	
	public int Ordena(String[]dna){
		char[][]dnaV = new char[dna.length][dna.length];
		char[][]dnaO = new char[dna.length][dna.length];
		int i;
		int j;
		int total = 0;
		for(i=0;  dna.length > i; i++){
			
			for(j=0; dna.length > j; j++){
				switch (dna[i].charAt(j)){
				case 'A': return 0;
				case 'C': break;
				case 'G': break;
				case 'T': break;
				default: return 0;
				}
				dnaO[i][j] = dna[i].charAt(j);
				dnaV[i][j] = dna[j].charAt(i);
			
			}
			}
		total = total + analisisM(dnaO,dna.length)+analisisM(dnaV,dna.length)+
				analisisMatrizD(dnaO, dna.length, 0, 0) + analisisMatrizD(dnaV, dna.length, 1, 1)+
				analisisMatrizDI(dnaO, dna.length, 0, dna.length-1)+analisisMatrizDI(dnaV, dna.length, 0, dna.length-1);	
		
		
		return total;
	}
	
	public int analisisM(char[][]dna, int len){
		int k = 0;
		int v = 0;
		int cuenta = 0;
		int parcial = 0;
		int total = 0;
		char p = ' ';
		for(k=0; len>k; k++){
			   p = ' ';
			   for(v=0; len > v; v++){
				   char m = dna[k][v];
				   if (p==' ') {
				      p = m;
				   } else {
					   if (p==m) {
						   cuenta = cuenta + 1;
						   p = m;
						   if (cuenta==3){
							   parcial = parcial + 1;
						   }
					   } else {
						   cuenta = 0;
						   p=m;
					   }
					   
				   }
				   if (cuenta == 3){
					   total = total + parcial;
				   }
			   }
		   }
		return total;
	}
	public int analisisMatrizD(char[][]dna, int len, int h, int n){
		int k;
		int v;
		int ki = 0;
		int cuenta = 0;
		int parcial = 0;
		int total = 0;
		char p = ' ';
		for(k=h, ki=0; len>k; k++){
			   p = ' ';
			   ki=k;
			   for(v=n; len > v; v++){
				   char m = dna[ki][v];
				   ki = ki+1;
				   if (ki>=len){break;}
				   if (p==' ') {
				      p = m;
				   } else {
					   if (p==m) {
						   cuenta = cuenta + 1;
						   p = m;
						   if (cuenta==3){
							   parcial = parcial + 1;
						   }
					   } else {
						   cuenta = 0;
						   p=m;
					   }
					   
				   }
				   if (cuenta == 3){
					   total = total + parcial;
				   }
			   }
		   }
		return total;
	}
	public int analisisMatrizDI(char[][] dna, int len, int h, int n){
		int k;
		int v;
		int ki = 0;
		int cuenta = 0;
		int parcial = 0;
		int total = 0;
		char p = ' ';
		for(k=h, ki=0; len>k; k++){
			   p = ' ';
			   ki=k;
			   for(v=n; 0 <= v; v--){
				   char m = dna[ki][v];
				   ki = ki+1;
				   if (ki>=6){break;}
				   if (p==' ') {
				      p = m;
				   } else {
					   if (p==m) {
						   cuenta = cuenta + 1;
						   p = m;
						   if (cuenta==3){
							   parcial = parcial + 1;
						   }
					   } else {
						   cuenta = 0;
						   p=m;
					   }
					   
				   }
				   if (cuenta == 3){
					   total = total + parcial;
				   }
			   }
		   }
		return total;
	}

}
