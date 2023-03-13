import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
    Scanner scanner  = new Scanner (System.in);
    
    String kullaniciAdi,parola;
    System.out.print("Lütfen Kullanıcı Adı giriniz: ");
    kullaniciAdi= scanner.nextLine();
    System.out.print("Lütfen Parola Giriniz:");
    parola = scanner.nextLine();  // kullanıcı adı: java şifre :123 olanlara girebilsin

    if (kullaniciAdi.equals("Java") && parola.equals("123")) {
		System.out.println("Hoşgeldiniz" + kullaniciAdi);
	} else {
		System.out.println();

	}
	}

}
