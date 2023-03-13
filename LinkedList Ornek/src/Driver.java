import java.util.Iterator;
import java.util.LinkedList;

public class Driver {

	public static void main(String[] args) {
	LinkedList<Integer> integers = new LinkedList<>();
	integers.add(10);
    integers.add(20);
    integers.add(30);
    integers.add(20);
    integers.add(2, 55);  // 5. indexe 55 elemanını ekledik .
    
    
    
    
    System.out.println("Eleman Sayısı : " + integers.size());
    
    Iterator<Integer> iterator = integers.iterator();
    while (iterator.hasNext()) {
    	Integer next = iterator.next();  // elemanları eklenme sırasına göre yazdırır.
    	System.out.println(next);
    }
    
    System.out.println(integers.get(0));  // listenin 0 . indeksindeki numarayı verdi
    System.out.println(integers.get(integers.size() - 1)); // listenin osndan bir önceki elemanını getirdi .
    
    integers.addFirst(33);  // listenin başına eleman ekler.
    System.out.println(integers.getFirst()); // 0 ıncı indexteki elemanı döndürmekte 
    
    integers.addLast(44);  // listenin sonuna eleman ekledik 
    System.out.println(integers.getLast()); // listenin sonundaki elemanı çağırır .
	
	int indexOf = integers.indexOf(33);
	System.out.println(indexOf);  // indexOF ile göstediğimiz değerin kaçıncı indexte olduğunu bize verir .
	
	System.out.println(integers.indexOf(20));
	System.out.println(integers.lastIndexOf(20)); // sondan geriye doğru bir aramaya yapmamızı sağlar 
	
	integers.remove();  // listeden eleman kaldırmak için kullanılır .Parametre göndermediğimiz zaman listenin başındaki elemanı kaldırır.
	
	integers.remove (4); // 4. indexteki elemanı listeden kaldırmak için kullanılır .
	
	integers.remove (33); // bu değeri uygulamanın içerisindeki listeden kaldırmış oluyoruz.
	
	
	}

}
