
public class Driver {
public static void main(String[] args) {
	
	Kisi kisi = new Kisi();
	kisi.setIsim("Tugrul Çalışkan");
	
	System.out.println(kisi.getIsim());
	
	Ogrenci ogrenci = new Ogrenci();
	ogrenci.setIsim("Ali CAN ");
	ogrenci.setDers("Matematik");
	System.out.println(ogrenci.getIsim());
	System.out.println(ogrenci.getDers());
	
	UnivOgrenci univOgrenci = new UnivOgrenci();
	univOgrenci.setIsim("Mehmet Yıldız");
	univOgrenci.setDers("Bilgisayar Temelleri 101");
	univOgrenci.setKapmus("Avcılar"); // çoklu seviye kalıtım vardır burda yani universite ogrencisi ogrenci sınıfından türütor öğrenci sınıfı kişi sınıfından türüyor.
	System.out.println(univOgrenci.getIsim());
	System.out.println(univOgrenci.getDers());
	System.out.println(univOgrenci.getKampus());
	
	
	Ogretmen ogretmen = new Ogretmen();
	ogretmen.setIsim("Ahmet Yılmaz");
	ogretmen.setOkul("X ilk ogretim okulu");
	System.out.println(ogretmen.getIsim());
	System.out.println(ogretmen.getOkul());
	
	
	Doktor doktor = new Doktor();
	doktor.setIsim("Emre AYDIN");
	doktor.setBrans("Beyin Cerrahisi");
	System.out.println(doktor.getIsim());
	System.out.println(doktor.getBrans());
	
	// Bir sınıfın birden fazla sınıfın ata clası olması durumuna hiyerarşik kalıtım denmektedir.
	// çoklu kalıtımda bir sınıf birden fazla sınıfla extends edilebilir.Ancak java da bu karışıklıklara sebebiyet verdiği için  mümkün değildir. c++ gibi dillerde bu mümkündür.
	
	
}
}
