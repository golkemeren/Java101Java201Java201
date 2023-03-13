import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Driver {
public static void main(String[] args) {
	File file = new File ("input.txt");
	BufferedWriter bufferedWriter = null;
	FileWriter fileWriter = null;
	try {
		fileWriter = new FileWriter(file);
		bufferedWriter = new BufferedWriter(fileWriter);
	Scanner scanner = new Scanner (System.in);
	String line = null;
	while (!(line = scanner.nextLine()) .equals("quit")) { //yani quit yazana kadar kullanıcı değer girsin demek istedik
		bufferedWriter.write(line);   //konsoldan girdiğimiz değerler diske yazılmadı buffer sınıfından duruyor biz göremiyoruz
		//ancak buffer sınıfının limiti doldğuğuna ve close metodu ile buffer kapandığından biz input sınıfıda neler ayzdıldığını görebilirz.
	//quit dersek neler aydığımızı görebilriiz.
		// bufferedWriter'ı manuel olarka tetiklemek istersek o zaman flush() metodu çağırılmalıdır.
		bufferedWriter.flush();
		
	}
	scanner.close();
	
	
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}finally {
		try {
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}
			if (fileWriter != null) {
				fileWriter.close();}
		} catch (Exception e) {
			System.out.println(e.getMessage());}}	}}
