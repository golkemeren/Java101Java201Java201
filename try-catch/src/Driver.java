import java.util.Scanner;
import java.util.InputMismatchException;


public class Driver {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in); //  scanner sınıfınını import ettiğimizde aslında sistemden bir kaynak almış oluyoruz
	//ve işimiz bittiğinde bu kaynağı ssisteme geri iade etmemiz lazım finally bloğu içerisinde sistemden aldığımız kaynakları geriye iade etmeliyiz.
	// try bloğunu ne kadar kısa tutatsak yazdığımız uygulamanın performansı o kadar iyi olur. 
	//Oyüzden scanner sınıfının tanımını try içerisinde yapmadık. Çünki Scanner sınıfının tanımlanması esnasında bir hata ile karşılaşılmaz.
	// ancak kullanıcıdan değer alma ve aldığımız değerleri bölme işlemini try içerisinde gerçekleştiricez.
	try { // uygulamanın hata ile karşılaşabilicek yerlerini try içerisinde yazıcaz
		System.out.print("1. Sayıyı giriniz:  ");
		int x = scanner.nextInt();
		System.out.println("2. Sayıyı giriniz : ");
		int y = scanner.nextInt();
		int sonuc = x/y;
		System.out.println("Sonuç " + sonuc );  // eğer bu bloklar içerisinde bir hata ile karşılaşılırsa  
		//'catch bloğu içerisinde kulanıcıya' bir hata ile karşılaşıldı mesajını verelim 
		
	}catch(ArithmeticException exception) {
		System.out.println(exception.getLocalizedMessage());  // exception sınıfları içerisinde bazı kullanışlı metodlar bulundurmaktadır. Bunlardan ilki getLocalizedMessage();metodu alınan hatanın uygulamanın çalıştığı sisteminin dilinde geri vermektedir. 
		System.out.println(exception.getMessage()); // getMessage metodu exception içerisindeki mesajı  ingilizce olarak bize gösterir.
		exception.printStackTrace(); // uygulamada hata ile çağırılan metod çağırımlarını bize bildirir. Hngi satıda orduğunu bize bildiri.
		// bizim buradaki exception sınıfı diğer sınıfların yani aritmatichexception ve ınputype isimli sınıfların türediği baseclass'dır.
		// bunun için AritchmeticException olduğunda kod ilk catch bloğuna düşsün harf değeri girdiğimizde kod 2. kod bloğuna düşsün istiyoruz
		// bu sebeple 2. bir catch bloğu girmeliyiz.
		// oluşabilecek birden fazla hatayı farklı catch blokları içerisinde handle etmiş olucaz
		System.out.println("0 'a bölünemez ");
	}catch (InputMismatchException exception)  {
		
		System.out.println("Lütfen bir sayı giriniz");
	} finally {
		scanner.close(); // bu metod ile sistemden aldığımız kaynağı sisteme geri iade ediyoruz.
	
		System.out.println("Finally");
		// finally bloğu içerisinde aslında temizlik işlemleri yapmış oluyoruz.try içerisindeki kod bloğu hata olsada olmasada muhakkak finally bloğunu çalıştırıacaktır.
	}
	System.out.println("Uygulama Kapandı");
}
}
