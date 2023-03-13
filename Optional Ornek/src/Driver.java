import java.util.Optional;

public class Driver {
	
	public static String test() {
		
		System.out.println("Test Çalıştı");
		return "test";
	}
	
	

	public static void main(String[] args) {
    
		
		
		/*Optional<String> bosNesne= Optional.empty();
System.out.println( bosNesne.isPresent()); // bu nesnenin boş olup olmadığını anlamak için 
 
String deger = "Merhaba";
Optional<String> optional =   Optional.of(deger);
  System.out.println(optional.isPresent());
    // Optional sınıfı kullanacağımız sınıflar için sarmalayıcı bir sınıftır.
   String s = null;
    //Optional<String> optional2 = Optional.of(s);
     // optional a null değer veremeyiz. Optionala null değer vermek istiyorusal ofNullable metodunu kullanmalıyız.
   
Optional<String> optional2=    Optional.ofNullable(s);
System.out.println(optional2.isPresent()) ; // false donecektir çunku optional içerisnde bir değer yoktur
    


String s2 = "Selam";

if(s2 != null) {
	System.out.println(s2.length());
}

 Optional<String> optional3 = Optional.ofNullable(s2);
    optional3.ifPresent((x) -> System.out.println(x.length()));*/  // if ile  burası aynı işlevi görmektedir.
	
	/*String bosIsim = "Veli";
	String isim = Optional.ofNullable(bosIsim).orElse("Ali"); // null değer dönerse Ali yazdır dedik dönmezse verilen değeri yazdırır.
	System.out.println(isim);
	
	String sehir = "Ankara";
	
String sehir2 =Optional.ofNullable(sehir).orElseGet(() -> "İstanbul" );
	System.out.println(sehir2);*/
		
		String bos = "a";
		String string = Optional.ofNullable(bos).orElse(test());  // orElse metodu burası boş olsada olmasada arkadaki test metodunu çalıştıracaktır.
		String string2 = Optional.ofNullable(bos).orElseGet(() -> test());   // bos isimli deger gerçekten null ise çalışacaktır 
		// Dolayısyla orElseGet metodunu kullanmak performans açısından daha verimli oalcaktır .
		
		System.out.println(string);
		System.out.println(string2);
	
	}
	
	

}
