import java.util.Arrays;
import java.util.Scanner;

public class TekCift {
 // kullanıcıdan sayı alıp girilen sayıların tek mi çift mi olduğıunu bualalım
	public static void main(String[] args) {
Scanner scanner = new Scanner (System.in);
System.out.println("Kaç adet sayısı alınacak ? ");
int sayiAdedi = scanner.nextInt();
int [] sayilar = new int [sayiAdedi];
for (int i = 0; i < sayilar.length; i++) {
	System.out.println("Sayı:");
sayilar[i] = scanner.nextInt();
}
System.out.println(Arrays.toString(sayilar));

for (int i = 0; i < sayilar.length; i++) {
	 if (sayilar[i] % 2 == 0 ) {
		 System.out.println(sayilar[i]+"Çift sayi");
		 
	 } else { 
		 
		 
		 System.out.println(sayilar[i]+"Tek sayi");
	 }
}

}
}
