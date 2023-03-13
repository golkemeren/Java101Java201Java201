import java.util.Scanner;

public class Drive {
public static void main (String[]args) {
Scanner scanner = new Scanner (System.in);

// toLowerCase stringi küçük harfe dönüştürür.
StringBuffer buffer = new StringBuffer();
System.out.print("Adınız:  ");
buffer.append("Ad:");
buffer.append (scanner.nextLine());
System.out.print("Soyadınız: ");
buffer.append("Soyad: ,");
buffer.append(scanner.nextLine());
System.out.println(buffer.toString());



}

}
 