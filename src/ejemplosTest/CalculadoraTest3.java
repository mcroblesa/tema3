package ejemplosTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ejemplos.Calculadora;

class CalculadoraTest3 {
	
	private Calculadora calcu;

	
	@BeforeEach
	public void creaCalculadora() {
		calcu = new Calculadora(20, 10);
	}
	
	@Test
	void testSuma() {
		double valorEsperado = 30;		
		double resultado = calcu.suma();
		assertEquals(valorEsperado, resultado, 0);
	}

	@Test
	void testResta() {
		fail("Not yet implemented");
	}

	@Test
	void testMultiplica() {
		fail("Not yet implemented");
	}

	@Test
	void testDivide() {
		fail("Not yet implemented");
	}

	@Test
	void testDivide0() {
		fail("Not yet implemented");
	}

}
