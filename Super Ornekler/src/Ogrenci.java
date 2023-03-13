
public class Ogrenci extends Kisi{
	
	private int numara;
	
	public Ogrenci (String i, int n) { // parametre olarak alınan i y i baseclassa yani super e gönderebilmek için super anahtar kelimesini kullanıyoruz.
		super(i); // ogrenci kisi sınıfındaki constructoru yani i değerini çağırmış bulunuyor.
	// Ogrenci sınıfı kisi sınıfının kendi metodunu muhakkak ilk satırda çağırmalıdır yani super i constructor un ilk satırında kullanılmalıdır.
		
		numara=n;
	
	}
	public int getNumara() {
		return numara;
	}

	public  void setNumara(int n) {
		numara=n;
	}
	public void ozet() {
	
	System.out.println("Ogrenci Numara  :  "  + numara);
	super.bilgileriYazdir();   // once ogrenci sınıfının numara degerini yazdırıcak
	// sonra super in bilgileri yazdır metodunu yazdırcak burda super Kisi sınıfı olucaktır.
	}
}
