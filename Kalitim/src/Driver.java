
public class Driver {
	public static void main(String[] args) {
		Sekil sekil = new Sekil(); // sekil sınıfımız bizim için ana klass olucak 
sekil.setPosX(40);
sekil.setPosY(30);
sekil.setRenk("Bordo");
sekil.alanHesapla();
		Kare kare = new Kare();
		kare.setPosX(10); // ekranın 10. bölgesinde olsun 
		kare.setPosY(10);
		kare.setRenk("Sarı");
		kare.setKenarUzunlugu(10);
		 kare.alanHesapla();
		//System.out.println(kare.getKenarUzunlugu());
		
		// java da varsayılan olarak bütün refereans typların ata klası objeckttir.
		Dikdortgen dikdortgen = new Dikdortgen();
		dikdortgen.setPosX(20);
		dikdortgen.setPosY(30);
		dikdortgen.setRenk("Mavi");
		dikdortgen.setYukseklik(10);
		dikdortgen.setUzunluk(5);
		dikdortgen.alanHesapla();
		
		Daire daire = new Daire();
		daire.setPosY(30);
		daire.setPosX(40);
        daire.setRenk("Siyah");
        daire.setYaricap(5);
        daire.alanHesapla();
        
}

}
