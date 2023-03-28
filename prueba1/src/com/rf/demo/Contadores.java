package com.rf.demo;

public class Contadores {

	public static void main(String[] args) {
		int valor = 0;
		valor = 23;
		valor += 10;
		
		System.out.println("Resultado a (--valor): " + --valor);
		System.out.println("Resultado b (++valor): " + ++valor);
		System.out.println("Resultado c (valor++): " + valor++);
		System.out.println("Resultado d (valor--): " + valor--);
		System.out.println("Resultado e (valor): " + valor);
	}
}
