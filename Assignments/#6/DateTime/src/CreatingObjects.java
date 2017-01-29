import java.time.*;

import javax.annotation.Generated;
public class CreatingObjects {

	public static void main(String[] args) {
		LocalDateTime timePoint = LocalDateTime.now();
		LocalDate.of(2012, Month.DECEMBER, 12);
		
		
		LocalDate theDate = timePoint.toLocalDate();
		Month month = timePoint.getMonth();
		int year = timePoint.getYear();
		int day = timePoint.getDayOfMonth();
		timePoint.getSecond();
		
		System.out.println(month);
		System.out.println(year);
		
		
		LocalDateTime thePast = timePoint.withDayOfMonth(10).withYear(2010);
		System.out.println(thePast);
		
		Period period = Period.of(3, 2, 1);
		System.out.println(period);
		
		
	}
}
