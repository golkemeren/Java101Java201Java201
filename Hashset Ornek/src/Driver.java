import java.util.HashSet;
import java.util.Iterator;



public class Driver {
public static void main(String[] args) {
	/*HashSet <String> hashKumesi = new HashSet<>();
	hashKumesi.add("İstanbul");
	hashKumesi.add("Ankara");
	hashKumesi.add("Bursa");
	hashKumesi.add("İstanbul");
	
	System.out.println(hashKumesi.size());
	
	Iterator<String> iterator = hashKumesi.iterator();
	while (iterator.hasNext()) {
		String next = iterator.next();
		System.out.println(next);
		
	}*/
	
	HashSet<Calisan> hashSet = new HashSet<>();
	hashSet.add(new Calisan ("1" , "Ali"));  // hashSet iki nesnenin aynı olup olmadığını hashSet'den gelen object metodu ile analamaktadır .
	hashSet.add(new Calisan ("2" , "Seyhan"));
	hashSet.add(new Calisan ("3" , "Ayse"));
	hashSet.add(new Calisan ("1" , "Ali"));
	
	Iterator <Calisan> iterator = hashSet.iterator();
	while (iterator.hasNext()) {
		Calisan calisan  = iterator.next();
	System.out.println(calisan.hashCode());  // hashCode metodu geriye int döndürür.
	}
}
}
