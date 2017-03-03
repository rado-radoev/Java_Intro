import java.time.*;

public class Gigasecond {
	
	LocalDateTime gigasecond;
	LocalDate ld;
	
	public Gigasecond(LocalDateTime gigasecond) {
		this.gigasecond = gigasecond;
	}
	
	public Gigasecond(LocalDate ld) {
		this.ld = ld;
	}

	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		//long gigasecond = 10 ^ 9;
		
		Gigasecond gigasecond = new Gigasecond(LocalDate.of(2015, Month.JANUARY, 24));
		System.out.println(gigasecond.ld);
	}

}
