import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Timer {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("What time did you start? (If time is omitted, default start time is 08:00 AM): ");
	String startTimeInput = input.nextLine();
	
	System.out.print("How long is your brake? (If time is omitted, default time is 30 min): ");
	String brakeTimeInput = input.nextLine();
	
	System.out.print("What time do you leave? (If time is omitted, default leave time is 04:30 PM): ");
	String leaveTimeInput = input.nextLine();
	
	LocalDate today = LocalDate.now();
	LocalTime startTime;
	
	if (startTimeInput.equals("")) {
		startTime = LocalTime.of(8, 0);
	}
	else {
		startTime = LocalTime.parse(startTimeInput);
	}

	Duration brakeTime;
	if (brakeTimeInput.equals("")) {
		brakeTime = Duration.ofMinutes(30);
	}
	else {
		brakeTime = Duration.parse(brakeTimeInput);
	}
	
	
	LocalTime leaveTime;
	if (leaveTimeInput.equals("")) {
		leaveTime = LocalTime.of(16, 30);
	}
	else {
		leaveTime = LocalTime.parse(leaveTimeInput);
	}
	
	
	
	calculateTime(startTime, leaveTime, brakeTime);
	
	
	
	
	}
	
	
	public static void calculateTime (LocalTime startTime, LocalTime leaveTime, Duration brakeTime) {
		
	}

}



/*
1. What time did you start?
If no time is entered -> 08:00:00
2. How long is your lunch break (in minutes)
if no time is entered assume -> 30 minutes
3. What time do you want to leave?
if no time is entered -> Calculate when you are leaving by adding 8 hours + the break to the start time
else if time is entered calculate when you are leaving by taking out the leaving time from the start time + break

split the work time to 2 - break is from the middle + 30 minutes.

every 20 minutes from start time make command prompt blink take your eyes of the monitor for 20 seconds
every 1 hour rotate your eyes.
*/