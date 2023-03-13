package ders;

import java.util.Scanner;
public class hafta45tabanveüsdeğerigirildiğindehesaplama {
	
	//Dışardan taban ve üs değeri girdiğimizde hesaplama yapacak 
	public static void main (String [] args ) {
		Scanner oku = new Scanner (System.in);
		int taban , us; double sonuc=1 ;
		System.out.println("Taban değerini giriniz:" );
		taban=oku.nextInt();
		System.out.println("Üs değerini giriniz :");
		us=oku.nextInt();
		
		
		sonuc = (int) Math.pow(taban, us);
		System.out.println("Üs alma sonucu:" +sonuc);
		
		/*while (us>=1) {
			sonuc=sonuc*taban;
			us--;
			
		}
		System.out.println("Üs alma sonucu:" +sonuc);
		
		
		for (int i=1; i<=us;  i++) {
			sonuc=sonuc*taban;
		}
		System.out.println("Üs alma sonucu:" +sonuc);
		*/
	}

}
