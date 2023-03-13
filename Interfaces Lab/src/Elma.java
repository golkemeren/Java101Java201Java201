
public class Elma {
	private int agirlik;
	private String renk;
	
	public Elma (int agirlik,String renk) { // constructor sınıf ismi ile aynı olucak geriye dönüş olmayacak
		this.agirlik=agirlik;
		this.renk=renk;
	}
	
	public int getAgirlik() {
		return agirlik;
	}

	public void setAgirlik(int agirlik) {
		this.agirlik=agirlik;
		
	}
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk=renk;
	}
}
