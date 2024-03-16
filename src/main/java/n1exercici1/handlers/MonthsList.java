package n1exercici1.handlers;

import java.util.ArrayList;
import java.util.List;

public class MonthsList {
	 
	
	private List<String> afegirMonths() {
		
		List<String> months = new ArrayList<>();
		
		months.add("January");
		months.add("February");
		months.add("March");
		months.add("April");
		months.add("May");
		months.add("June");
		months.add("July");
		months.add("August");
		months.add("September");
		months.add("October");
		months.add("November");
		months.add("December");
		
		return months;
	}
	
	public List<String> retornarLlistaMonths() {
		
		List<String> months = afegirMonths();
		return months;
	}
	
}
