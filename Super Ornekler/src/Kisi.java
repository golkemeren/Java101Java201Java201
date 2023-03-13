
public class Kisi {
private String isim;

public Kisi (String i) { // yapıcı metod
	isim=i;
}

public String getIsim() {
	return isim;
}
public void setIsim(String i ) {
isim=i;
}

public void bilgileriYazdir() {
	System.out.println("Kişi : " + isim);
}


}
