import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
public class Driver {
	public static void main(String[] args) {
		// ilk olarak uzaktaki kaynağı belirtmek için bir URL nesnesi oluşturuyoruz.
		try {
			URL url = new URL("https://example-files.online-convert.com/document/txt/example.txt");
	
HttpURLConnection connection = (HttpURLConnection) url.openConnection();     //url.openConnection ile uzaktaki kaynağa bir bağlantı açılmakta ,daha sonra openConnectiondan geri dönen http url sınıfınımız oluşturalım. 
	InputStream inputStream =connection.getInputStream();
	InputStreamReader inputStreamReader = new InputStreamReader (inputStream);
	char [] buffer = new char [1024];
	
	FileOutputStream fileOutputStream = new FileOutputStream("output.txt");
	
	
	
	
	/*StringBuilder builder = new StringBuilder();*/
	int length = 0;
	while ((length = inputStreamReader.read(buffer)) !=  -1 ) {
		//builder.append(Arrays.copyOfRange(buffer, 0, length));
		
		fileOutputStream.write(new String (Arrays.copyOfRange(buffer, 0, length)).getBytes());
		
	}
	//System.out.println(builder.toString());
	
	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
