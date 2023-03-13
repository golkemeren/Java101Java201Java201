
public class Basketbolcu extends Oyuncu {
	// Oyuncu sınıfının içerisindeki abstract metotlar, oyuncu sınıfından türeyen sınıflarda tanımlanmak zorunda 
	// yani  body kısmı yazılmak zorundadır .
@Override
	public void pasVer() {
		System.out.println("Basketbolcu pas verdi ");
	}
	@Override
	public void sutCek() {
		System.out.println("Basketbolcu şut çekti ");
	}
}
