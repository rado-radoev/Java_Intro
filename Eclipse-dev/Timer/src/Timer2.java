import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Timer2 {
	
	private static String start;
	private static String end;
	private static String brake;
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
	
	private static LocalTime checkEndTime(String end) {
		LocalTime time;
		if (end.equals("")) {
			time = startTime.plusHours(8);
		}
		else {
			time = LocalTime.parse(end);	
		}
		return time;
	}

	private static LocalTime checkStartTime(String start) {
		LocalTime time;
		if (start.equals("")) {
			time = LocalTime.parse("08:00");
		}
		else {
			time = LocalTime.parse(start);
		}
		return time;
	}
	
	private static Duration checkBrakeTime(String brake) {
		long brakeLong;
		try {
			brakeLong = Long.parseLong(brake);
		} catch (Exception e) {
			brakeLong = 30;
		}
		
		return Duration.ofMinutes(brakeLong);
	}
	
	public static void main(String[] args) throws InterruptedException {
		// Create input stream
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter start time: ");
		start = input.nextLine();
		
		System.out.print("Enter brake duration (in minutes): ");
		brake = input.nextLine();
		
		System.out.print("Enter end time: ");
		end = input.nextLine();
		
		
		brakeDuration = checkBrakeTime(brake);
		startTime = checkStartTime(start);
		endTime = checkEndTime(end);	

		
		input.close();
		
		calculateEndTime(startTime, brakeDuration);
		
		while (true) {
			calculateWorkTime(endTime);
			Thread.sleep(1000);
		}
		
	}
}
