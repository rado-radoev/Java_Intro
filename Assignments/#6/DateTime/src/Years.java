import java.time.*;
public class Years {

	public static void main(String[] args) {
		// Get the current date time period
		LocalDateTime timePoint = LocalDateTime.now();
		int birthYear = 1985;
		
		// Get current year
		int currentYear =  timePoint.getYear();
		
		// Iterate though years from birth years to current year.
		// And output to screen. Each year on new line.
		for (int i = birthYear; i <= currentYear; i++) {
			System.out.println(i);
		}		
	}
}
