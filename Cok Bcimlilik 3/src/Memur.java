
public class Memur extends Calisan {
	
	// Memur sınıfının kırmızı yanmasının nedeni calisan sınıfının içinde varsayılan bir yapıcı metot yoktur.Biz yeni bir yapıcı metot yazdığımızda varsayılan yapıcı metot ortadan kalkıyor . 
	// Dolayısıyla memur sınıfının içerisinde bir yapıcı metot yazmalıyız.Aldığımız bu parametreleri super anahtar kelimesi ile türettiğimiz base classa göndermemiz gerekiyor.
	
	private String birim;

	public Memur (String i , String g, int m,String b) {
		super (i,g,m);
		birim=b;
	}

	
	public String getBirim() {
		return birim;
	}
	
	public void setBirim(String b) {
		birim=b;
	}
	public void ozet() {
		System.out.println("Memur İsim :  " + getİsim()); // getİism metodu Calisan sınıfından gelicektir o yüzden getİsim dememiz yeterli olacaktır.
	// çünki çalışan sınıflarının içinde tanımlanan metotların hepsi memur sınıfında da olacaktır.
		System.out.println("Memur Görev:  "  + getGorev());
		System.out.println("Memur Maas :  " + getMaas ());
		System.out.println("Memur Birim :  " + birim);
	}
	
}
