import java.util.Scanner;

public class Driver {
public static void main(String[] args) {

	/*
	 * Km birim fiyat 0.10 birim.
	 * 12 yaşından küçükse %50 indirim.
	 * 12 ve 24 yaş arasındaysa % 10 indirim 
	 65 yaşından büyükse %30 indirim .
	 Gidiş dönüş alırsa %20 indirim  
	 */
	Scanner scanner = new Scanner (System.in);
	int km,yas,tip ;
	System.out.println("Mesafeyi giriniz");
	km = scanner.nextInt();
	System.out.println("Yaşınızı giriniz ");
	yas = scanner.nextInt();
	 
	System.out.println("Yolculuk tipini seçiniz (1-Tek Gidiş, 2-Gidiş/Dönüş) : ");
	tip = scanner.nextInt();
	double normalFiyat,yasIndirimi,tipIndirimi;
	if (km > 0  && yas > 0 && (tip ==1 || tip==2)) {
		normalFiyat = km*0.10;
		
		
		normalFiyat = km *0.10 ;
		if (yas <12) {
			
			 yasIndirimi = normalFiyat * 0.50;
		} else if(12>=yas  && yas<=24 ){
			
        yasIndirimi = normalFiyat * 0.10;
        
		}else if (yas >=65) { 
			
		yasIndirimi = normalFiyat * 0.30 ;
		
		}else {
			yasIndirimi = 0;
		}
		normalFiyat-=yasIndirimi;
		if (tip == 2) {
			tipIndirimi = normalFiyat * 0.20;
			normalFiyat = (normalFiyat - tipIndirimi ) * 2;
		} 
		System.out.println("Bilet tutarı : "  + normalFiyat + "$");
	}else {
		System.out.println("Girdiğiniz bilgiler eksik veya yanlış  ");

	}

}
}

