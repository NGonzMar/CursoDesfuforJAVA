package com.rf.demo;

/**
 * Hacer una clase que convierta de números a letras, 
 * definiendo num=72. Podéis hacer una primera version 
 * en donde los números del 11 al 15 salgan como diez y uno, 
 * diez y dos…. y una segunda version corregida.
 * @author p-ngonzalez
 *
 */

public class NumerosALetras {

	public static void main(String[] args) {
		
		versionSimple();
		
		System.out.println();
		
		versionMejorada();
		
	}

	private static void versionMejorada() {
		int num = 12;
		int unidades , decenas;
		
		unidades = num % 10; 
		decenas = num / 10;
		
		String[] mitad1 = {"uno", "dos", "tres", "cuatro", "cinco", "seis",
				"siete", "ocho", "nueve", "diez", "once", "doce", "trece", "catorce", "quince"};
		
		String[] mitad2 = {"diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta",
				"setenta", "ochenta", "noventa"};
		
			if(num > 0) {
				if(num < 16) {
					System.out.println(mitad1[num-1]);
				}
				else {
					System.out.println(mitad2[decenas-1] + " y " + mitad1[unidades-1]);
				}
			}
	}

	private static void versionSimple() {
		int num = 12;
		int unidades , decenas;
		
		unidades = num % 10; 
		decenas = num / 10;
		
		switch (decenas) {
		case 0:
			System.out.println("");
			break;

		case 1:
			System.out.println("diez");
			break;
			
		case 2:
			System.out.println("veinte");
			break;
			
		case 3:
			System.out.println("treinta");
			
		case 4: 
			System.out.println("cuarenta");
			break;
			
		case 5:
			System.out.println("cincuenta");
			break;
			
		case 6:
			System.out.println("sesenta");
			break;
			
		case 7:
			System.out.println("setenta");
			break;
			
		case 8:
			System.out.println("ochenta");
			break;
			
		case 9:
			System.out.println("noventa");
			break;
			
		default:
			break;
		}
		
		System.out.println(" y ");
		switch (unidades) {
		case 0:
			System.out.println("");
			break;

		case 1:
			System.out.println("uno");
			break;
			
		case 2:
			System.out.println("dos");
			break;
			
		case 3:
			System.out.println("tres");
			
		case 4: 
			System.out.println("cuatro");
			break;
			
		case 5:
			System.out.println("cinco");
			break;
			
		case 6:
			System.out.println("seis");
			break;
			
		case 7:
			System.out.println("siete");
			break;
			
		case 8:
			System.out.println("ocho");
			break;
			
		case 9:
			System.out.println("nueve");
			break;
			
		default:
			break;
		}
	}
}
