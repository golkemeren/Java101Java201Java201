import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
	int input, toplama =0;
	
	do {
		System.out.println("Lütfen Sayı Giriniz");
		input = scanner.nextInt();
		
	if (input % 2 == 0) {
		toplama +=input;
	} 		
	} while (input>0);

	System.out.println("Girilen Çift sayıların Toplamı :" + toplama);
	}

}
