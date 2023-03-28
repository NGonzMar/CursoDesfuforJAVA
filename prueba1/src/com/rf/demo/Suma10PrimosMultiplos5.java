package com.rf.demo;

/**
 * Calcular la suma de los primeros 10 números múltiplos de 5
 * @author p-ngonzalez
 *
 */

public class Suma10PrimosMultiplos5 {
	
	public static void main(String[] args) {
		
		int cont = 10;
		long total = 0;
		int indice = 0;
		
		while(cont > 0) {
			if(++indice % 5 == 0) {
				--cont;
				total += indice;
				
				System.out.println("Total de numeros primos: " + total);
			}
		}
	}

}
