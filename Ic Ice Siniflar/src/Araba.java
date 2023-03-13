
public class Araba {
private String marka ; 
private String model ;
private Motor motor;

public String getMarka() {
	return marka; 
}

public void setMarka (String marka ) {
	this.marka=marka;
}

public String getModel() {
	return model;
}

public void setModel(String model) {
	this.model=model;
}
public Motor getMotor() {
	return motor;
}
public void setMotor(Motor motor) {
	this.motor=motor;
}

public class Motor { // Motor isimli bir class oluşturduk 
	// aslında motor bir ınner class olmuş olucak  mormal bir java classı oluşturuyomuş gibi oluşturduk.
	
	private int hacim ; 
	public int getHacim() {
		return hacim;
	}
	public void setHacim ( int hacim) {
		this.hacim=hacim;
	}
}
}
