import java.util.Scanner;

public class Daire {
 // yarıçapı  verilen bir dairenin çevresini ve alanını hesaplayan uygulama

	public static void main(String[] args) {
		 Scanner scanner =new Scanner(System.in);
		 System.out.println("Lütfen yarıçapı giriniz");
		 // alan=pi*r2
		 // çevre=2*pi2r
		 int yarıcap= scanner.nextInt();
		  float alan = (float) (Math.PI * Math.pow(yarıcap,2));
		  float cevre = (float) (2 * Math.PI*yarıcap);
		  System.out.println("Alan: " + alan);
		  System.out.println("Çevre: " + cevre);
	}
}
