import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Driver {

	public static void main(String[] args) {
		 Arrays.asList("İstanbul " , "Ankara" , "Bursa","İzmir")
		 .parallelStream()
		 .filter(new Predicate<String>() {

			@Override
			public boolean test(String t) {
				
				System.out.println("Test : " + Thread.currentThread().getName()); // bu bize bu işlemin hangi  thread işleminin üzerinde yapıldığını söyleyecek
			return true ; // yani listenin içindeki tüm değerler filtreden geçsin 
			
			}
		})
		.map(new Function<String, String>() {

			@Override
			public String apply(String t) {
				System.out.println("Apply:" + Thread.currentThread().getName());
				return t.toUpperCase();
			}
		
		})
		.forEach(new Consumer<String >() {

			@Override
			public void accept(String t) {
			System.out.println("Accept:" + Thread.currentThread().getName());
				
			}
		});

	}
 
	
	// içerisinde binlerce onbinlerce verinin bulunduğu array'lerde paralel stream ile dönmek her zaman en mantıklısı olucaktır.
}
