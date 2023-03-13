import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.StyledEditorKit.ForegroundAction;




public class Driver {
	
	// kisi sınıfının içerisindeki değerleri filtrelereyen bir metot yapalım.
	
	public static void cinsiyeteGoreFiltrele(List<Kisi> kisiler ,Kisi.Cinsiyet cinsiyet) {
		for (int i = 0; i < kisiler.size(); i++) {
			Kisi kisi = kisiler.get(i);
			if(kisi.getCinsiyet().equals(cinsiyet)) {
				System.out.println(kisi);
			}
		}
	}

public static void yasaGoreFiltrele(List<Kisi> kisiler,int yas) {
	for (int i = 0; i <kisiler.size(); i++) {
		Kisi kisi = kisiler.get(i);
		if(kisi.getYas()>= yas) {
			System.out.println(kisi);
		}
		
	}
}
public static void yasaAraliginaGoreFiltrele(List<Kisi> kisiler,int min,int max) {
	for (int i = 0; i <kisiler.size(); i++) {
		Kisi kisi = kisiler.get(i);
		if(kisi.getYas() > min && kisi.getYas() <= max) {
			System.out.println(kisi);
		}
		
	}
}
	
public static void kisiFiltresi(List<Kisi> kisiler,KisiFiltresi kisiFiltresi) {
 for (int i=0; i< kisiler.size(); i++) {
	 Kisi kisi = kisiler.get(i);   // koşulu kontrol ettik geriye true dönerse kisi değerini ekrana yazdırdık.
	 if(kisiFiltresi.filtrele(kisi)) {
		 System.out.println(kisi);
	 }
	 
 }
}

	
	public static void main(String[] args) {
		
		Kisi kisi1 = new Kisi("Ali Can", LocalDate.parse("1990-03-23"), "ali.can@example.com", Kisi.Cinsiyet.ERKEK);
		Kisi kisi2= new Kisi("Seyhan Çalışkan", LocalDate.parse("1998-01-02"), "seyhan.caliskan@example.com", Kisi.Cinsiyet.KADIN);
		Kisi kisi3 = new Kisi("Tuğrul Yılmaz", LocalDate.parse("2013-07-04"), "tugrul.yilmaz@example.com", Kisi.Cinsiyet.ERKEK);
		
	/*	System.out.println(kisi1);
		System.out.println(kisi2);
		System.out.println(kisi3);
*/
		ArrayList<Kisi> kisiler = new ArrayList<>();
	 kisiler.add(kisi1);
	 kisiler.add(kisi2);
	 kisiler.add(kisi3);
	//	cinsiyeteGoreFiltrele(kisiler, Kisi.Cinsiyet.ERKEK);
	
	// yasaGoreFiltrele(kisiler, 5);
	// yasaAraliginaGoreFiltrele(kisiler, 10, 25);
	
	 /*kisiFiltresi (kisiler,new KisiFiltresi() {
		 @Override 
		 public boolean filtrele(Kisi kisi ) {
			 return kisi.getYas() > 5 && kisi.getCinsiyet().equals(Kisi.Cinsiyet.ERKEK); 
		 }});*/
	 kisiFiltresi(kisiler,(k) -> k.getYas() >=15 && k.getCinsiyet().equals(Kisi.Cinsiyet.KADIN)); // yaşı 15ten büyük olan ve cinsiyeti kadın olanlar getirir.
	  //anonymus class kullanamadık bunun yerine lambda  ile  tek metotta hepsini filtreleyebilriiz.
	// farklı metotlar yapmak yerine kisiFiltesi diye bir metot yaptık o metot bizden kisiFiltesi tipinde bir interface alıyor . KisiFiltresinin içerisinde ise tek bir tane metot var 
	 
	}

}
