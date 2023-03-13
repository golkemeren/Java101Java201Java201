import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Driver {
public static void main(String[] args) {
	oku();
	
}
public static void oku() {
	File file = new File("test.txt");
	FileInputStream fileInputStream = null;
	InputStreamReader inputStreamReader = null;
	BufferedReader bufferedReader = null;
	try {
		fileInputStream = new FileInputStream(file);
		inputStreamReader = new InputStreamReader(fileInputStream);
        bufferedReader = new BufferedReader(inputStreamReader);
	    String line = null;
	    while ((line = bufferedReader.readLine()) != null) {
	    	System.out.println(line);
	    	
	    }
        // readLine satırın sonuna kadar okuma yapıyor
	} catch(Exception e ){
		System.out.println(e.getMessage());
	}finally {
		if (bufferedReader != null) {
			try {
				bufferedReader.close();
			}catch(IOException e ) {
				System.out.println(e.getMessage());	}}
	if (inputStreamReader != null) {
		try {
			inputStreamReader.close();
		}catch (IOException e ) {
			System.out.println(e.getMessage());
		}
	}
	if (fileInputStream != null) {
		try {
			fileInputStream.close();
		}catch (IOException e ) {
			System.out.println(e.getMessage());
		}
	}
	}

}
public static void yaz() {  // dosya oluştuurp yazdık 
	File file = new File("test.txt");
	FileOutputStream fileOutputStream = null; // exception fırlattığı için try catch içerisne aldık
	
	try {
		fileOutputStream = new FileOutputStream(file);
		
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
		outputStreamWriter.write("Merhaba Dunya"); // dosya içine yazım işlemi için kullandık 
		outputStreamWriter.close();
		
		
	} catch(Exception e ){
		System.out.println(e.getMessage());
	}finally {
		if (fileOutputStream != null) {
			try {
				fileOutputStream.close();
			}catch(IOException e){
				System.out.println(e.getMessage());
				
			}
		}
		
	}
}
}

