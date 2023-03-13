
import com.example.Araba;

public class Driver {
public static void main(String[] args) {
	
	
	/*Ogrenci ogrenci = new Ogrenci();
	/*ogrenci.ad="Göktüğ";
	ogrenci.soyad="Çalışkan";
	ogrenci.numara=1;*/
	// eğer ogrenci sınıfı içerisindeki bu değişkenlere dışarıdan nokt aile erişmek istersek başına privet anahtar kelimesini koyuyoruz.
// bir değişken privet olarak işaretlendiğinde o değişkene sınıfın dışından erişim engellenmiş olur .
//ogrenci.numarayiYazdir();
	// Eeğer araba sınıfından bir ınstance almak istersen sınıfının bulunduğu paket adını tam olarak yazmamız gerekir.
	/*Araba araba = new Araba();  // bu tür bir kullanım her araba ınstancesi alındığında tekrar etmektedir .Aama bunu kısa hale getirmek için ısnıfın başında import.com.example.Araba; yazarak tekrar tekrar package adını yazmamıza gerek kalama.
araba.marka="Marka"; */ // marka default olduğundan altı çizili olru 

	Ogrenci ogrenci = new Ogrenci();
	ogrenci.numara = 1;
	ogrenci.ad="Ali";
	ogrenci.soyad="CAN";
	ogrenci.setYas(12);
	ogrenci.bilgileriYazdir();
// Sınıfın üye değişkenlerini public olarak atadığımızda bu üye değişkenler üzerinde hiçbir kontrolumuz olmamaktadır.Yani burda yas değeri eksi olamayacağının gerçek dunyada biz farkındayız fakat public olarak atanırsa bu - değer oalrak da atanabilir.
// bizim dikkate alacağımız kullanım şekli şu şekilde olmalıdır:Sınıf içindeki değişkenleri privet yapın bu değişkenlere ulaşmak için public metotlar kullanın . private metoda yaş değeri atayamayacağımızdan yeni bir metot tanımlayarak bu probleminde önüne geçenilririz.
}
}
