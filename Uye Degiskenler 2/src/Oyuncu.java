
public class Oyuncu {
	int saglik = 100;
	static int oyuncuSayisi=0;
	
// istediğimiz herhangi bir anda oyunun içerisinde kaç adet oyuncu var bunu nasıl anlarız 
	
	public Oyuncu() { // constructor
		oyuncuSayisi++;
	}

	
	
	void yasam() {
		saglik=100;
	}
	void darbe () { // darbe isimli metot her çağırıldığında sağlık değerinden bir azaltılıyor.
		saglik--;
	}
	void oyuncuSayisi() {
		System.out.println(oyuncuSayisi);
	}

}
