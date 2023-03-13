import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Driver {
public static void main(String[] args) {
	NavigableSet<Integer> navigableSet = new TreeSet<>();
	
	navigableSet.add(2);
	navigableSet.add(5);
	navigableSet.add(1);  // set Interfaces'i içerisinde eklenen değerler biribirinedne farklı olmak zorundadır yani unique olmak zorundadır.
	navigableSet.add(3);
	navigableSet.add(3);
	
	//System.out.println(navigableSet.size());
	
	Iterator <Integer>iterator = navigableSet.iterator();
while (iterator.hasNext()) {
	Integer next = iterator.next();
	//System.out.println(next);
}

/*System.out.println(navigableSet.ceiling(4)); // 4 veya daha büyük bir değeri ekrana getirecektir.
System.out.println(navigableSet.floor(3)); // 3 veya daha küçük olan değri ekrana getircektir. 0 dersek ekrana null getiecek , 9 dersek 9dan küçük 5 var ekrana 5 değeri geleckrtir. 
System.out.println(navigableSet.lower(2)); // 2 den küçük olan değerleri getiri .
System.out.println(navigableSet.higher(4));*/ // 4 te büyük olan değeri getirir.
SortedSet <Integer> sortedSet  =navigableSet.headSet(5, true); //parametre olarak verdiğimiz değere kadar olan değerleri ayarı bir set olarak bize gönderir.True dersekde parametre oalrak verdiğimiz değeri setin içerisine dahil ediyor.
Iterator <Integer> iterator2 = sortedSet.iterator(); 
while (iterator2.hasNext()) {
	
	System.out.println(iterator2.next());
}

}
}
