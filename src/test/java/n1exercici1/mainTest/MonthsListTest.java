package n1exercici1.mainTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.util.List;
import org.junit.jupiter.api.Test;
import n1exercici1.handlers.MonthsList;

public class MonthsListTest {
	
	MonthsList demo = new MonthsList();
	
	@Test
	void recorrerLlistaTest1() {
		
		List<String> months = demo.retornarLlistaMonths();
		assertNotNull(months);
	}
	
	@Test
	void recorrerLlistaTest2() {
		
		List<String> months = demo.retornarLlistaMonths();
		assertEquals(12, months.size());	
	}
	
	@Test
	void recorrerLlistaTest3() {
		
		List<String> months = demo.retornarLlistaMonths();
		assertEquals("August", months.get(7));
	}	
}
