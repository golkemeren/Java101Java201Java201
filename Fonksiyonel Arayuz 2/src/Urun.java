import java.io.Serializable;

public class Urun implements Serializable  {
	
	private int id ;
	private String adi;
	private double fiyat;
	
	public Urun() {
		
	}
	
	public Urun(int id , String adi , double fiyat) {
		this.id=id;
		this.adi=adi;
		this.fiyat=fiyat;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getAd() {
		return adi;
	}
	public void setAd(String ad ) {
		this.adi=ad;
	}
	public double getFiyat() {
		return fiyat;
	}
	public void setFiyat(double fiyat) {
		this.fiyat=fiyat;
	}
	@Override
	public int hashCode() {
		return id; 
	}
	@Override
	public boolean equals(Object object) {
		Urun urun = (Urun) object;
		return this.id == urun.id;
	}
	@Override
	public String toString() {
		return "ID : " + id + ", Ad: "+ adi + ", Fiyat : "  + fiyat;
	}
	

}
