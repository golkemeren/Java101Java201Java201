import java.util.Iterator;
import java.util.LinkedHashSet;

public class Driver {
public static void main(String[] args) {
	
	/*LinkedHashSet<Integer> hashSet = new LinkedHashSet<>();
	hashSet.add(2);
	hashSet.add(5);
	hashSet.add(3);
	hashSet.add(3);
	hashSet.add(4); // linkedhashset olduğundan doayı eklenme sırasına göre gelecektir.
	System.out.println(hashSet.size());  
	System.out.println(hashSet.isEmpty());
	System.out.println("-----------------------");
	Iterator <Integer> iterator = hashSet.iterator();
	while(iterator.hasNext()) {
		Integer next = iterator.next();
		System.out.println(next);
	}*/
	
	LinkedHashSet<Araba> hashSet = new LinkedHashSet<>();
	hashSet.add(new Araba("34AA0123" , "X" , "Y"));
	hashSet.add(new Araba("34BB0123 ", "X" , "A"));
	hashSet.add(new Araba("34CC0123" , "A" , "B"));
	hashSet.add(new Araba("34CC0123" , "A" , "B"));
	
	Iterator <Araba> iterator = hashSet.iterator();
while (iterator.hasNext()) {
	System.out.println(iterator.next());
}

}
}
