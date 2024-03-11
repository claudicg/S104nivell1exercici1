package n1exercici1.handlers;

import java.util.ArrayList;
import java.util.List;

public class Demostrar {
	 
	
	public List<String> afegirMonths() {
		
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
	
	public void demostrarInsercionMeses() {
		
		List<String> months = afegirMonths();
		escriureMonths(months);
	}
	
	private void escriureMonths(List<String> months) {
		
		for(String month : months) {
			System.out.print(month + " ");
		}
	}
	
}
