import java.util.Scanner;

public class Parola {
public static void main(String[] args) {
 // Doğru şifre girilene kadar kullanıcıya bir şifre soralım 

	Scanner scanner = new Scanner(System.in);
	String parola = "";
	 do {
		 System.out.println("Lütfen bir parola giriniz");
		 parola = scanner.nextLine();
		 
	 } while (!parola.equals("1234"));
	 System.out.println("Sisteme Hoşgeldiniz");
}
}
