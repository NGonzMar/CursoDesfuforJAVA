package curso.g10.junit;

/**
 * Esta clase implementa una calculadora básica con cuatro operaciones aritméticas: 
 * suma, resta, producto y división.
 */

public class Calculadora {
	
	public double suma(double a, double b) {
		return a + b;
	}
	
	public double resta(double a, double b) {
		return a - b;
	}
	
	public double producto(double a, double b) {
		return a * b;
	}
	
	public double division(double a, double b) throws ArithmeticException {
		if (b == 0) {
			throw new ArithmeticException("No es posible dividir por cero.");
		}
		return a / b;
	}

}