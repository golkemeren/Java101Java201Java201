 import java.util.Scanner;
public class Driver {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);// system.in kullanıcıdan veri alıncak anlamına geliyor 
		
		System.out.println("Yaşınız");
		int age = scanner.nextInt();
		System.out.println( age >= 18 ? "Ehliyet Alabilirsiniz" : "Ehliyet Alamazsınız");
		
	}

}
