package curso.g5.bucles;

/**
 * Presentar en consola las tablas de multiplicar del 1 al 10
 * @author p-ngonzalez
 *
 */

public class TablasMultiplicar {
	
	public static void main(String[] args) {
		
		int tabla, i;
		
		for (tabla = 1; tabla <= 10; tabla++) {
			System.out.println("\n\n------------");
			System.out.println("Tabla del " + tabla);
			System.out.println("------------");
			
			for (i = 1; i <= 10; i++) {
				System.out.println(tabla + " x " + i + " = " + (tabla * i));
			}
		}
		
	}

}
