
public class Kare extends Sekil {  // extends anahtar kelimesi ile kare sınıfının sekil sınıfından türeyeceğini belirtiyoruz.
// bu şu anlama geliyor sekil sınıfının içerisindeki public değişkenler ve public metotlar kare sınıfının içerisine otomatik olarak eklenir , private değişkenlere direkt erişim olmaz .
// yani Sekil ana class Kare alt class olarak nitelendirilidi .
	// Kare sınıfı içerisinde kare ye özgü değişkenler tanımlanacaktır.
	private int kenarUzunluğu;
	public int getKenarUzunlugu() {
		return kenarUzunluğu;
	}
	public void setKenarUzunlugu (int uzunluk) {
		kenarUzunluğu=uzunluk;
	}
	public void alanHesapla() {
		System.out.println("Alan:  " + (kenarUzunluğu * kenarUzunluğu));
	}
	
	
}
