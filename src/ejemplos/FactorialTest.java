package ejemplos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;


class FactorialTest {
	@Test
	public  void testCalculo() {
		int valorEsperado = 5040;
		int resultado = Factorial.calculo(7);
		assertEquals(valorEsperado, resultado, 0);
	}
	
	@Test
	public  void testCalculo2() {
		int valorEsperado = 120;
		int resultado = Factorial.calculo(5);
		assertEquals(valorEsperado, resultado, 0);
	}
	
	@ParameterizedTest
	@CsvSource({"7, 5040", "5, 120"})
	void testCalculo(int number, int valorEsperado) {
		 assertEquals(valorEsperado,Factorial.calculo(number)); 
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"Hola","Mundo"})
	public void mensajeNoNuloTest (String cadena) {  
		assertDoesNotThrow(() -> Factorial.mensajeNoNulo(cadena));
	}

	@ParameterizedTest
	@ValueSource(strings = {"False","Falso"})
	public void comparaTest (String cadena) {  
		assertEquals(false, Factorial.compara(cadena)); 
	}
}
