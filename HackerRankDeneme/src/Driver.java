
import java.util.Scanner;

public class Driver {
public static void main(String[] args) {
	 
      Scanner scanner = new Scanner (System.in);
      int a,b,secim,toplama,cıkarma,bolme,carpma;
      System.out.println("Lütfen birinci sayıyı giriniz ");
	   a = scanner.nextInt();
	  System.out.println("Lütfen 2 . sayıyı giriniz");
	  b = scanner.nextInt();
	  System.out.println("Lütfen yapmak isteniğiniz işlemi seçin ");
	  System.out.println("Seçiniz : ");
	  System.out.println("1-Toplama \n 2-Çıkarma \n 3-Bölme \n 4-Çarpma ");
	
	  secim= scanner.nextInt();
	  
	  toplama = a+b;
	  cıkarma = a-b;
	  bolme = a /b;
	  carpma = a*b;
	  if (secim == 1) {
		System.out.println( "Toplama işlemi sonucunuz:" + toplama);
	} else if ( secim == 2){
		System.out.println("Çıkarma işlemi sonucunuz : " + cıkarma );
	}else if (secim==3) {
		System.out.println("Bölme işlemi sonucunuz :" + bolme );
	}else if (secim==4) {
		System.out.println("Çarpma işlemi sonucunuz : " + carpma);
	}
	  
}

}
