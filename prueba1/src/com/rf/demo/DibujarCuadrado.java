package com.rf.demo;

/**
 * Dibuja un cuadrado, como en la imagen que acompaña, con ocho * de lado.
 * @author p-ngonzalez
 *
 */

public class DibujarCuadrado {
	
	public static void main(String[] args) {
		
		int lado = 8; //tamaño de cada lado (al ser cuadrado)
        int fila, columna;

        for (fila = 1; fila <= lado; fila++) {

            for (columna = 1; columna <= lado; columna++) {
                System.out.print("* "); // se cambia println por print para no saltar de línea
            }

            System.out.println(""); // al final de cada fila, se salta de línea
        }
	}

}
