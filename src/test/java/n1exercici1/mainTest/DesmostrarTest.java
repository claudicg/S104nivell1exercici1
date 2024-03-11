package n1exercici1.mainTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;

import n1exercici1.handlers.Demostrar;

public class DesmostrarTest {
	
	
	@Test
	void recorrerLlistaTest() {
		
		Demostrar demo = new Demostrar();
		List<String> months = demo.afegirMonths();
		
		assertNotNull(months);
		assertEquals(12, months.size());
		assertEquals("August", months.get(7));
	}
	
	
	
}
