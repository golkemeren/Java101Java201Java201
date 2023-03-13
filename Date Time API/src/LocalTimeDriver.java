import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeDriver {
 public static void main(String[] args) {
	LocalTime time = LocalTime.now();
	System.out.println(time);
	
	LocalTime localTime = LocalTime.parse("21:30");  // saati ekrana getirir.
	System.out.println(localTime);
	
	LocalTime localTime2 = LocalTime.of(14,30);
	System.out.println(localTime2);  // yeni bir saat ekledik 

    LocalTime localTime3 = LocalTime.parse("21:30").plus(1,ChronoUnit.HOURS);
    System.out.println(localTime3);     // belirtmiş odluğumuz saatin 1 saat üzerine koyarak bize geri getirdi
     
     System.out.println(localTime3.getHour());  // istediğimiz bir lcoal time dan değerleri alabiliriz. saat
     System.out.println(localTime3.getMinute());  // dakika 
    LocalTime birinci = localTime.parse("14:00");
    LocalTime ikinci = LocalTime.parse("16:00");
    System.out.println(birinci.isAfter(ikinci));  // birinci ikinciden buyuk mu false 
    System.out.println( birinci.isBefore(ikinci));  // true
 } 
}
