import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ortalama {
	public static void main(String[] args) {
		 // Kullanıcıdan kaç tane sayının ortalamsının alınmasını istedini sorucam ,
		//Kullanıcının girdiği sayı kadar rastgele sayı üreticem ardından bu rastgele üretilen sayıların ortalamasını alıcam.
Random random = new Random();  // Random sınıfı rastgele sayılar üretmek için kullanılan metottur.
Scanner scanner = new Scanner (System.in);
	// 0 ile 99 arasında rastgele bir sayı üretecektir.
System.out.println("Kaç adet sayı üretilecek  ");
int sayi = scanner.nextInt();
int [] sayilar = new int [sayi];
	
	for(int i = 0; i< sayilar.length;i++) {
		
		sayilar [i] = random.nextInt(100);
		
	}
	System.out.println(Arrays.toString(sayilar));
	
	float toplam = 0.0f;
	for (int i =0; i<sayilar.length;i++) {
		toplam += sayilar[i];
	}
	System.out.println("Ortalama");
	float ortalama = (toplam/sayi);
	System.out.println(ortalama);
	}

}
