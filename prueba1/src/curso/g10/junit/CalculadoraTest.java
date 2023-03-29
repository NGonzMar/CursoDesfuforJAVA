package curso.g10.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class CalculadoraTest {
	
	private Calculadora calc = new Calculadora();
	
	@BeforeEach
	void setUp() throws Exception{
		this.calc = new Calculadora();
	}
	
	@Test
	public void testSumar() {

		double resultado = calc.suma(2.3, 3.5);
		
		assertEquals(5.8, resultado);
	}
	
	@Test
	public void testRestar() {
		
		double resultado = calc.resta(10.0, 12.0);
		
		assertEquals(-2, resultado);
		
	}
	
	@Test
	public void testMultiplicar() {
		
		double resultado = calc.producto(2.0, 5.0);
		
		assertEquals(10.0, resultado);
	}
	
	@Test
	public void testDividir() {
		double resultado = calc.division(15.0, 3.0);
		
		assertEquals(5.0, resultado);
	}

}
