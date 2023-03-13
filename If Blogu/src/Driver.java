import java.util.Scanner;

public class Driver {
public static void main(String[] args) {
	/*int number = 10;
	
	boolean result = number>0;
	if (result) {
		System.out.println("Number pozitif bir sayıdır");
	System.out.println("2.");
	} else  {
		System.out.println("Number negatif bir sayıdır");
	}
	System.out.println("Burası her zaman çalıştırılacak");
		// eğer parantez içi doğru ise if bloğu çalıştırılacaktır. Süslü parantezi kullanmazsak iften sonraki ilk satır çalıştırılacaktır. 
	// Eğer koşul yanlış ise else bloğu çalıştırılacak şekilde ayarlama yaptık.	
	*/
	/*Scanner scanner = new Scanner (System.in);
	System.out.print("Lütfen bir sayı giriniz");
	int number = scanner.nextInt();
	if(number % 2 == 0) {
		System.out.println(" Girdiğiniz sayı Çifttir");
	}else {System.out.println("Girdiniğiiz sayı Tektir");
	}*/
/*	int number = 15;
	if (number<100) {
		System.out.println("Sayı 100 den küçüktür");
		if(number>50) {
			System.out.println("Sayı 50 den büyükür");
		} else {
			System.out.println(" Sayı 50 den büyük değildir ");
		}
	}
	*/
	
	// kullanıcıdan aldığımız sayının kaç basamaklı olduğunu yazdıralım
	
	Scanner scanner = new Scanner (System.in);
	System.out.println("Lütfen bir sayı giriniz");
	int number = scanner.nextInt();
	if (number<100 && number>=1)  // number 100 den küçük ve 1 den büyük ise demek istedik 
	{
		System.out.println("Giridiğiniz sayı 2 basamaklı ");
		
	} else if (number<1000 && number>=100) {
		System.out.println("Girdiğiniz sayı 3 basamaklı");
	}
	else if (number<10000 && number>=1000) {
		System.out.println("Girdiğiniz sayı 4 basamaklı ");
	}
	else {
		System.out.println("Giridğiniz sayı 1 & 9999 arasında değil ");
		}
	
}
}
