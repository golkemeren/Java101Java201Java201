import java.util.Scanner;

public class Driver { 
	// metotları geriye değer döndüren ve döndürmeyen olarak ikiye ayırabiliriz.
// İlk örneğimizde geriye değer döndürmeyen metoda örnek verelim .

	
public static void merhaba() {// void geriye değer döndürmeyeceğini bize söyler.
		
		System.out.println("Merhaba");
	} 
 public int topla (int x, int y) {
	 int toplam = x+y;
	 return toplam; // return değeri int olduğundan int değerini public int diyerek belirtmeliyizz
	 
 }
	public static void main(String[] args) {
	/*Driver driver = new Driver();
	driver.merhaba(); */ // eğer merhaba(); şeklinde çağırmak istersek metodu statik olarak işaretlememiz gerkir örneğin public static void main gibi 
	// merhaba();
		 /*Driver driver=new Driver();
		 Scanner scanner = new Scanner(System.in);
		 int x = scanner.nextInt();
		 int y = scanner.nextInt();

		
		int sonuc=driver.topla(x, y); // topla metoduna verdiğimiz parametreler direkt olarak verilmek zorunda değildir.
		System.out.println(sonuc);
		*/
		HesapMakinasi hesapMakinasi = new HesapMakinasi();
		float toplama = hesapMakinasi.topla(4.0f, 6.0f);
		System.out.println(toplama);
		System.out.println(hesapMakinasi.cikar(7.0f, 2.0f));
		System.out.println(hesapMakinasi.carp(5.0f, 7.0f));
		System.out.println(hesapMakinasi.bol(9.0f, 2.0f));
		System.out.println(hesapMakinasi.kare(4));
		System.out.println(hesapMakinasi.karekok(9));
}
}
