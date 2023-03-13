
public class Driver {
public static void main(String[] args) {
	Bisiklet bisiklet = new Bisiklet();
	bisiklet.hiz=10;
	bisiklet.vites = 18;  // sınıf içerisinde tanımlanan değişkenlere sınıf içerisindeki metotlar erişebilir.
	Bisiklet.bisikletSayisi=1;  // Static metodu çağırmak için sınıf adını büyük bir şekilde yazmalıyız.
	bisiklet.bilgileriYazdir();
	
	System.out.println("-------------");
	 // Her yeni ınstance için o ınstance içindeki sınıf değişkenleri farklı farklı oluşturulmaktadır.
	Bisiklet bisiklet2 = new Bisiklet();

bisiklet2.hiz = 20;
bisiklet2.vites =12;
Bisiklet.bisikletSayisi=2;
bisiklet2.bilgileriYazdir();

	
	
	/*System.out.println(bisiklet.hiz);
	System.out.println(bisiklet.vites);*/
	
}
}
