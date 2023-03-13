import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Driver {
	
	public static void oku( ) {
		File file = new File ("ogrenci.bin");
		if (file.exists()) { // dosya bulunursa çalışıcak olan metot 
			FileInputStream fileInputStream = null;
			ObjectInputStream objectInputStream = null;
			try {
				fileInputStream = new FileInputStream(file);
				objectInputStream = new ObjectInputStream(fileInputStream);
				Ogrenci ogrenci = (Ogrenci)objectInputStream.readObject();  // ogrenci sınıfına cast ettik 
			
			System.out.println(ogrenci);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}finally {
				try {
					if (objectInputStream != null) {
						objectInputStream.close();
					}
					
					if(fileInputStream != null) {
						fileInputStream.close();
					}
				} catch (Exception e2) {
					System.out.println(e2.getMessage());
				}
			}
		}else {
			System.out.println("Dosya bulunamadı");
		}
	}
	
	
	public static void yaz() {
		Ogrenci ogrenci = new Ogrenci ();
		ogrenci.setNumara(1);
		ogrenci.setAd("Göktuğ");
		ogrenci.setSoyad("Çalışkan");
		ogrenci.setSinif("1-A");
		System.out.println(ogrenci);
		
		
		File file = new File("Ogrenci.bin");
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream(file);
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(ogrenci);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(objectOutputStream != null) {
					objectOutputStream.close();
				}
				if (fileOutputStream != null) {
					fileOutputStream.close();
				}
			} catch (Exception e2) {
			e2.printStackTrace();
			}
		}
		
		
	}
	
	
public static void main(String[] args) {
	//yaz();
	oku();
}}
