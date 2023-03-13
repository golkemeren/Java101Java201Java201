import java.util.Date;

public class Calisan {
 
	private String isim;
	private String bolum;
	private Date iseGirisTarihi;
	
	public Calisan() {
		
	}
	
	public Calisan( String bolum) {  // Calisan sınıfının tek parametreli 2 ve  3 parametreli Constructor yani yapıcı metotlarını oluşturduk. 
		this.bolum=bolum;
	}
	public Calisan (String bolum,String isim) {
		this.bolum=bolum;
		this.isim=isim;
	}
	public Calisan (String bolum,String isim , Date iseGirisTarihi) {
	this.isim=isim;
	this.bolum=bolum;
	this.iseGirisTarihi=iseGirisTarihi;
	}
	
	public String getİsim () {
		return isim;
	} 
	
	public void setİsim(String isim) {
		this.isim=isim;
	}
	public String getBolum() {
		return bolum;
	}
	public void setBolum(String bolum) {
		
		this.bolum=bolum;
	}
	public Date getIseGirisTarihi() {
		return iseGirisTarihi;
	}
	
	public void setIseGirisTarihi( Date iseGirisTarihi) {
		this.iseGirisTarihi=iseGirisTarihi;
	}
	
	public void bilgileriYazdir() {
		
		System.out.println("İsim:" + isim);
		System.out.println("Bölüm:" + bolum);
		System.out.println("İşe Giriş Tarihi:"+iseGirisTarihi);
		System.out.println("------------------------------");
	}
}
