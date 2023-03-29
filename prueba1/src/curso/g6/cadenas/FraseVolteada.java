package curso.g6.cadenas;

import java.util.Iterator;

public class FraseVolteada {
	public static void main(String[] args) {
					
		//FASE 1
		String entrada = "";
		for (int i = 0; i < args.length; i++) {
			entrada += args[i] + " ";
		}
		System.out.println("Fase 1 - " + entrada);

		
		//FASE 2
		String volteada = "";
		for (int i = entrada.length() - 1; i >= 0; i--) {
			volteada += entrada.charAt(i);
		}
		System.out.println("Fase 2 - " + volteada);

		
		//FASE 3
		String resultado = "";
		for (int i = 0; i < entrada.length(); i++) {
			
			switch (entrada.charAt(i)) {
			
			case 'A':
			case 'a':
				resultado += "4";
				break;
				
			case 'E':
			case 'e':
				resultado += "3";
				break;
				
			case 'I':
			case 'i':
				resultado += "1";
				break;
				
			case 'O':
			case 'o':
				resultado += "0";
				break;
				
			case 'U':
			case 'u':
				resultado += "9";
				break;
				
			default:
				resultado += entrada.charAt(i);
				break;
				
			}
		}
		System.out.println("Fase 3 - " + resultado);

		
		//FASE 4
		char bus = entrada.charAt(0);
		System.out.print("Fase 4 - ");
		for (int i = 1; (entrada + bus).charAt(i) != bus; i++) {
			System.out.print(entrada.charAt(i));
		}
		System.out.println();

		
		//FASE 5
		entrada += (char) 0;
		int pos = 0;
		String salida1 = "";
		
		while (entrada.charAt(pos) != (char) 0) {
			salida1 = entrada.charAt(pos++) + salida1;
		}
		System.out.println("Fase 5 - " + salida1);
	}
}
