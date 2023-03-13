
public class Ogrenci implements Comparable <Ogrenci> {
	private int numara ;
	private String isim;
	public Ogrenci () {
		
	}
	public Ogrenci (int numara , String isim) {
		this.numara = numara;
		this.isim=isim;
	}
	
	public int getNumara() {
		return numara;
	}
	public void setNumara(int numara) {
		this.numara=numara;
	}

	public String getİsim() {
		return isim;
	}
	public void setİsim(String isim) {
		this.isim = isim;
	}
	
	@Override
public String  toString () {
return "Numara : "  + numara + " , İsim : " + isim;	
}
	@Override
	public int compareTo(Ogrenci o) {
		return this.isim.compareTo(o.isim);
	}
}
