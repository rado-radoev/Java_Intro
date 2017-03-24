import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.zone.ZoneOffsetTransitionRule.TimeDefinition;
import java.util.Scanner;

public class Timer {
	
	private LocalTime startTime;
	private Duration brakeTime;
	private LocalTime leaveTime;
	
	
	public Timer (String startTime, String brakeTime, String leaveTime) {
		setStartTime(startTime);
		setBrakeTime(brakeTime);
		setLeaveTime(leaveTime);
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
			this.leaveTime = this.leaveTime.plusMinutes(this.brakeTime.toMinutes());
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

	
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
	Scanner input = new Scanner(System.in);
	
	System.out.print("What time did you start? (If time is omitted, default start time is 08:00 AM): ");
	String startTimeInput = input.nextLine();
//	LocalTime startTime = LocalTime.parse(startTimeInput);
	
	System.out.print("How long is your brake? (If time is omitted, default time is 30 min): ");
	String brakeTimeInput = input.nextLine();
//	Duration brakeTime = Duration.parse(brakeTimeInput);
	
	System.out.print("What time do you leave? (If time is omitted, default leave time is 04:30 PM): ");
	String leaveTimeInput = input.nextLine();
//	LocalTime leaveTime = LocalTime.parse(leaveTimeInput);
	
	
	Timer t = new Timer(startTimeInput, brakeTimeInput, leaveTimeInput);
	t.countdown();
	
	}
	
		
	public LocalTime calculateWorkTime(LocalTime startTime, LocalTime leaveTime) {
		long hoursDiff =  Duration.between(startTime, leaveTime).toHours();
		LocalTime workHours = LocalTime.from(startTime);
		workHours = workHours.plusHours(hoursDiff);
		
		return workHours;
	}
	
	
	public LocalTime calculateWorkTime(LocalTime startTime, LocalTime leaveTime, Duration brakeTime) {
		LocalTime workHours = calculateWorkTime(startTime, leaveTime);
		workHours.plus(brakeTime);
		
		return workHours;
	}
	
	public LocalTime calculateBrakeTime(LocalTime startTime, LocalTime leaveTime) {
		long hoursDiff =  Duration.between(startTime, leaveTime).toHours();
		long brakeAt = ((hoursDiff / 2) * 3600) + 1800;
		
		LocalTime brake = LocalTime.from(startTime);
		brake = brake.plusSeconds(brakeAt);
		
		return brake;
	}
	
	public void countdown () throws InterruptedException {
		LocalTime brakeTime = calculateBrakeTime(startTime, leaveTime);
		LocalTime currentTime = LocalTime.now();
		long timeLeft = Duration.between(currentTime, leaveTime).toMinutes();
		Thread newThread = new Thread();
		newThread.start();
		
		
		while (currentTime.isAfter(startTime) && currentTime.isBefore(leaveTime)) {
			newThread.sleep(1000);
			long minutes = timeLeft % 60;
			long hours = timeLeft / 60;
			
			System.out.printf("Time left: %d %d%n", hours, minutes);
			currentTime = LocalTime.now();
			timeLeft = Duration.between(currentTime, leaveTime).toMinutes();
			
		}
	}

}
