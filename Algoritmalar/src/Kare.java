import java.util.Scanner;

public class Kare {
 // kare alan ve çevresini hesaplayan program 
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.println("Lütfen kenar uzunluğu giriniz");
	int kenar= scanner.nextInt();
	// alan = kenar*kenar
	//çevre= 4*kenar
int alan = (int)Math.pow(kenar,2);
int cevre = (int) (4*kenar);
System.out.println("ALAN :" + alan);
System.out.println( "ÇEVRE:" + cevre);

}
	
}
