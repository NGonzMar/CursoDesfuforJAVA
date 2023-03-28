package com.rf.demo;

import java.util.Iterator;

public class FraseVolteada {
	public static void main(String[] args) {
		
		//Imprimir la frase escrita por argumentos		
		String entrada = "";
		int lg = args.length;
		int a;

		for (a = 0; a < lg; a++) {
		    entrada += args[a] + " ";
		}

		System.out.println("Fase 1: " + entrada);

		
		//Fase 2 (sin String)
		System.out.println("Fase 2 (sin String): ");
		int longitud = entrada.length();

		
		for (a = longitud - 1; a >= 0; a--) { 
		    System.out.print(entrada.charAt(a));
		}

		System.out.println();

			
		//Fase 2 (con String)
		String salida = "";
		for (a = longitud - 1; a >= 0; a--) {
			salida += entrada.charAt(a);
			
		}
		
		System.out.println("Fase 2 (con String): " + salida);
		
		
		//Fase 3 sustituir letras por numeros 
		String resul = "";
		
		for (int j = longitud - 1; j >= 0; j--) {
			switch (entrada.charAt(j)) {
			
			case 'a':
				resul += "4";
				break;
				
			case 'e':
				resul += "3";
				break;
				
			case 'i':
				resul += "1";
				break;
				
			case 'o':
				resul += "0";
				break;
				
			case 'u':
				resul += "9";
				break;
				
			default:
				resul += entrada.charAt(j);
				break;
			}
		}
		
		System.out.println("Fase 3: " + resul);

	}
}
