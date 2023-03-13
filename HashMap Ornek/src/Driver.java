import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Driver {
public static void main(String[] args) {
	
	
	HashMap<String, Double> hashMap= new HashMap<String,Double>();
	
	hashMap.put("Bilgisayar", 2200.0);
	hashMap.put("Cep Telefonu", 1400.0);
	hashMap.put("Araba", 20000.0);
	
	
	
	
	System.out.println(hashMap.size());
	
	
	Set <String> keySet = hashMap.keySet();
	Iterator<String> iterator = keySet.iterator();
	while(iterator.hasNext()) {
		String key = iterator.next();
		System.out.println(hashMap.get(key));
		System.out.println("------------");
	}
		hashMap.remove("Araba");  // araba değerini kalmışmış olduk .
		
		keySet = hashMap.keySet();
		 iterator = keySet.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(key);
			System.out.println(hashMap.get(key));
			System.out.println("------------");
		
	}
		System.out.println(hashMap.isEmpty());  // hashmap'in  içerisi boşsa true döndürür.
	 
		hashMap.replace("Cep Telefonu", 6000.0);
		
		System.out.println("---------------------");
		
		Set <Entry<String,Double>> entrySet=hashMap.entrySet();
		
		Iterator<Entry<String,Double>> iterator2 = entrySet.iterator();
		while(iterator2.hasNext()) {
			Entry<String, Double> next = iterator2.next();
			System.out.println(next.getKey() + "  " + next.getValue());
		}
	

}
}


