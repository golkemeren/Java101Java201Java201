import java.util.Iterator;
import java.util.LinkedList;

public class OgrenciDriver {
public static void main(String[] args) {
	
	LinkedList<Ogrenci> linkedList = new LinkedList<Ogrenci>();
	
	linkedList.add(new Ogrenci (1, "ALİ" , "CAN"));
	linkedList.add(new Ogrenci (2, "Tugrul " , "Çalışkan"));
	linkedList.add(new Ogrenci (3, "Ertuğ " , "Çalışkan "));
	
	Iterator<Ogrenci> iterator = linkedList.iterator();
	while (iterator.hasNext()) {
		Ogrenci ogrenci = iterator.next();
	System.out.println(ogrenci);
	
	}
	linkedList.remove(2);  // 2. indeksteki eleman kaldırılmış oldu .
	iterator = linkedList.iterator();
	while (iterator.hasNext()) {
		Ogrenci ogrenci = iterator.next();
	System.out.println(ogrenci);
}

}
}
