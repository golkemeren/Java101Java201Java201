import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Driver {
public static void main(String[] args) {
	/*SortedSet<String> sortedSet= new TreeSet<>();
	sortedSet.add ("Ahmet");
	sortedSet.add ("Mehmet");
	sortedSet.add("Ertuğ");
	sortedSet.add("Göktuğ");
	sortedSet.add("Tuğrul");
	Iterator<String>iterator = sortedSet. iterator();      // iterator collectionlar içinde sırayla dönmemiz için bize veriken bir nesnedir.
	
	while (iterator.hasNext()) { // eğer iterator sona gelmediyse hasnext metodu true döndürecektir.Dolayısıyla while döngüsünün içerisine girilecektir.
	String next = iterator.next();
	System.out.println(next);  // yukarıda girdiğimiz sayısal değerler bize sıralı olarak verilecektir.
	
	}*/
	SortedSet<Ogrenci> sortedSet = new TreeSet<>();   //TreeSet metodu bir nesnenin unique olup olmadığını compareTo metodundan dönen değerle anlar
	sortedSet.add(new Ogrenci (5,"Ayşe"));
	sortedSet.add(new Ogrenci (2,"Ahmet"));
	sortedSet.add(new Ogrenci (3,"Emre"));
	sortedSet.add(new Ogrenci (4,"Ayşe"));
	
	System.out.println(sortedSet.size());
	 
	Iterator<Ogrenci> iterator = sortedSet.iterator();
	while (iterator.hasNext()) {
		Ogrenci next= iterator.next();  //sortedSet içinde tuttuğu nesneleri comparable interfacesine cast edip tutuyor.
		System.out.println(next);
	}
	
}
}
