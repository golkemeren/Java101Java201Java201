import java.util.Scanner;

public class Faktoriyel {
public static void main(String[] args) {
	 // giridiğimiz sayının faktöriyelini hesaplayan prog
	Scanner scanner=new Scanner (System.in);
	 System.out.println("Lütfen bir sayı giriniz");
	 int number = scanner.nextInt();
	 
	 int sonuc = number;
	 
		 for (int i = number-1; i>0; i--) {
			sonuc=sonuc*i;
			
		}
		 System.out.println(sonuc);
}
}
