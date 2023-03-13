import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Driver {
	
	public static void doldur(SortedSet<Integer> integers, int sutunSayisi) {
		integers.clear();  // sortedSet'in içi temizlensin dedik 
		Random random = new Random(); // rastgele değerler üretmek için kullanıcağımız sınıf
		while (integers.size() < sutunSayisi) {
			int sayi = random.nextInt(49) +1;
		integers.add(sayi);	
		}
	}
	
public static void main(String[] args) {
	
	Scanner scanner = new Scanner (System.in);
	System.out.print("Satır sayısı : ");
	int satirSayisi = scanner.nextInt();
	System.out.print( "Sütün sayısı : ");
     int sutunSayisi = scanner.nextInt();
		SortedSet<Integer> integers = new TreeSet<>();
		for (int i = 0; i < 8; i++) {
	doldur(integers , sutunSayisi);
	
   Iterator<Integer> iterator = integers.iterator();
  while (iterator.hasNext()) {
	  System.out.print(iterator.next() +  " \t" );
  }
  System.out.println();
}
}
}
