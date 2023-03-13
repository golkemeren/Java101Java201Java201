import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Driver {
public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	System.out.println("Dosya Yolu Belirtiniz:");
 String filePath = scanner.nextLine();   // İstediğimiz adrese  bir dosya oluşturduk .
	File file = new File (filePath);
	if (!file.exists()) {
	try {
		boolean fileCreated= file.createNewFile();
		if(fileCreated) {
			System.out.println("Dosya oluşturuldu");
		}
	}catch (IOException e) {
		System.out.println(e.getMessage());
		
	}
	}
		FileWriter fileWriter = null;
		try {
			fileWriter  = new FileWriter(file);
			String line = null ;   // kullanıcının girdiği değer line olacak burda 
			do {
				
				line = scanner.nextLine();
				fileWriter.write(line);   // buurda kullanıcı konsoldan quit giricek quit girene kadar girmiş olduğu değerler dosyanın içerisine aktarılacak .
			    fileWriter.write(System.lineSeparator()); // dosya içinde birleşik yazıldı bu metod boşlukları düzenler
			}  // ardından do döngüsünden çıkıcak sistemi temizleme işlemleri yapılıcak 
			while (!line.equals("quit"));
			
			
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
		if (fileWriter !=null) {
			try {
				fileWriter.close();
			} catch(IOException e) {
				System.out.println(e.getMessage());
			}
			
		}
		}

	 
	scanner.close();
	System.out.println("Dosya yazdırma başarılı ");
	System.out.println("Dosya boyutu "  +  file.length() + "byte");
	
	
}
}
