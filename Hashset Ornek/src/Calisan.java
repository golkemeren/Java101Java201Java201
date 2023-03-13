
public class Calisan {

	private String tcNo;
	private String isim;
	
	public Calisan() {
		
	}
	public Calisan (String tcNo , String isim) {
		this.tcNo = tcNo;
		this.isim = isim;
		
	}
	
	public String getTcNo() {
		return tcNo;
	}
public void setTcNo(String tcNo) {
	this.tcNo=tcNo;
}
public String getİsim() {
	return isim;
}
public void setİsim(String isim) {
	this.isim=isim;
}

@Override
public int hashCode() {
	return Integer.valueOf(tcNo);  // ekranda nesnelerin hashCode değerlerinin yazılmasını sağlar.
}

@Override
public boolean equals (Object other) {
	Calisan calisan = (Calisan) other;  // tc no aynı olduğundan dolayı ikş nesneyi aynı saydı ve ekrana 3 değer geldi .
	return this.tcNo.equals(calisan.tcNo);
}

@Override
public String toString() {
	return "Tc No : " + tcNo + ", İsim: " + isim ;
}

}
