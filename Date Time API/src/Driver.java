import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		  // localDate tarihi içerisinde gün ay ve yıl olarak ISO formatında tutar .
		/*LocalDate localDate = LocalDate.now();  // bugünün tarihini bize verir .
	    System.out.println(localDate);
	    
	   LocalDate of= LocalDate.of(1990, 6,22);  // girdiğimiz tarihi bize döndürür.
	System.out.println(of);
	
	LocalDate localDate2 = LocalDate.parse("2020-01-17");
	System.out.println(localDate2);
	
	System.out.println(localDate.plus(1, ChronoUnit.DAYS)); // Bugünün tarihini 1 arttırarak yarının tarihini verir.
	System.out.println(localDate.plusDays(2));
	
	System.out.println(localDate.minus(1,ChronoUnit.MONTHS)); // bir önceki ay'ı ekrana getirdi
	
	      LocalDate localDate3  = LocalDate.parse("2020-11-22");
	System.out.println(localDate3.getDayOfWeek());   // verdiğimiz tarihin hangi gün olduğunu ekrana bastırıdk .
	
	int dayOfMonth = localDate3.getDayOfMonth();
	System.out.println(dayOfMonth);  // ayın kaçıncı günü olduğunu bize söyler.
	
	LocalDate birinciTarih = LocalDate.parse("2020-01-22");
	LocalDate ikinciTarih= LocalDate.parse("2020-01-25");
	System.out.println(birinciTarih.isAfter(ikinciTarih));  // burda soru şu birinci tarih ikinci tarihten sonra 'mı  bizim işlemimizde false oalrak dönücektir.
	System.out.println(birinciTarih.isBefore(ikinciTarih));*/ // true döner
	
		
		// kullanıcının yaşını hesaplayan bir rog yazalım .
		Scanner scanner = new Scanner(System.in);
		System.out.println("Doğum Tarihi :");
	  String line =scanner.nextLine();
	  LocalDate dogumTarihi = LocalDate.parse(line);
	  System.out.println("Doğum Tarihiniz : " +dogumTarihi);
	  System.out.println("Yaşınız : " +(LocalDate.now().getYear() - dogumTarihi.getYear()));
	}

}
