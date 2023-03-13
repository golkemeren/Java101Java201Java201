import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver {

	public static void main(String[] args) {

  ArrayList<Ogrenci> arrayList = new ArrayList<>();
  arrayList.add(new Ogrenci (1, "Ali CAN" , 16));
  arrayList.add(new Ogrenci(2, "Tuğrul ÇALIŞKAN", 7));
  arrayList.add(new Ogrenci(3,"Zeynep Güler", 14));
  arrayList.add(new Ogrenci(4, "Seyhan Koşar", 9));
  
  
        /* List<Ogrenci> collect = arrayList.stream()
		  .filter((o) -> o.getYas()>8 ) // A ismi ile başlıyanlar gelsin 
	      .collect(Collectors.toList());
 // collect metodu stream üzerinden dönen değerleri bize list get veya map olarak geri döndürüyor
        collect.forEach(System.out::println);*/
  
   /*Map<Integer, List<Ogrenci>> gruplama = arrayList
		   .stream()
		   .collect(Collectors.groupingBy(o -> o.getYas())); // yaşa göre grupla dedik
         
   
   Set<Integer> keySet = gruplama.keySet();
   Iterator<Integer> iterator = keySet.iterator();
   while(iterator.hasNext()) {
	   Integer key = iterator.next();
	   System.out.println( key + "  " + gruplama.get(key));
   }*/
  
  
  // Liste içerisindeki öğrencilerin yaş ortalmasını bulalım .
  
 /*double yasOrtalaması =  arrayList.stream()
  .collect(Collectors.averagingInt( (o) -> o.getYas()));
 System.out.println(yasOrtalaması);*/
  
  IntSummaryStatistics statistics = arrayList.stream()
		  .collect(Collectors.summarizingInt((o) -> o.getYas()));  // dizinin içerisindeki tüm istatistiki hesapları getirir.
		  System.out.println(statistics);
	
	}
         
}
