import java.util.Date;

public class Calisan {
 // Bu sınıf bizim için basit bir pojo sınıfı olucak.Pojo sınıfının temel özellikleri içerisindeki temel üye değişkenlerin private olması ve bu üye değişkenlere erişmek için set ve get metotlarının kullanılmasıdır.

private String isim;
private double maas;
private Date iseGirisTarihi;  // Date sınıfını import etmemiz gerekmektedir.

	public void setIsim(String s ) {  // bu değişkeni değiştirmek için set metodunu kullanırız.
		isim=s;
		
	}

public String getIsim() {  // bu değişkenin değerini geriye döndürmek için get metodunu kulanırız.
	return isim ;
}
public void setMaas(double d) {
	maas=d;	
}
public double getMaas() {
	return maas;  
}
public void setIseGirisTarihi(Date d) {  // farklı metotlar aynı isimli parametreleri alabilirler.
	iseGirisTarihi = d;
}
public Date getIseGirisTarihi () {
	return iseGirisTarihi;
	
}

	
	
}
