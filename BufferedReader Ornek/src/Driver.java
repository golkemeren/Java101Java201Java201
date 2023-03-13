import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Driver {
public static void main(String[] args) {
	File file = new File ("C:\\Users\\gorkem\\Desktop\\lorem.txt") ; // diskteki konumumu tutacak olan nesne 
BufferedReader bufferedReader = null;
FileReader fileReader = null;
try {
fileReader = new FileReader	(file);   // sınıflarımızı ilklendirdik .
bufferedReader = new BufferedReader(fileReader);
String line = null;
 while ((line = bufferedReader.readLine()) != null) {  // dosaynın içeriği alındı ve ekrana basıldı .
	 System.out.println(line );
	 
 }
} catch (Exception e) {
e.printStackTrace();
}finally {
	if (bufferedReader != null) {
		try {
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	if (fileReader != null ) {
		try {
			fileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}

}
}
