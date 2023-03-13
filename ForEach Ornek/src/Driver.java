import java.util.ArrayList;
import java.util.Iterator;

public class Driver {
	
	public static void main(String[] args) {

		ArrayList<Integer> arrayList= new ArrayList<>();
		arrayList.add(4);
		arrayList.add(9);
		arrayList.add(2);
		
	/*Iterator<Integer> iterator = arrayList.iterator();
	while (iterator.hasNext()) {  // hasNext true döndürülcek sonra nesxt çalışacaktır sonra değer ekrana bastırlıcaktır.
	Integer integer =iterator.next();
	System.out.println(integer);
	}*/
		
	for(Integer i : arrayList) { //üzerinde döneceğimiz collectionun içerisindeki değişkenin tipini belirtiyoruz.Sonra içerisinde döneceğimiz collection'un adını yazıyoruz.
		System.out.println(i);// bu değişkenin tanımlamasını yaptıktan sonra for otomatik olarak her bir değişkeni i değerinde tutucak 
	}
	// for-each yapısı kullanılarak hızlıca bir collection'un içerisindeki değerler ekarana basılabiliyor.
		// dolayısıyla for-each kullanılabilmesi için kullanılan sınıfın ıterable interfaces'ini implement etmesi gerekiyor.
		
		
		
		
		/*	int [] numbers = {1,2,3,4,5};
		for(int i=0 ; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		
		}
		System.out.println("-----------------");
		
		int i = 0;
		
		while (i < numbers.length) {   // koşul belirtiliyor koşul sağlandığı sürece while çalıştırılır.
     System.out.println(numbers[i++]);
		}
		
	  // do while ile while aynıydı ,while'da koşul başt akontorl edilirken do-while'da do'nun içi başta bir kere kontrol edilip sonra while 'ın içi çalıştırılıyordu.
		System.out.println("-----------------");
		int x =0;
		
		do {
			System.out.println(numbers[x++]);
		} while (x < numbers.length);*/
	
	
	}
		
		
}
