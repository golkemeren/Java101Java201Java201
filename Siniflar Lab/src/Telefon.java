
public class Telefon {  // telefon tipine önceden tanımlanmış bilgileri koyabiliriz, bunun için enum sınıfını kullanmalıyız.
 TelefonTipi tip;  // bu şekilde yazarsak TelefonTipi enumından gelen değerleri kullanabiliriz.
String marka;
String model;
boolean wifi;
boolean mobilVeri;
boolean aramaVarmi;

void aramaYap (String telefonNumarası) {
	System.out.println(telefonNumarası);
	aramaVarmi=true;
	
}
void aramayiSonlandır() {
	if(aramaVarmi) {
		
		System.out.println("Arama sonlandirildi");
	}
	
}
void mesajGonder (String mesaj) {
	if(mobilVeri || wifi) {
		System.out.println("Mesaj gönderildi");
	}
	
	
}


}
