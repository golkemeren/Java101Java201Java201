
public class Kalem {  // ilk olarak kalemin hangi özellikleri olduğunu düşünelim 
	String marka;
	String tip;
	boolean doldurulabilir;
	boolean silinebilir;
	
	void yaz (String metin) {  // aslında metotlar bir sınıfın yapabilirliklerini belirler.
		System.out.println(metin);
		
	}
	void tekrarDoldur() {
		
		if (doldurulabilir) {
			//kalemi doldur
			System.out.println("Kalem dolduruldu");
		}else {
			System.out.println("Bu kalem doldurulamaz");
		}
		
	}
		void sil ()  {
			if (silinebilir) {
				// yazıyı sil
				 System.out.println("Yazı silindi");
			}else {
			System.out.println("Bu yazı silinemez"); }
			
		}

}
