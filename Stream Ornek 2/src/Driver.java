import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Driver {
public static void main(String[] args) {
	
	/*IntStream.range(1, 10) // start ve stop değerlerini verdik 1. parametre inclusive yani dahil   2. parametre exclusive yani hariçtir. 
	                         // dolayısıyla 1 ile 9 arasındaki sayılar ekrana basılcaktır.
     .forEach(System.out::println);*/
	
	Arrays.stream(new int[] {2,6,3,7,4,8})
	.map((x)-> x*2)
	.average()  // her bir değer 2 ile çarpılıp geri döndürüldü sonrada bunların artimetik ortlaması alınıp ekrana basıldı .
	.ifPresent(System.out::println);
	
	
	int sum = IntStream.range(1, 101)
	.sum(); // 1 ile 101 arasındaki sayıların toplamını getirir .
	System.out.println(sum);
	
	// object streamleri primitive streamlere dönüştürebiliriz 
	
	Stream.of("1" , "2" , "3" , "4")
	.mapToInt(Integer::parseInt)
	.max()  //  tanımlanmış max değeri geri döndürür
	.ifPresent(System.out::println);
	
	//primitive streamlerden object streamlere de dönüş mümkündür.
	 IntStream.range(1, 10)
	 .mapToObj((i) -> i + "a")  // gelen değelerin yanına a harfi basıldı 
	 .forEach(System.out::println);

	 // pirmitive streamler kendi aralarında da birbirlerine çevrilirler.
	 
	 Stream.of(1.1,2.2,3.3,4.4)
	 .mapToInt(Double ::intValue)
	 .max()
	 .ifPresent(System.out::println);
	 
	 // stream ler hantaldır demiştik 
	 
	 Stream.of("Ali" , "Ahmet " , "Cem" , "Burak")
	 .filter(new Predicate<String>() {

		@Override
		public boolean test(String t) {
			System.out.println("Çalıştı");
			return true;
		}
	})
	 .forEach(System.out::println);
	 
}
}
