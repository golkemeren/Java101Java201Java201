import java.util.Scanner;

public class Driver {
public static void main(String[] args) {
	 // Hesap Makinesi Uygulaması 
	Scanner scanner = new Scanner (System.in);
	System.out.println("1.sayı:");
	float x = Float.parseFloat(scanner.nextLine());  // parseFloat metodu statik bir metottur ve parametre olarak içerisine string bir değer almaktadır.
// parseFloat metodu kendisine verilen stringi floata çevirmek için kullanılır. 
    System.out.println("2.sayı:");
	float y = Float.parseFloat(scanner.nextLine());
System.out.println("İşlem:");
char islem = scanner.nextLine().charAt(0);

switch (islem) {
case '+': 
	System.out.println("Sonuc:" + (x+y));
	break;
case '-':
	System.out.println("Sonuc:" + (x-y));
break;
case '/':
	System.out.println("Sonuc:"+(x/y));
	break;
case '*':
	System.out.println("Sonuc:" + (x*y));
	break;
	default:
		System.out.println("Bilinmeyen Operatör");
		break;

}

}
}
