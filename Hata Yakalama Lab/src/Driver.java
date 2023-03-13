import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Driver {
public static void main(String[] args) {
	//yaz();
	oku();
	// bu yazı dosyası nerde oluşucak Bizim src klasörümüzde 'read.me' adında bir dosya oluşucak
// örneğimizde konsoldan girilen değerleri bir dosyaya yazdıralım
	
}
public static void oku () {
	File file = new File("read.txt");
	FileReader fileReader = null;  // Dosyayı okumak için FileReader nesnesini kullanırız.
 try {
	 fileReader = new FileReader(file);
	int c = 0;
	while (( c = fileReader.read())  != -1 ){
		System.out.print((char)c);
	}
	
 }
 catch(IOException e ){
	 System.out.println(e.getMessage());
	 
 } finally {
	 if (fileReader != null) {
	 try {
		fileReader.close();
	} catch (IOException e) {
	System.out.println(e.getMessage());
	}}
 }


}
public static void yaz() {
File file = new File("read.me"); // File nesnesi bizim istediğimiz dizinde bir metin dosyası oluşturmamıza yarayacak.
FileWriter fileWriter = null; // FileWriter sınıfı dosyaya yazım işlemleri için kullanılır .
// java ' da exception lar ikiye ayrılır bunlar checked exception ve unchecked exception(arrayindexoutofboundexception,aritmetichexception)
//IOexception bir exception sınıfından türediği için bir checkedexceptiondur. Dolayısıyla bu tür new FileWriter(file ); bir tanımlama doğru olmayacaktır.
Scanner scanner = new Scanner(System.in);
try {
	
 fileWriter = new FileWriter(file);
System.out.print("Bir yazı giriniz");
fileWriter.write(scanner.nextLine());
} catch (IOException e ){
	System.out.println(e.getMessage());
} finally {
	try {
		fileWriter.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.print(e.getMessage());
	}
scanner.close();
}
}

}
