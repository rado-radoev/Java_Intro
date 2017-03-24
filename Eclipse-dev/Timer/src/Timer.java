import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.Scanner;

public class Timer {
	
	private LocalTime startTime;
	private Duration brakeTime;
	private LocalTime leaveTime;
	
	
	public Timer (String startTime, String leaveTime, String brakeTime) {
		setStartTime(startTime);
		setLeaveTime(leaveTime);
		setBrakeTime(brakeTime);
	}
	
	
	public LocalTime getStartTime() {
		return this.startTime;
	}
	
	
	public void setStartTime(String startTime) {
		if (startTime.equals("")) {
			this.startTime = LocalTime.of(8, 0);
		}
		else {
			this.startTime = LocalTime.parse(startTime);
		}
	}
	
	
	public LocalTime getLeaveTime() {
		return this.leaveTime;
	}
	
	
	public void setLeaveTime(String leaveTime) {
		if (leaveTime.equals("")) {
			this.leaveTime = startTime.plusHours(8);
			this.leaveTime = this.leaveTime.plusMinutes(brakeTime.toMinutes());
		}
		else {
			this.leaveTime = LocalTime.parse(leaveTime);
		}	
	}
	
	
	public Duration brakeTime() {
		return this.brakeTime;
	}
	
	
	public void setBrakeTime(String brakeTime) {
		if (brakeTime.equals("")) {
			this.brakeTime = Duration.ofMinutes(30);
		}
		else {
			this.brakeTime = Duration.parse(brakeTime);
		}
	}

	
	
	
	
	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("What time did you start? (If time is omitted, default start time is 08:00 AM): ");
	String startTimeInput = input.nextLine();
	
	System.out.print("How long is your brake? (If time is omitted, default time is 30 min): ");
	String brakeTimeInput = input.nextLine();
	
	System.out.print("What time do you leave? (If time is omitted, default leave time is 04:30 PM): ");
	String leaveTimeInput = input.nextLine();

	
	
	Timer t = new Timer(startTimeInput,leaveTimeInput,brakeTimeInput);
	}
	
		
	public static LocalTime calculateWorkTime(LocalTime startTime, LocalTime leaveTime) {
		long hoursDiff =  Duration.between(startTime, leaveTime).toHours();
		LocalTime workHours = LocalTime.from(startTime);
		workHours = workHours.plusHours(hoursDiff);
		
		return workHours;
	}
	
	
	public static LocalTime calculateWorkTime(LocalTime startTime, LocalTime leaveTime, Duration brakeTime) {
		LocalTime workHours = calculateWorkTime(startTime, leaveTime);
		workHours.plus(brakeTime);
		
		return workHours;
	}
	
	public static LocalTime calculateBrakeTime(LocalTime startTime, LocalTime leaveTime) {
		long hoursDiff =  Duration.between(startTime, leaveTime).toHours();
		long brakeAt = ((hoursDiff / 2) * 3600) + 1800;
		
		LocalTime brake = LocalTime.from(startTime);
		brake = brake.plusSeconds(brakeAt);
		
		return brake;
	}
	
	public static void countdown (LocalTime startTime, LocalTime leaveTime) throws InterruptedException {
		LocalTime brakeTime = calculateBrakeTime(startTime, leaveTime);
		LocalTime currentTime = LocalTime.now();
		Duration timeLeft = Duration.between(startTime, leaveTime);
		Thread newThread = new Thread();
		newThread.start();
		
		
		while (currentTime.isAfter(startTime) && currentTime.isBefore(leaveTime)) {
			newThread.sleep(1000);
			System.out.println(timeLeft);
			
		}
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

calculate when the brake is:
	get start time , get end time and find the middle
	middle + 30 mint = start brake
	
Start a thread
	counter == startTime
	while startTime <= leavTime
		Print time le









*/