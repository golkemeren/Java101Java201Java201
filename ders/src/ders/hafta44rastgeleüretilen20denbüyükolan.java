package ders;

public class hafta44rastgeleüretilen20denbüyükolan {
	public static void main (String[] args ) {
		int sayiUret,toplam=0;
		for(int i=1; i<=10; i++)  {
			sayiUret = (int) (Math.random()*101);
			if (sayiUret >=20) {
				System.out.println(sayiUret);
				toplam+=sayiUret;
			}
		}
	System.out.println("Toplam:" +toplam);
	//0-100 arası rastgele üretilen 10 sayıdan 20 den büyük olanları topla 
	}

}
