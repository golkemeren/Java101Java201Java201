
public class Araba {

	private String marka ;
	private String model ; 
	private int yil ;
	
	public Araba() {
		
	}
	public Araba(String marka,String model,int yil) {
		this.marka=marka;
		this.model=model;
		this.yil=yil;
	}
	
	
	public String getMarka() {
		return marka ;
	}
	
	public void setMarka(String marka) {
	 this.marka=marka;	
	}
	
	public String getModel() {
		return model;
	}
public void setModel(String model) {
	this.model=model;
}

public int getYil() {
	return yil;
}
public void setYil(int yil) {
	this.yil=yil;

}

@Override 
public String toString() {  // burda toString metodunu eziyoruz
	// bu şu anlama geliyor baseClass daki to String bizim istediğimizi yerine getirmiyor. Onun yerine biz kendi metodumuzu tanımlıyoruz. 

return "Marka" + getMarka() + ",Model"+ getModel() + ",Yıl" + getYil();

// böylece araba sınıfının toString metodu çağırıldığında geriye bu değer dönmüş olacak 
}
}

