import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Driver {

	public static void main(String[] args) {
	
       
		
	 /* Stream.of(1,4,5,6,7)
		.filter(new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				System.out.println("Test Filter");
				return t>2;
			}
		})    // anymatch çalıştırıldıktan sonra tekrar başa dönmüyor. yukardakş değerlere bakıp kod dikey bir şekilde ona göre çalıştırılıyor.
		.anyMatch(new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				System.out.println("Test anyMatch");
				return t==5;
			}
		});*/
		
		/*Stream.of("b1" , "a2" , "d3" , "e1")
		.map(new Function<String, String>() {

			@Override
			public String apply(String t) {
  System.out.println("Map");
  return t.toUpperCase();
			}
		})
		.filter(new Predicate<String>() {

			@Override
			public boolean test(String t) {
			System.out.println("Filter");
			return t.startsWith("A");
			}
		})
		.forEach(System.out::println);*/
		
		System.out.println("------------");

		Stream.of("b1" , "a2" , "d3" , "e1")
		
		
		.filter(new Predicate<String>() {

			@Override
			public boolean test(String t) {
			System.out.println("Filter");
			return t.startsWith("a");
			}  
		})
		.sorted(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
		System.out.println("Sortdet");
				return o1.compareTo(o2);
			}
		})
		.map(new Function<String, String>() {

			@Override
			public String apply(String t) {
  System.out.println("Map");
  return t.toUpperCase();
			}
		})
		.forEach(System.out::println);
		
		System.out.println("------------");

		Stream.of("b1" , "a2" , "d3" , "e1")
		.sorted(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
		System.out.println("Sortdet");
				return o1.compareTo(o2);
			}
		})
		
		.filter(new Predicate<String>() {

			@Override
			public boolean test(String t) {
			System.out.println("Filter");
			return t.startsWith("a");
			}  
		})
		.map(new Function<String, String>() {

			@Override
			public String apply(String t) {
  System.out.println("Map");
  return t.toUpperCase();
			}
		})
		.forEach(System.out::println);
	} 
	
	
	 // dolayısıyla büyük colecctionlarda önce filtre işlemi gerçekleştirilmeli sonra map işlemi gerçekleştirilmeli bçylece daha az cpu harcamış oluruz.

}
