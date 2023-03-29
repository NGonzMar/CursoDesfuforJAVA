package curso.g4.operadores;

public class Circunferencia {

	public static void main(String[] args) {
		
		double area, longitud;
		double radio = 23;
		
		area = (Math.PI) * Math.pow(radio, 2);
		longitud = 2 * Math.PI * radio;
		
		System.out.println("El area de la circunferencia con radio " + radio + " es: " + (int)area);
		System.out.println("La longitud de una circunferencia de radio " + radio + " es: " + (int)longitud);
	}
}
