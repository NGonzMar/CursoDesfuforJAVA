package com.rf.demo;

/**
 * Calcular el factorial del numero 8
 * @author p-ngonzalez
 *
 */

public class Factorial8 {
	
	public static void main(String[] args) {
		int num = 8;
        int factorial = 1;
        for (int i = num; i >= 1; i--) {
            factorial *= i;
        }
        System.out.println("El factorial de " + num + " es " + factorial);
    }

}
