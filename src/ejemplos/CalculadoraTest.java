package ejemplos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {

	/*
	 * PASO 1: HACEMOS LOS TEST PARA SUMA, RESTA, MULTIPLICACIÓN, DIVISION
	 * 
	 * @Test public void testSuma() { double valorEsperado = 30; Calculadora calcu =
	 * new Calculadora(20, 10); double resultado = calcu.suma();
	 * assertEquals(valorEsperado, resultado, 0); }
	 * 
	 * @Test public void testResta() { double valorEsperado = 10; Calculadora calcu
	 * = new Calculadora(20, 10); double resultado = calcu.resta();
	 * assertEquals(valorEsperado, resultado, 0); }
	 * 
	 * @Test public void testMultiplica() { double valorEsperado = 200; Calculadora
	 * calcu = new Calculadora(20, 10); double resultado = calcu.multiplica();
	 * assertEquals(valorEsperado, resultado, 0); }
	 * 
	 * @Test public void testDivide() { double valorEsperado = 2; Calculadora calcu
	 * = new Calculadora(20, 10); double resultado = calcu.divide();
	 * assertEquals(valorEsperado, resultado, 0); } PASO 2: HACEMOS UN TEST QUE
	 * FALLE EN LA MULTIPLICACION
	 * 
	 * @Test public void testMultiplica() { double valorEsperado = 200; Calculadora
	 * calcu = new Calculadora(20, 50); double resultado = calcu.multiplica();
	 * assertEquals(valorEsperado, resultado, 0, "Fallo en la multiplicación: "); }
	 * 
	 * PASO 3: HACEMOS UN TEST QUE FALLE EN LA DIVISION NORMAL, AL DIVIDIR POR CERO
	 * 
	 * @Test public void testDivide() { double valorEsperado = 2; Calculadora calcu
	 * = new Calculadora(20, 0); double resultado = calcu.divide();
	 * assertEquals(valorEsperado, resultado, 0); }
	 * 
	 * 
	 * PASO 4: HACEMOS UN TESTEXCEPTION PARA EL CASO ANTERIOR, A PARTIR DEL ERROR
	 * DEL CASO ANTERIOR.
	 * 
	 * @Test public void testExcepcion() { try { Calculadora calcu = new
	 * Calculadora(20, 0); double resultado = calcu.divide();
	 * fail("FALLO, Deberia haber lanzado la excepción"); } catch
	 * (ArithmeticException e) { // PRUEBA satisfactoria } }
	 * 
	 * 
	 * PASO 6: se usa assertThrows para probar casos de excepción.
	 * 
	 * @Test public void testDivide0() { Calculadora calcu = new Calculadora(20, 0);
	 * Assertions.assertThrows(ArithmeticException.class, () -> { calcu.divide0();
	 * }); }
	 * 
	 * 
	 * PASO 7: otra forma de hacer lo anterior, pero usando assertEquals:
	 * 
	 * @Test public void testDivide0() { Calculadora calcu = new Calculadora(20, 0);
	 * Exception exception = assertThrows(ArithmeticException.class, () ->
	 * calcu.divide0()); assertEquals("División por 0", exception.getMessage()); }
	 * 
	 * PASO 8: se harían los test para factorial
	 * 
	 * 
	 * cobertura Verde: se ejecutó totalmente Amarillo: se ejecutó parcialmente
	 * Rojo: No se ejecutó Se revisa sobre la clase, no sobre el test
	 * 
	 * 
	 */
}
