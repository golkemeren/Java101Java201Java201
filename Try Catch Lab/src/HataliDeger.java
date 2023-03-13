
public class HataliDeger extends Exception { // bu sınıfın amacı runtime da yani çalışma zamanında kullanıcıdan aldığımız değerleri 
	// işci sınıfına atarken eğer beklentimiz dışında bir değer gelirse bunu hata olarak fırlatmaktır.
// runtimeexcepitpon sınıfından türemesinin amacı burda fırlatılan mesajın try-catch içerisine yazılmasına gerek kalmayacaktır.

public HataliDeger(String degiskenAdi,Object deger) {
	
	super (degiskenAdi + " " + deger + "olamaz !");
	 // böylece bu sınıta yakalanan değer getMessagge ile bize bildirileecek
	//Exception sınıfı java daki tüm hata sınıflarının base class ıdır yani ana sınıfıdır..
}
}
