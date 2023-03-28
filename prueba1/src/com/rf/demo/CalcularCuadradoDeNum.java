package com.rf.demo;

import java.util.Scanner;

/**
 * Recibir una colección de números desde la linea de comandos, calcular su cuadrado y presentarlo en salida.
 * @author p-ngonzalez
 *
 */

public class CalcularCuadradoDeNum {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int num, cuadrado;
        boolean seguir = true;
        
        while (seguir) {
            System.out.print("Introduce un número (o escribe 'salir' para terminar): ");
            String entrada = sc.nextLine().toLowerCase();
            if (entrada.equalsIgnoreCase("salir")) {
                seguir = false;
                break;
            }
            num = Integer.parseInt(entrada);
            cuadrado = num * num;
            System.out.println(num + "² es igual a " + cuadrado);
        }
    }
}
