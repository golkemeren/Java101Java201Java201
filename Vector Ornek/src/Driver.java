import java.util.Vector;

public class Driver {
public static void main(String[] args) {
	
	Vector<String> vector = new Vector <>(4);
	vector.add("Kedi");
	vector.add("Köpek");
	vector.add("Kaplan");
	vector.add("At");
	vector.add("Tavşan");
	
	for (int i = 0; i < vector.size(); i++) {
		
		String string = vector.get(i);
		System.out.println((i) + " " + string );
		
	}
	System.out.println(vector.capacity());  // vektörün kapasitesini yazdırmak istersek .
	
	System.out.println(vector.contains("Kedi"));  // içerisinde yazdığımız elaman varmı diye bakmak için kullanırız.
	
	int  indexOf = vector.indexOf("Kaplan");  // kaplan değerinin kaçıncı indexte olduğunu görmemize yarar .
	
	System.out.println(indexOf);
	
	vector.clear(); // vectorun içerisindeki elemanları temizlemek için kulllanılır.
	System.out.println(vector.size());
	System.out.println(vector.capacity());
}
}
