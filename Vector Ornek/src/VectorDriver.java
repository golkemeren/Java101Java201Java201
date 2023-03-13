import java.util.Iterator;
import java.util.Vector;

public class VectorDriver {
public static void main(String[] args) {
	Vector<Kitap> vector = new Vector<> ();
	vector.add(new Kitap ("X" , 2020 , new Yazar("Ali" , "CAN")));
	vector.add(new Kitap("Y" , 2019, new Yazar("Göktuğ" , "Çalışkan")));
	vector.add(new Kitap ("Z" , 2000, new Yazar("Seyhan" , "Yıldız")));
	
	System.out.println(vector.size());
	System.out.println(vector.capacity());
	
	/*Iterator<Kitap> iterator = vector.iterator();
	while (iterator.hasNext()) {
		Kitap next = iterator.next();
		System.out.println(next);
	}*/
	
	for (int i = vector.size() -1; i >=0; i--) {
		Kitap kitap = vector.get(i);    // tersten de yazdırdık.
		System.out.println(kitap);
	}
	
	
}
}
