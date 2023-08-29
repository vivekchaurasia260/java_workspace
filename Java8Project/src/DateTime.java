import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTime {
	public static void main(String[] args) {
		
		System.out.println(java.time.LocalDate.now());
		System.out.println(java.time.LocalTime.now());
		System.out.println(java.time.LocalDateTime.now());
		
		// Java 8 new Joda Date time feature
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
	}
}
