import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Driver {

	public static void main(String[] args) {
	ArrayList<Integer> arrayList = new ArrayList<>();
    Random random = new Random();
    for (int i = 0; i < 100; i++) {
		arrayList.add(random.nextInt(100));
	}
    System.out.println(arrayList.size());
    
 /*   for (int i = 0; i <100; i++) {
    	System.out.println(arrayList.get(i));  // arraylis'in içeriisndeki değerleri ekrana yazdırıyoruz.
		
	}*/
    
    Iterator<Integer> iterator = arrayList.iterator();
    while(iterator.hasNext()) { // itaratorun bir sonraki nesneye sahip olup olmadığını kontrol ediyoruz
    	Integer integer = iterator.next();
    	System.out.println(integer); // 
   if(integer>50) {  // 50 den buyuk değer varsa diziden çıkaralım
	   iterator.remove();
   }
   System.out.println(arrayList.size());
    }
	}

}
