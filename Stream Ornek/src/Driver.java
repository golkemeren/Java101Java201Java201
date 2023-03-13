import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Driver {

	public static void main(String[] args) {
		// streamler herhangi bir collection tipi veya diziler üzerinde işlem yapabilirler.

		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("İstanbul");
		arrayList.add("Ankara");
		arrayList.add("Bursa");
		arrayList.add("Adana");
		arrayList.add("İzmir");
		// Şimdide metotları birbiri ardına nasıl kolayça çağırcağımıza bakalım .UYgulamamız çok kısalıcak
		arrayList.stream()
		.filter((s)-> s.startsWith("İ") )
		.map((s) -> s.toUpperCase())
		.sorted((s1,s2)->s1.compareTo(s2))
        .forEach(System.out::println);

		
		
		
		
		
		
		
		
		
/*	Stream<String> stream =arrayList.stream(); // içerisinde arrayList tutuan bir stream'imiz olmuş oldu .
	 // sonrasında streamlar üzerinde sıralam filtreleme,haritalama ve dönme işlemlerini gerçekleştirebilrizi.
	 // map metodu intermediot bir metottur geriye değer döndürür.
	
	Stream<String> stream2 = stream.filter(new Predicate<String>() {
	
	
	@Override
	public boolean test(String t) {

		return t.startsWith("A"); // A ile başlayanları getir dedik 		
	}
	});
	
	Stream<String> stream3 = stream2.map(new Function<String, String>() { // map bizden function istiyor

		@Override
		public String apply(String t) {
			return t.toUpperCase();  // gelen değerleri buyuk harfe çevirir
		}
	});
	
	Stream<String> stream4 = stream3.sorted(new Comparator<String>() {

		@Override
		public int compare(String o1, String o2) {
			
			return o1.compareTo(o2);  // sıralama işlemini yapıcak
		}
	});
	
	stream4.forEach(new Consumer<String>() { // 

		@Override
		public void accept(String t) {
			System.out.println(t);
			
		}
		
	});*/
	

}
}
