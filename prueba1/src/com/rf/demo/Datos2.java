package com.rf.demo;

public class Datos2 {
	
	static int dia = 10;
	static long nDni = 57433222;
	static double precio; //valores numericos con dos decimales
	final static boolean ACTIVO = true;
		
	public static void main(String[] args) {		
		
		precio = 135.12;
		
		System.out.println("Dia: " + dia + 
							"\nDni: " + nDni +
							"\nPrecio: " + precio + 
							"\nActivo: " + ACTIVO);
	}

}
