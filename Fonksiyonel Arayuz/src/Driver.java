import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Driver {

	public static void main(String[] args) {

		/*Matematik matematik = new Matematik() {
			
			@Override
			public void islem(double a, double b) {
				System.out.println(a+b);
				
			}
		};*/
		// Lambda kullanarak yaptık 
		/*Matematik matematik = (x,y) -> System.out.println(x+y);
		matematik.islem(10, 20);
		
		 Matematik matematik2 = (x,y) -> System.out.println(x-y);
		 matematik2.islem(50, 5); */
	ArrayList<String> sehirler = new ArrayList<>();
		
		sehirler.add("Bursa");
		sehirler.add("İstanbul");
		sehirler.add("Ankara");
		sehirler.add("İzmir");
		sehirler.add("Kayseri");
		
		// Consumer
		//sehirler.forEach((s) -> System.out.println(s));
		 
		
		Predicate<String> predicate = (s) -> s.startsWith("B"); //  B harfi ile başlayanları getir dedik 
		
		for (int i = 0; i < sehirler.size(); i++) {
			String sehir =sehirler.get(i);
			if(predicate.test(sehir)) {
				System.out.println(sehir);}}}}
//Predicate'in amacı kendisine verilen değeri bir koşul içerisinde değerlendirdikten sonra boolean bir değer döndürmektir.
