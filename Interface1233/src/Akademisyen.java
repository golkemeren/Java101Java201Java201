
public   class Akademisyen implements ICalisan{

	private String adSoyad,bolum,gorveler;

	
	
	
	
	
	public Akademisyen(String adSoyad, String bolum, String gorevler) {
		super();
		this.adSoyad = adSoyad;
		this.bolum = bolum;
		this.gorveler = gorevler;
	}

	public String getAdSoyad() {
		return adSoyad;
	}

	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}

	public String getBolum() {
		return bolum;
	}

	public void setBolum(String bolum) {
		this.bolum = bolum;
	}

	public String getGorveler() {
		return gorveler;
	}

	public void setGorveler(String gorveler) {
		this.gorveler = gorveler;
	}

	@Override
	public void giris() {
		System.out.println("Giriş Yapıldı");
		
	}

	@Override
	public void cikis() {
System.out.println("Çıkış");
		
	}

	@Override
	public boolean yemek(int saat) {
  System.out.println("Yemek yendi");
		return false;
	}
}
