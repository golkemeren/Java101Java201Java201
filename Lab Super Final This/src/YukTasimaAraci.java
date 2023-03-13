
public class YukTasimaAraci extends Arac {

	private int yukKapasitesi; // değişken 
	
	
	public YukTasimaAraci(String plaka, String marka,int yukKapasitesi) {
		super(plaka, marka);
		this.yukKapasitesi=yukKapasitesi;
	}
	
	public int getYukKapasitesi() {  // değişenlere erişmek için get ve set metodlarını yazıyoruz.
		return yukKapasitesi;
	}
	public void setYukKapasitesi(int yukKapasitesi) {
		this.yukKapasitesi=yukKapasitesi;
	}
	public void yazdir() {
		super.yazdir();  // Arac sınıfındaki yazdir metodunu çağırır.
		System.out.println("Yük kapasitesi : "  + yukKapasitesi);
	}

}
