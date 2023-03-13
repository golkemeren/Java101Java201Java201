
public class Driver {
public static void main(String[] args) {
	Kisi kisi1 = new Kisi("1","Tuğrul ÇALIŞKAN");
	System.out.println(kisi1.toString());
	
	Kisi kisi2 = new Kisi("1" , "Ertuğ ÇALIŞKAN");
	System.out.println(kisi2.toString());
	
	System.out.println(kisi1==kisi2);
	System.out.println(kisi1.equals(kisi2)); // Jav da varolan bütün nesnelerin ata class ı Object sınıfıdır.
	
	 // equal sınıfının varsayılan davranışı   == ile aynıdır .Yani iki nesnein bellekte aynı yeri gösterip göstermediğini kontrol eder.
}
}
