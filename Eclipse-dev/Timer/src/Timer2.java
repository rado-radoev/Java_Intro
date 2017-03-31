import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Timer2 {
	
	private static String start;
	private static String end;
	private static long brake;
	private static LocalTime startTime;
	private static LocalTime endTime;
	private static Duration brakeDuration;
	
	
	
	private static void calculateWorkTime(LocalTime endTime) {
		long millis = ChronoUnit.MILLIS.between(LocalTime.now(), endTime);
		
//		long second = (millis / 1000) % 60;
//		long minute = (millis / (1000 * 60)) % 60;
//		long hour = (millis / (1000 * 60 * 60)) % 24;
		
		System.out.printf("%02d:%02d:%02d%n", (millis / (1000 * 60 * 60)) % 24,
				(millis / (1000 * 60)) % 60,
				(millis / 1000) % 60);
	}
	
	private static void calculateEndTime(LocalTime startTime, Duration brakeDuration) {
		endTime = endTime.plus(brakeDuration);
		
	}

	public static void main(String[] args) throws InterruptedException {
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter start time: ");
		start = input.nextLine();
		
		System.out.print("Enter brake duration (in minutes): ");
		brake = input.nextLong();
		
		System.out.print("Enter end time: ");
		end = input.nextLine();
		
		if (end.equals("")) {
			endTime = startTime.plusHours(8);
		}
		else {
			endTime = LocalTime.parse(end);	
		}
		
		startTime = LocalTime.parse(start);
		brakeDuration = Duration.ofMinutes(brake);
		input.close();
		
		calculateEndTime(startTime, brakeDuration);
		
		while (true) {
			calculateWorkTime(endTime);
			Thread.sleep(1000);
		}
		
	}
	
	
	

}
