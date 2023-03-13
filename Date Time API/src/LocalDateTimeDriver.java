import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeDriver {

	public static void main(String[] args) {
 // LocalDateTime içerisinde hem tarih hemde zaman nesnesini tutucak
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
  
         LocalDateTime localDateTime =  LocalDateTime.of(2020,10,5, 14, 37); // tek seferde tarih ve ay girebiliriz.
          System.out.println(localDateTime);
		
          LocalDateTime localDateTime2 = localDateTime.plus(4, ChronoUnit.DAYS);  // ayın 5 ine 4 gümn ekledik 
          System.out.println(localDateTime2);
          
          LocalDate localDate = LocalDate.parse("2020-01-12");
          LocalDateTime birinci = LocalDateTime.of(localDate, LocalTime.parse("04:12"));
          LocalDateTime ikinci = LocalDateTime.of(localDate, LocalTime.parse("09:00"));
           System.out.println(birinci.isAfter(ikinci));
           System.out.println(birinci.isBefore(ikinci));
           System.out.println(ChronoUnit.MINUTES.between(birinci,ikinci));  // 2020-01-12  saaat 04:12 ile saat 09:00 arasında kaç dakika var onu bulduk 
	}

}
