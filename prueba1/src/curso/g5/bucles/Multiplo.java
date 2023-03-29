package curso.g5.bucles;

/**
 * Cargar dos variables int  con los valores 10 y 20, e indicar cual es mayor, 
 *si son iguales, o si uno es múltiplo de otro. Para probar el programa, 
 *cargando distintos valores en las variables. 
 * @author p-ngonzalez
 *
 */

public class Multiplo {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		if(num1 == num2) {
			System.out.println("El numero " + num1 + " y el numero " + num2 + " son iguales.");	
		
		}else {
			
			if (num1 > num2)
				System.out.println(num1 + " es mayor que " + num2);
			
			else 
				System.out.println(num2 + " es mayor que " + num1);
		}
		
		if(num1 % num2 == 0) {
			System.out.println("Son multiplos.");
		}else {
			System.out.println("No son multiplos.");
		}		
	}
}
