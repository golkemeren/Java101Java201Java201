
public class Ogrenci {

	
	public int numara;
	public String ad;
	public String soyad;
	private int yas ;
	
	
	public void setYas(int y) {
		if(y>0) {
			yas=y;
		}else {
			System.out.println("Yaş değeri 0 dan küçük olamaz");
		}
		
	}
	
	public void bilgileriYazdir() {
		System.out.println("Numara: " + numara);
		System.out.println("Ad: " + ad);
		System.out.println("Soyad: " + soyad);
		System.out.println("Yaş: " + yas);
	}
	
	
	
	/*private void numarayiYazdir() { // bu metoda sınıf dışından erişim private olduğu için izin verilemez oldu 
		System.out.println(numara);
	}*/
}
// bir değişken veya metot belirlerken başında herhangi bir erişim belirleyicisi kullanmazsak varsayılan olarak bu değişken veya metod default olarak tanımlanır
// default değişken veya metodlara aynı paket içerisinde bulunan sınıflar tarafından erişilebilir.
// package isimleri geleneksel olarak uygulamamızın geliştirildiği şirketin web adresinin tersi olarak yazılır.Biz örneğimizde com.example paket ismini kullanalım.Normalde şirketimizin adı example.com olsun
// package oluşturuduğumuzda aslına iş için 2 adet klasör oluşturmuş olduk.Bu klasörlerin içine properties diyerek resource dediğimizde bu klasörün içine bizi windovs explorer götürür.
//Paketlerin asıl amacı aynı isimli birden fazla sınıfı birbiriyle karıştırmamaktır.
