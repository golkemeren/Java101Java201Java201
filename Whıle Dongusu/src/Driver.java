import java.util.Date;
import java.util.Scanner;

public class Driver {
public static void main(String[] args) throws InterruptedException {
	int i =0;
	while (i<10) {
		System.out.println(i);
		i++;
 // önce while ifadesini yazıcaz ardından açılan parantezlerin içerisinde bir önerme gerçekleştiricez bu önerme doğru olduğu sürece while'ın blokları içerisindeki yazılan kodlar kendini tekrar edecektir .  
	
		
	}
	// while(true) şu anlama geliyor uygulama buraya girdiği zaman sürekli çalışıcak demektir.
	
	// Saat Uygulaması  
	 /*while(true) { 
		System.out.println(new Date()); // bu komutta o anki tarihi saati sürekli olarak çalıştırır.
		Thread.sleep(1000); // Bu metod parametre cinsinden milisaniye olarak long almakta yani uygulamamız yavaşlatıcak .
		// Thread.sleep metodu bir hata fırlatır.
		
	}*/
	/*Scanner scanner=new Scanner(System.in);
	while(true) {
	//String text = scanner.nextLine();
    //System.out.println(text.toUpperCase()); // tuUpperCase bütün harfleri büyük harfe çevirir.
	
	int i = scanner.nextInt();
	System.out.println(Math.pow(i,2));
	}
	*/
	
}
}
