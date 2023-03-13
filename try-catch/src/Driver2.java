import java.util.Scanner;

public class Driver2 {
public static void main(String[] args) {
	int [] numbers = {0,1,2,3,4};
	Scanner scanner =new Scanner (System.in);
	System.out.print("Index değerini giriniz : ");
	int index = scanner.nextInt();
	
	if (index <=numbers.length) { // if else bloğunun içine yazmamızın nedeni uygulama try catch metodu içerisine girdğinde Jvm tarafından özel işlemlere tabi tutulur.
		// Dolayısıyla yazdığımız uygulamaların çalışması yavaşlar. Bunu engellemek için if ile kontrol yapacağımız yerlerde try-catch bloğu kullanmamalıyız. önceden hata ile karşılaşılabilecek yerleri 
		//öngörebiliyorsak if ile kontrol edip ondan sonra uygulamamızı çalıştırmalıyız.
		System.out.println(numbers[index]);
	} else {
		System.out.println("Yanlış index numarası");
	}
	
	
	
	
	
	/*try {
		System.out.println(numbers [index]);
		
	} catch (Exception e ) {
		System.out.println("Yanlış index numarası");
	} finally {
		scanner.close();
	}  // try catch metodunu her zaman kullanmamıza gerek yoktur. if else bloğunda da hatayı kontrol edip bilgi verebiliriz.
	*/
	
}
}
