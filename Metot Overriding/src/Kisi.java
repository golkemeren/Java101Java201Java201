
public class Kisi {
private String tcNo;
private String isim;
// bu dersimizde at  sınıfdan miras alınan metotların nasıl override edildiğini öğrendik.

public Kisi() {
	
}

public Kisi(String tcNo) {
	this.tcNo=tcNo;
	
}
public Kisi(String tcNo,String isim) {
	this.tcNo=tcNo;
	this.isim=isim;
}



public String getTCNo() {
	return tcNo;
}
public void setTCNo(String tcNo) {
	this.tcNo=tcNo;
}

public String getIsim () {
	return isim;
}
public void setIsim(String isim) {
	this.isim=isim;
}
@Override 
public boolean equals (Object other ) { // ilk olarak parametre oalrak gönderilen değresi sınıfın kendisine case etmemiz lazım 
	Kisi kisi = (Kisi)other; // parametre olarak gönderilen değeri kisiye case ettik 
	return kisi .tcNo.equals(this.tcNo); //&& kisi.isim.equals(this.isim); // kisinin tc si ve ismi aynıysa bu iki kişi aynı kişidir değerini geriye döndürdük.
	
}

@Override
 public String toString() {
	return "TC NO: " + tcNo +  ", İsim : " +isim;
	
} 


}
