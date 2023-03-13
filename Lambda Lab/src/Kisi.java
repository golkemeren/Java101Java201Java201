import java.io.Serializable;
import java.time.LocalDate;

public class Kisi implements Serializable{
	
	public enum Cinsiyet {
		ERKEK,KADIN
	}
	public Kisi() {
		
	}
	public Kisi(String isim, LocalDate dogumTarihi , String emailAdresi ,Cinsiyet cinsiyet ) {
		this.isim=isim;
		this.dogumTarihi=dogumTarihi;
		this.emailAdresi=emailAdresi;
		this.cinsiyet=cinsiyet;
	}
	
	
	private String isim;
	private LocalDate dogumTarihi;
	private String emailAdresi ;
	private Cinsiyet cinsiyet;
	
public String getIsim () {
	return isim;
}

public void setIsim(String isim) {
	this.isim=isim;
}

public LocalDate getDogumTarihi() {
	return dogumTarihi;
}
public void setDogumTarihi(LocalDate dogumTarihi) {
	this.dogumTarihi=dogumTarihi;
}
public String getEmailAdresi() {
	return emailAdresi;
}
public void setEmailAdress( String emailAdresi) {
	this.emailAdresi=emailAdresi;
}

public Cinsiyet  getCinsiyet( ) {
	return cinsiyet;
}
public void setCinsiyet (Cinsiyet cinsiyet) {
	this.cinsiyet=cinsiyet;
}
public int getYas() {
	return LocalDate.now().getYear() - dogumTarihi.getYear();
}


@Override
public int hashCode() {  // iki kişinin email adresi aynıysa bu iki kişi bizim için aynı kişi olsun 
	return emailAdresi.hashCode();
}
@Override
public boolean equals(Object o) { // equals objectten geliyor sonra o objecti kisiye cast ettik 
	Kisi kisi = (Kisi)o;
	return this.emailAdresi.equals(kisi.emailAdresi);
}
@Override
public String toString() {
	return "İsim : " +isim + ",Dogum Tarihi: " +dogumTarihi + ",Email : " + emailAdresi + ",Cinsiyet : " + cinsiyet + ",Yaş : " + getYas(); 
}

}
