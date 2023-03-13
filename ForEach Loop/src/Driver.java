import java.util.Scanner;
import java.util.InputMismatchException;

public class Driver {
	public static void main(String[] args) {
		
		
		/*int [] numbers = {1,2,3,4,5,6,7,8,9};
		for(int i : numbers) {
			System.out.println(i);
			 // for-each döngüsünün çalışması şu şekildedir . bu intaksı yazıyoruz daha sonra içerisinde dönücek olan koleksiyonun veri tipini yazıyoruz. 
		// sırasıyla her bir döngüde 1,2,3,... değerleri  alınıp bir değişkene atanacaktır.
		 //  burada sintaksta dikkat edilmesi gereken şey i den sonra ':'  koyup sonra koleksiyonun adının yazılmasıdır.
		}*/
	
		
		// şimdide kullanıcıdan bir değer alalım ardından kullanıcıdan aldığımız   girdilerle bir array ı dolduralım ardından for each döngüsüyle  ekrana bastıralım .
	Scanner scanner = new Scanner(System.in);
	System.out.println("10 Adet sayı giriniz:");
	int[] numbers = new int[10]; // 10 elmanlı bir dizi  oluşturmak için bunu kullandık
	for (int i = 0; i < numbers.length; i++) {
		numbers[i]= scanner.nextInt();
	} 
	for (int i : numbers) {
	 if ( i % 2 == 1) {
		 System.out.println(i); // girdiğimiz sayılar arasında tek olanları ekrana yazdırma
	 
	}
	 if (i==5) {   // girdiğimiz sayının 5 olduğu durumda break diyip döngüden çıktık.
		 break;  
	 }

	}

	}
	}
