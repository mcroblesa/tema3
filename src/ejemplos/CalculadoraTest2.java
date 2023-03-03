package ejemplos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


	public class CalculadoraTest2 {
		
		/* SEGUNDA PARTE */
		/* En todos los métodos anteriores repetimos Calculadora calcu= new Calculadora (20,10)
		 * veamos como ejecutar código antes y después: @BeforeEach, @AfterEach, @BeforeAll, @AfterAll
		 * antes o después de cada método, o una sóla vez al principio del lanzamiento general.
		 */
		private Calculadora calcu;

		@BeforeEach
		public void creaCalculadora() {
			calcu = new Calculadora(20, 10);
		}
		
		@AfterEach
		public void borraCalculadora() {
			calcu = null;
		}

		@Test
		public void testSuma() {
			double valorEsperado = 30;		
			double resultado = calcu.suma();
			assertEquals(valorEsperado, resultado, 0);
		}

		@Test
		public void testResta() {
			double valorEsperado = 10;
			double resultado = calcu.resta();
			assertEquals(valorEsperado, resultado, 0);
		}

		@Test
		public void testMultiplica() {
			double valorEsperado = 200;
			double resultado = calcu.multiplica();
			assertEquals(valorEsperado, resultado, 0,
					   "Fallo en la multiplicación: ");
		}

		@Test
		public void testDivide() {
			double valorEsperado = 2;
			double resultado = calcu.divide();
			assertEquals(valorEsperado, resultado, 0);
		}	
		
		@Test
		public void testDivide0() {
			Calculadora calcu = new Calculadora(20, 0);
			Assertions.assertThrows(ArithmeticException.class, () -> {
				calcu.divide0();
			});
		}
		
		@Test
		public void testDivide0_2() {
			Calculadora calcu = new Calculadora(20, 2);
			Assertions.assertThrows(ArithmeticException.class, () -> {
				calcu.divide0();
			});
		}
		
	
}
