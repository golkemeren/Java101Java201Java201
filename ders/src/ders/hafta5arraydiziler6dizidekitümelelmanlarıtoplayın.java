package ders;

public class hafta5arraydiziler6dizidekitümelelmanlarıtoplayın {
	
	public static void main (String [] args) {
		
		//Dizideki tüm elemanları toplayınız..
		//
		int toplam = 0;
		int dizi [] = {10,20,30,40,50,60}; {
			for (int i = 0; i < dizi.length; i++) {
				toplam = toplam + dizi [i];
			}
			System.out.println(toplam);
		}
}
}
