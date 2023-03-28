package com.rf.demo;

import java.util.Iterator;
import java.util.Scanner;

public class CalcularCuadradoDeNum {

	public static void main(String[] args) {
//	Scanner sc = new Scanner (System.in);
//	
//	int num, cuadrado;
//	
//	System.out.print("Introduce un numero: ");
//	num = sc.nextInt();
	
		int num, cuadrado;
		for (String nums : args) {
			num = Integer.parseInt(nums);
			cuadrado = num * num;
			
			System.out.println("El " + num + "² es " + cuadrado);
		}
	}
}
