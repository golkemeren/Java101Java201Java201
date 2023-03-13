
public class Driver {
public static void main(String[] args) {
	
	/*Kalem kursunKalem =new Kalem();
	kursunKalem.marka="A marka";
	kursunKalem.tip="Kursun kalem";
	kursunKalem.doldurulabilir =false ;
	kursunKalem.silinebilir =true;
	
	kursunKalem.yaz("Merhaba Dünya");
	kursunKalem.tekrarDoldur();
	kursunKalem.sil();
	
	Kalem dolmaKalem = new Kalem();
	dolmaKalem.marka="B marka";
	dolmaKalem.tip= "Dolma Kalem";
	dolmaKalem.doldurulabilir=true;
	dolmaKalem.silinebilir=false;
	
	dolmaKalem.yaz("JAVA ile NYP");
	dolmaKalem.tekrarDoldur();
	dolmaKalem.sil();*/
	
	/*Telefon telefon=new Telefon();
	telefon.marka = "X marka";
	telefon.model= "Y model";
	telefon.tip = TelefonTipi.CEP;
	telefon.mobilVeri=true;
	telefon.wifi=true;
	
	telefon.aramaYap("05301253234");
	telefon.aramayiSonlandır();
	telefon.mesajGonder("merhaba,nasılsın");*/
	
	Kopek kangal = new Kopek();  // bir köpek nesnesi tanımlayalım
	kangal.cins="Sivas Kangal";
	kangal.boyut= Boyut.BUYUK;
	kangal.renk= Renk.SIYAH;
	kangal.yas=6;
	
	
	kangal.yemekYe();
	kangal.otur();
	kangal.kos();
	kangal.uyu();

}

}
