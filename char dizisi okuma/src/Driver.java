import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Driver {
public static void main(String[] args) {
	File file = new File ("C:\\Users\\gorkem\\Desktop\\lorem.txt.txt");
	if (file.exists()) { // dosya bulunduysa 
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(file);
			int c = 0;
			long now =System.currentTimeMillis();
			/*while ((c=fileReader.read())  !=-1) { // -1 değeri dosyanın sonuna ageldiğinde alınacak olan değerdir.
				System.out.println((char)c);
			}*/
			
		//okuduğumuz karakterleri içerisinde tutucak olan bir buffer oluşturulım.	
			char[] buffer = new char [1024];  // tek seferde okuma işlemini gerçekleştirmiş olduk .
			int length = 0;
			StringBuilder builder = new StringBuilder();
			while ((length = fileReader.read(buffer)) != -1) { // fileReader okuma yapıcak okuduğu kadarkterleri buffer isimli char arrayine atayacak ve kaç tane koyduysa ordan length değişkenini geri döndürücek 
				builder.append(Arrays.copyOfRange(buffer, 0, length)); // bu metot okuma yapılan yere kadar char ayırır yani sürekli 1024 ayırmamızı engeller 
			}
			System.out.println(builder.toString());
	// teker teker while döngüsü ile dönmek yerine  buffer kullanmak performans açısından daha iyi  böylece bu kullanımla çok fazlaca bellek te harcamamış oluyoruz 
			System.out.println(System.currentTimeMillis() - now );
		// denememizde gördükki buffer kullanmak çokdaha hızlı okuma sonucu veriyor ama buffer kullandığımız zaman bellekte text kadar yer ayrılıyor 
			//yani belleiğimizde o kadar yer yok ise  uygulamamız çalışmayacaktır.Bunun için buffer'ın boyutunu sabit verebiliriz
		}catch (Exception e) { 
		e.printStackTrace();
		}finally {
			if (fileReader != null) {
				try {
				fileReader.close();	
				}catch (IOException e) {
					e.printStackTrace();					
				}
			}
		}
	}else {
		System.out.println("Dosya bulunamadı");
	}
}
}
