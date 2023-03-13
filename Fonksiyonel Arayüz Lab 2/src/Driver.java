import java.util.Date;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		System.out.println("Merhaba");
         Scanner scanner = new Scanner(System.in);
         
         Thread kullaniciGirisiThread= new Thread(() -> {
 		while(true) {
 			System.out.print("Giris : " );
 			String line = scanner.nextLine();  // bunu yaptığımızda ana thread bloklanmayacak 
 			System.out.println(line.toUpperCase());
 			}
 			});
         kullaniciGirisiThread.start(); // thread'i başlatır
         // bazı durumlarda uygulamamızın bloklanmasını istemeyiz bu gibi durumlarda trad yapısını kullanırız.
         // tradler aynı anda uygulamamıza birden fazla işlem yaptırmamızı sağlayan teknolojidir.
         // Biz şimdi her saniyede tarihi ekrana bastırıcıaz bu sırada da kullanıcıdan bilgi alamaya devam edeceğiz.
	
		while (true) { // while'ın koşuluna true dersek sürekli ekrana bu değeri bastırır.
			System.out.println(new Date());
			try {
				Thread.sleep(1000);  // uygulamamızı saniye uyutur
			} catch (InterruptedException e) {
			
			System.out.println(e.getMessage());
			
			}
		}
		
	
	}

}
