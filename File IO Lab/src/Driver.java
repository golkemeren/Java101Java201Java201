import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Driver {
public static void main(String[] args) {
	File inputFile = new File ("C:\\Users\\gorkem\\Desktop\\lorem.txt.txt");  // bu dosyadaki yazıları büyütüp başka bir dosyaya yazıcaz .
    File outputFile = new File ("C:\\Users\\gorkem\\Desktop\\lorem_output.txt.txt");
if (inputFile.exists()) { // dosaynın varlığını kontrol ediyoruz

	FileInputStream fileInputStream = null;
	FileOutputStream fileOutputStream = null;
	try {
		fileInputStream =new FileInputStream(inputFile);
		fileOutputStream = new FileOutputStream(outputFile);
		
		int c = 0;
		while ((c=fileInputStream.read())  != -1) {
			char ch = (char)c;
			fileOutputStream.write(Character.toUpperCase(ch));
		}
		
	} catch ( Exception e) {
		System.out.println(e.getMessage()); // eğer dosyanın açılışında bir hata varsa burası çalışıcak 
		
	}finally {
		if (fileInputStream != null) {
			try {
				fileInputStream.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		
		if (fileOutputStream != null) {
			try {
				fileOutputStream.close();
			}catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
	
	
	
} else {
	System.out.println("Dosya bulunamadı");
}
}
}
