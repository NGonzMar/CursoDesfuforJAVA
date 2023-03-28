package com.rf.demo;

public class Contar100PrimerosNumerosPrimos {
	
	public static void main(String[] args) {
        int contador = 0; // Inicializamos el contador de números primos a cero
        
        for (int i = 2; i <= 100; i++) { // Iteramos los números desde 2 hasta 100 (ambos incluidos)
            boolean esPrimo = true; // Suponemos que el número actual es primo
            
            for (int j = 2; j < i; j++) { // Iteramos los números desde 2 hasta el número actual (excluyendo el propio número)
                if (i % j == 0) { // Si el número actual es divisible por algún número menor a él mismo
                    esPrimo = false; // Entonces no es primo
                    break; // Y salimos del bucle interno
                }
            }
            
            if (esPrimo) { // Si después de haber iterado todos los números menores al número actual, no encontramos ninguno que lo divida exactamente
                contador++; // Entonces incrementamos el contador de números primos en 1
            }
        }
        
        System.out.println("Hay " + contador + " numeros primos entre 1 y 100"); // Imprimimos el resultado final
    }

}
