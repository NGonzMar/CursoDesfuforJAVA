package com.rf.demo;

/**
 * Crear una variable (nota) con el valor 6, y decidir el texto 
 * que se ha de presentar según la siguiente escala.
 * @author p-ngonzalez
 *
 */

public class Notas {
	
	public static void main(String[] args) {
		
		int nota = 6;
		
		switch(nota) {
		
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("INSUFICIENTE");
			break;
			
		case 5:
			System.out.println("SUFICIENTE");
			break;
			
		case 6: 
			System.out.println("BIEN");
			break;
		
		case 7:
		case 8:
			System.out.println("NOTABLE");
			break;
			
		case 9:
		case 10:
			System.out.println("SOBRESALIENTE");
			break;
			
		default:
			System.out.println("Nota incorrecta,");
		}
	}

}
