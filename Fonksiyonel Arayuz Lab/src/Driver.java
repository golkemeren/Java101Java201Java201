import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Driver {

	public static void main(String[] args) {
	ArrayList<Ogrenci> ogrenciler = new ArrayList<>();
	ogrenciler.add(new Ogrenci(1,"Ali Can" , 80));
	ogrenciler.add(new Ogrenci(2,"Seyhan Çalışkan" , 90));
	ogrenciler.add(new Ogrenci(3, "Ertuğ Yılmaz", 50));
	ogrenciler.add(new Ogrenci(0, "Göktuğ SANCAK", 70));
	
     ogrenciler.forEach((o) -> System.out.println(o));

       /*  Collections.sort(ogrenciler, new Comparator<Ogrenci>() {  // sort metodu ogrencileri bizim belirttiğimiz şekilde numaraya göre sıralamış olucak

			@Override
			public int compare(Ogrenci o1, Ogrenci o2) {

				return o1.getNumara() - o2.getNumara();  // iki öğrencinin numarası aynı ise burdan 0 dönücek 
					} });*/
     
         
     
     Collections.sort(ogrenciler,(a,b) -> a.getNotOrtalaması() - b.getNotOrtalaması() );  // not ortalamsına göre lambca yöntemiyle sıraladık
     Collections.sort(ogrenciler,(a,b) -> a.getAd().compareTo(b.getAd()));   // alfabetik sıralama yaptık .
     System.out.println("---------------------------------");
         ogrenciler.forEach((o) -> System.out.println(o));
	}

}
