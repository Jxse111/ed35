package org;
import static org.junit.jupiter.api.Assertions.*;
import org.iesalandalus.Subscripcion;
import org.junit.jupiter.api.Test;

class SubscripcionTest {

	@Test
	public void testprecioPorMes() {
		double esperado = 100;
		Subscripcion s = new Subscripcion(200, 2);
		double resultado = s.precioPorMes();
		assertEquals(esperado, resultado, 0);
	}

	@Test
	public void testprecioPorMes2() {
		double esperado = 67;
		Subscripcion s = new Subscripcion(200, 3);
		double resultado = s.precioPorMes();
		assertEquals(esperado, resultado, 0);
	}

	@Test
	public void testprecio0() {
		double esperado = 0;
		Subscripcion s = new Subscripcion(0, 3);
		double resultado = s.precioPorMes();
		s.cancel();
		assertEquals(esperado, resultado, 0);
	}

	@Test
	public void testperiodo0() {
		double esperado = 0;
		Subscripcion s = new Subscripcion(3, 0);
		double resultado = s.precioPorMes();
		s.cancel();
		assertEquals(esperado, resultado, 0);
	}
}
