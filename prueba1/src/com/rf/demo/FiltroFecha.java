package com.rf.demo;
/**
 * Definir día=20, mes =8,año = 2015, y luego añadir 
 * el código para comprobar que la fecha es correcta.
 * @author p-ngonzalez
 *
 */

public class FiltroFecha {

	public static void main(String[] args) {
		//Version considerando que todos los meses tienen 30 dias
		version1();
		
		
		//Version usando dias reales sin array
		version2();
		
		
		//Version usando array
		version3();
		
		
		//Version teniendo en cuenta los años bisiestos
		version4();
	}

	private static void version4() {
		int dia = 20;
		int mes = 8;
		int anio = 2015;
		int diasMeses[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if (mes >= 1 && mes <= 12) {
			if(anio != 0) {
				if(anio % 4 == 0) diasMeses[1] = 29;
				if(dia <= diasMeses[mes-1]) System.out.println("Fecha correcta.");
				else System.out.println("Dia incorrecto.");
			}
			else {
				System.out.println("Año incorrecto");
			}
		}
		else {
			System.out.println("Mes incorrecto");
		}
	}

	private static void version3() {
		int dia = 20;
		int mes = 8;
		int anio = 2015;
		int diasMeses[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if (mes >= 1 && mes <= 12) {
			if(anio != 0) {
				if(dia <= diasMeses[mes-1]) System.out.println("Fecha correcta.");
				else System.out.println("Dia incorrecto.");
			}
			else {
				System.out.println("Año incorrecto");
			}
		}
		else {
			System.out.println("Mes incorrecto");
		}
	}

	private static void version2() {
		int dia = 20;
		int mes = 8;
		int anio = 2015;
		boolean isCorrect = false;

		if(mes >= 1 && mes <= 12) {
		    if(anio != 0) {
		        switch(mes) {
		            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
		                if(dia <= 31) isCorrect = true;
		                break;

		            case 4: case 6: case 9: case 11:
		                if(dia <= 30) isCorrect = true;
		                break;

		            case 2:
		                if(anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)) { // bisiesto
		                    if(dia <= 29) isCorrect = true;
		                }
		                else {
		                    if(dia <= 28) isCorrect = true;
		                }
		                break;

		            default:
		                System.out.println("Mes incorrecto");
		                break;
		        }

		        if(isCorrect) System.out.println("Fecha correcta");
		        else System.out.println("Dia incorrecto.");
		    }
		    else {
		        System.out.println("Año incorrecto.");
		    }
		}
		else {
		    System.out.println("Mes incorrecto.");
		}
	}

	private static void version1() {
		int dia = 20;
		int mes = 8;
		int anio = 2015;
		
		if(dia >= 1 && dia <= 30)
			if(mes >= 1 && mes <= 12)
				if(anio != 0)
					System.out.println("Fecha correcta");
				else
					System.out.println("Año incorrecto");
			else
				System.out.println("Mes incorrecto");
		else
			System.out.println("Dia incorrecto");
	}
}
