
public class Bisiklet {

	int vites ;  // sınıf içerisinde tanımladığımız değişkenlere o sınıfın üye değişkenleri diyoruz.
	int hiz ; // Bu değişkenlere erişmek için önce bisiklet sınıfından bir ınstance almak sonrasında da nokta "." operatörüyle sınıf içerisindeki değişkenlere değer atamak gerekir.
	
	// ancak bazı durumlarda her yeni bir ınstance için yeni bir üye değişken oluşturulması yerine sadece tek bir üye değişken oluşturup bütün ınstancelerin bunun üzerinden  işlem yapması istenebilir. Bunun örneğini aşağıda verelim  
	
	 static int bisikletSayisi = 0; // değişkenin başına static koyarsak her yeni instance alındığında bu değişkenden ayrı ayrı oluşturullmayacaktır. Bisiklet sınıfının tamamı için tek bir değişken oluşturup bütün nesneler bu değişken üzerinde işlem yapabileceklerdir. 
	
	void bilgileriYazdir () {
		
	System.out.println(vites);
	System.out.println(hiz);  // sınıf değişkenlerine erişmek için anahtar kelimeye ihtiyaç yoktur, sınıf değişkeninin adını direkt yazabiliriz	
	
	System.out.println(Bisiklet.bisikletSayisi);
	}
}
