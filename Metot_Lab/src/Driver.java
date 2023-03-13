
public class Driver {
public static void main(String[] args) {
	
	Ogrenci ogrenci = new Ogrenci (); 
		
		ogrenci.isim = "Tugrul";
		ogrenci.yas = 8;
		Driver driver = new Driver();
		driver.ogrenciBilgileri(ogrenci);
		System.out.println(ogrenci.isim);
		System.out.println(ogrenci.yas);
	}


	public void ogrenciBilgileri(final Ogrenci ogrenci) {
		ogrenci.isim="ERTUĞ";
	System.out.println(ogrenci.isim);
	System.out.println(ogrenci.yas);
	
}
}
