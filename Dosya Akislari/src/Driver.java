import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;

public class Driver {
public static void main(String[] args) {
	   // ilk yapmamız gereken erişilmek istenen kaynağı belirtmek olacaktır. File nesnesini kullanıyoruz

File file = new File("hello.txt");
 // kaynağa erişip kaynaktaki verileri okumak içinde FileInputStream'i kullanıyoruz.
FileInputStream fileInputStream = null;
 try {
	 fileInputStream = new FileInputStream(file);
	 int c = 0;
	 while ((c = fileInputStream.read() )  != -1 ) {  // bu değer -1 değilse ekrana c 'nin char karşılığını yazdıralım .
		System.out.print((char)c ); 
	 }
	 
 // read metodu kaynağın byte değerini bize geri döndürüyor fakat sona ulaştığında geriye -1 döndürüyor 
	 // dolayısıyla bir int değer tanımlayalım.
	 
 } catch (IOException e ){ 
	 System.out.println(e.getMessage());
 
 }finally {
	 if (fileInputStream != null) {
		try { fileInputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	 }
 }
 }
// dosya işlemlerinde yazma için stream kullanılır uygulamamızdan dışarı erişmek istediğimiz için OutputStream kullanmalıyız.
/*FileOutputStream fileOutputStream = null;  // constructorunda bir check exception alır . Yani IO exception fırlatır. Dolayısıyla bu sınıftan ınstance alma işlemini try içerisinde yapıcaz 
try {
	fileOutputStream = new FileOutputStream(file);
	fileOutputStream.write("Merhaba" .getBytes()); // yazdığımız mesajın bytlarını fileOutputStream'e gönderiyoruz.
	// Burda yaptığımız işlem low level bir işlem yan outputstream ile byte tabanlı yazma ve okuma işlemi gerçekleştiriyoruz.
	// eğer ilgili indexte bu dosyayı oluşturmaya hakkım yok ise uygulama catch e düşücektir.
}catch(IOException e ) {
	System.out.println(e.getMessage()); // hata mesajını ekrana bastırdık .
	
}finally {
	if (fileOutputStream != null ) {  // eğer fileoutputstream eşit değil ise null a bu metodun close metodunu çağır dedik 
		try {
			fileOutputStream.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}   // hello.txt adından bir txt dosyası oluşturuldu ve içerisine Merhaba yazısı konuldu 
}*/




}

