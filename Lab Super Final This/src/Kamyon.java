
public class Kamyon extends YukTasimaAraci {
	public Kamyon (String plaka,String marka, int yukKapasitesi,int konteynerSayisi) {
		super(plaka,marka,yukKapasitesi);
		this.konteynerSayisi=konteynerSayisi;
	}
	
	private int konteynerSayisi;
	public int getKonteynerSayisi() {
		return konteynerSayisi;
	}
	public void setKonteynerSayisi(int konteynerSayisi) {
		this.konteynerSayisi=konteynerSayisi;
	}
	public void yazdir() {
		super.yazdir(); // Yuk TasimaAracinin yazdir metodunu çağırır
		System.out.println("Konteyner Sayısı : " + konteynerSayisi);
	}

}
