import java.time.DayOfWeek;
import java.time.Month;
import java.util.Iterator;

public class Driver {
public static void main(String[] args) {
	Aylar ay = Aylar.OCAK;
	System.out.println(ay);
	ay = Aylar.EKİM;
	System.out.println(ay);
	
	Aylar [] values= Aylar.values(); // values metodu enums içinde tanımladığımız tüm değerleri bir dizi olarak bize geri dönderir 
	
	for (int i =0; i<values.length; i++) {
		System.out.println(values[i]); // konsola tanımladığımız bütün değerleri basar 
		
	}
	  Aylar valueOf = Aylar.valueOf("SUBAT"); // enumerations i.inden istediğimiz değeri çekmek istiyorsak valueOf metodunu kullanmalıyız

System.out.println(valueOf);

//jdk içinde bize hazır olarak gelen elemanlarda vardır mesela haftanın günleri 
DayOfWeek sunday = DayOfWeek.SUNDAY;
System.out.println(sunday);

DayOfWeek of = DayOfWeek.of(3);  // eğer enum ın belli bir indeksindeki metodu almak istiyorsak DayOfWeek metodunu kullanmalıyız .
// DayOfWeek sol tıklayıp open declaratıon dedikten sonra 3. indeksin ne olduğunu görebiliriz.
System.out.println(of);
Month february = Month.FEBRUARY;
System.out.println(february);


}
}
