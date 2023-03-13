import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Driver {
public static void main(String[] args) {
	
	
	File file = new File ("C:\\Users\\gorkem\\Desktop\\duke.png");
	if (file.exists()) {
		FileInputStream fileInputStream = null;  // bu dosya karakter tabanlı değil byte tabanlı olduğundan fileInputStream ile okutucaz
		// resimi  byte olarak okuttuk 
		try {
			fileInputStream = new FileInputStream(file);
			byte [] buffer = new byte [1024];
			int length = 0;
			while ((length = fileInputStream.read(buffer)) != -1) {
				System.out.println(Arrays.toString(buffer));
			}
			  // read metodu dosyadan okunan byte sayısını geriye döndürmekte 
		} catch(IOException e ) {
			System.out.println(e.getMessage());
		}finally {
			if (fileInputStream != null) { // null değilse 
				try {
					fileInputStream.close();
				} catch(IOException e ) {
					System.out.println(e.getMessage());
				} 
				
			}
		}
	}
}
}
