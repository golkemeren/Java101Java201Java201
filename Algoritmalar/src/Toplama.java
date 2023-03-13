import java.util.Scanner;
public class Toplama {
public static void main(String[] args) {
	// klavyeden 0 girilene kadar alınan sayıların toplamını bulan program
 Scanner scanner = new Scanner(System.in);
 int toplam=0;
 int input = 0;
 
 System.out.println("Lütfen bir sayı giriniz:");
 do {
	input = scanner.nextInt();
	 toplam += input;
	 
 } while (input !=0);
 System.out.println("Girdiğiniz sayıların toplamı"+toplam);

}
}
