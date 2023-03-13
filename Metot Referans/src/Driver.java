import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Driver {

	public static void main(String[] args) {
		
		/*ArrayList<Integer> integers = new ArrayList<>();
		integers.add(3);
		integers.add(2);
		integers.add(6);
		// integers.forEach((i) -> System.out.println(i));
		
		 // şimdide metot referansı kullanarak yeniden bir çağırım yapalım 
		 
		 integers.forEach(System.out::println); */
		 
		/*ArrayList<Bisiklet> arrayList = new ArrayList<> () ;
		arrayList.add(new Bisiklet("X Marka", 8));
		arrayList.add(new Bisiklet( "Y Marka" , 3));
		arrayList.add(new Bisiklet("Z Marka" , 21));
		arrayList.add(new Bisiklet("Q Marka" ,18));
		
		
		BisikletKarsilastirici bisikletKarsilastirici = new BisikletKarsilastirici();
		
		
		Collections.sort(arrayList, bisikletKarsilastirici::compare);  // Vites sayılarını küçükten büyüğe sıraladık
		//arrayList.forEach((a) -> System.out.println(a));
	    arrayList.forEach(System.out::println);*/
		
		
		List<String> markalar = new ArrayList<>();
		markalar.add("X Marka");
		markalar.add("Y Marka");
		markalar.add("Z Marka");
		
		List<Bisiklet> bisikletler = markalar.stream().map(Bisiklet::new) .collect(Collectors.toList());
		bisikletler.forEach(System.out::println);
	}

}
