
public class Sehir implements Comparable<Sehir> {

	private String plakaKodu;
	private String isim ;
	// treeSet in içerisine ekleyeceğimiz nesnelerin comparaple interfacesini implament etmesi gerekiyor.
	public Sehir() {
		
	}
	public Sehir(String plakaKodu , String isim) {
		this.plakaKodu=plakaKodu;
		this.isim=isim;
	}
	public String getPlakaKodu () {
		return plakaKodu;
	}
	public void setPlakaKodu(String plakaKodu) {
		this.plakaKodu=plakaKodu;
	}
	
	public String getİsim() {
		return isim ;
	
	}
	public void setİsim(String isim) {
		this.isim=isim;
	}
	
	@Override 
	public String toString() {
		return "Plaka Kodu :  " + plakaKodu + " , İsim :" + isim ;
	}
	@Override
	public int compareTo(Sehir o) {
		return this.plakaKodu.compareTo(o.plakaKodu);
	}
}
