import java.util.Date;

public class Driver {
	//POJO Sınıfları,basit java sınıfları olarak adlandırılırlar.
public static void main(String[] args) {
	/*Calisan calisan =new  Calisan();
	calisan.setIsim("Görkem"); // bu değişkeni değiştirmek için set metodunu kullanırız.
	calisan.setMaas(2200);
	calisan.setIseGirisTarihi(new Date());
	System.out.println(calisan.getIsim());
	System.out.println(calisan.getMaas());
	System.out.println(calisan.getIseGirisTarihi());*/
	// set metodu ile değerleri atadık get metodu ile ekrana yazdırdık

Kare kare = new Kare();
kare.setX(10);
kare.setY(-5);
kare.setUzunluk(100);
kare.ekranaBastir();

System.out.println(kare.getX());
}
}
