import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Driver {
	public static void main(String[] args) {
		HashMap <Integer,String> hashMap = new HashMap<>();
		hashMap.put(34, "İstanbul");
		hashMap.put(35, "İzmir");
		hashMap.put(6, "Ankara");  // key olarak verdiğimiz değerler eşsiz yani unique olmaslı 34 35 ler
		//hashMap.put(34, "İstanbul2");
		System.out.println(hashMap.size());
		
		String string = hashMap.get(34); // 34 e karşılık gelen değer geri döndürüldü .
	    System.out.println(string);
	
	    
	    Set<Integer> keySet = hashMap.keySet();
	    Iterator<Integer> iterator = keySet.iterator();
	    while(iterator.hasNext()) {
	    	Integer key = iterator.next();
	    	System.out.print(key + " ");
	    	String value = hashMap.get(key);
	    	System.out.println(value);    // HashMap içerisindeki değerleri alıp ekrana bastırdık .
	    }
	
	}

}
