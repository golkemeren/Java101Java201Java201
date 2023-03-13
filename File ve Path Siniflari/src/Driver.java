import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.Scanner;

public class Driver {
public static void main(String[] args) {
	/*File file = new File("C:\\Users\\gorkem\\Desktop\\sample.txt.txt");  // masaüstünde oluşturduğumuz dosyanın yolunu buraya verdi k
	System.out.println(file.exists());  // bu metod parametre olarak verdiğimiz yoldaki dosyanın olup olmadığını bize geri döndürür.Geriye true veya false bildirim verir.

System.out.println(file.canRead()); // dosyayı okuma izni olup olmadığımızı bize geri döndürür. true 
System.out.println(file.canWrite()); // dosyayı yazma iznimizi bize geri döndürür true
// file nesnesi ile hem klasörleri hem de dosyaları işaretleyebiliriz.
System.out.println(file.isDirectory()); // verdiğimiz yoldaki nesnenin dosya mı klasör mü olduğunu anlamamızı sağlar.Biz klasörü referans ettiğimiz için true gelecektir.
System.out.println(file.getAbsolutePath()); // bu metotta abize dosyanın bulunduğu tam dizini yolu verir.
System.out.println(file.getParent());// dosyanın veya klasöürun bir üst dosyasını bize veriri .
System.out.println(file.length()); // dosyanın kaç byte olduğunu bize geri döndürür.
System.out.println(file.lastModified()); // dosya veya klasör üzerind eyapılan son işlemin tarihini verir.milisaniye cinsinden karşılığını verirBunu anlaşılabilir kılamk için new Date metoduna parametre olarak gönderebiliriz.
System.out.println(new Date (file.lastModified()));


File file2 = new File ("C:\\Users\\gorkem\\Desktop\\sample.txt.txt");  // ornek.txt dosyasını burdan oluşturduk.

if ( !file2.exists()== false ) {  // eğer file2 exist değilse 
	try {
		file2.createNewFile();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
// oluşturduğumuz dosyayı silmek istiyorsak 

/*if (file.exists()) {
	boolean silindimi = file2.delete();  // dosyayı silmek için kullanılır.
	System.out.println(silindimi);
}  */
	
	Scanner scanner = new Scanner (System.in);
	System.out.println("Dosya Yolu: ");  // C:\ Dizini çerisindeki dosyaları ekrana bastırmış olduk 
	String path = scanner.nextLine();
	File file = new File (path);
	String []icerik =file.list(); // eğer file klasör ise geriye klasörün içeriğini döndürmekte 
	for (int  i= 0;  i< icerik.length; i++) {
		System.out.println(icerik[i]);
	}
	scanner.close();
}
}
