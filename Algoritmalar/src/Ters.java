import java.util.Scanner;

public class Ters {
	public static void main(String[] args) {
		 // kullanıcıdan aldığımız karakter dizisini tersten yazdırma 
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz");
		String text = scanner.nextLine();
		for (int i = text.length() - 1; i >= 0; i--) {  // burda -1 dememizin nedeni javada karakter uzunluklarının 0 dan başlamasıdır
			System.out.print(text.charAt(i));
			
		}	
		}

}
