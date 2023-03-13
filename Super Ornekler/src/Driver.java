
public class Driver {
public static void main(String[] args) {
	Kisi kisi = new Kisi("Ertug Calıskan");
System.out.println(kisi.getIsim());

Ogrenci ogrenci = new Ogrenci("Göktuğ caliskan",2);
System.out.println(ogrenci.getIsim());
System.out.println(ogrenci.getNumara());

ogrenci.ozet();


}
}
