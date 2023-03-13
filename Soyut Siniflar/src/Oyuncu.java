
public abstract class Oyuncu {  // bbu sınıfın gerçek dünyada bir karşılığı yoktur. Bu sınfıın amacı kendisinden türeyecek olan alt sınıflar için belli bir orta katman oluşturmaktır. 
private String isim;
private int numarasi;
// bizim sınıfımız abstract  yani soyut bir sınıfsa o sınıftan instance alınamaz 
// burda oyuncu sınıfının tanımlanmasının sebebi kendisinden türeyecek sınıflar için ortak bir katman oluşturmasıdır.Ve kendisinden sonra türeyecek her sınfıtaki değişkenleri kendi içerisinde bulundurmaktır.
// gerçek dünyaya baktığımızda aslında oyuncu tipinde bir değer yoktur.Futbol oyuncusu ,basketbol oyuncusu diyerek belirtiriz.Dolayısıyla oyuncu sınıfının burda gerçek bir sınıf olmasının  da bir mantığıu yoktur . 
// peki bu ne anlama geliyor , oyuncu sınıfının başına soyut sınıf dememiz gerekiyor yani abstract 
public String getIsim() {
	return isim;
}

public void setIsim(String isim ) {
	this.isim=isim;
}

public int getNumarasi() {
	return numarasi;
}
public void setNumarasi(int numarasi) {
	this.numarasi = numarasi;
}
public abstract void sutCek(); // oyuncunun ne tür bir oyuncu olduğunu bilmediğimiz için  bu kısımı dolduramıyoruz.
	// Basketboll oyuncusu da olabilir futbol oyuncusu da olabilir bilemediğimiz için bu metodların içini boş bırakıyoruz
	// çünkü oyuncu sınıfından bir ınstance alamadığımızdan bunların sut ve pas metodları çalıştırıldığında gerçek dunyada nasıl bir tepki vereceiğini bilemiyoruz.

public abstract void pasVer();   // abstract olarak tanımlanmış metodların body kısmının olmasına gerek yoktur.
// sutCek ve pasVer metodlarının tanımlanması için muhakkak oyuncu sınfıından türeyen bir sınıfın ve nesnenin tanımlanması gerekmektedir. Burda da o nesne futbolcu nesnesidir.
}
