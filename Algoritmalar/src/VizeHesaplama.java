import java.util.Scanner;

public class VizeHesaplama {
 public static void main(String[] args) {
	 // Vize finnal notu ile geçtiniz kaldınız hesaplama 
	 Scanner scanner = new Scanner (System.in);
	 System.out.println("Vize Notu");
	 int vizeNotu=scanner.nextInt();
	 System.out.println("Final Notu");
	 int finalNotu = scanner.nextInt();
	 
	 float ortalama = (vizeNotu*0.4f) + (finalNotu*0.6f);
	 if (ortalama >= 50 && finalNotu >= 50) {
		 System.out.println("Tebrikler geçtiniz");
	 } else {
		 System.out.println("Üzgünüm kaldınız");
	 }
	 
	 
}
}
