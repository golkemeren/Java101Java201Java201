import java.io.Serializable;

public class Ogrenci implements Serializable {

	private int numara ;
	private String ad ;
	private int notOrtalaması;
	
	public Ogrenci() {
		
	}
	public Ogrenci(int numara , String ad , int notOrtalaması) {
		this.numara=numara;
		this.ad=ad;
		this.notOrtalaması=notOrtalaması;
	}
	
	
	public int getNumara()  {
		return numara;
	}
	public void setNumara(int numara) {
		this.numara=numara;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad=ad;
	}
	public int getNotOrtalaması() {
	return  notOrtalaması;
	}
	public void setNotOrtalaması(int notOrtalaması) {
	 this.notOrtalaması=notOrtalaması;
	}
	
	@Override
	public int hashCode() {
		return numara;
	}
	
	@Override
	public boolean equals(Object object) {
		Ogrenci ogrenci = (Ogrenci) object;
		return this.numara == ogrenci.numara;  // numaralar eşitse bu ikisi aynı öğrenci dedik
	}
	@Override
	public String toString() {
		return "Numara :" +numara + ",Ad: " +ad + ",Not Ortalaması: " +notOrtalaması;
	}
	
	
	
	
	
}
