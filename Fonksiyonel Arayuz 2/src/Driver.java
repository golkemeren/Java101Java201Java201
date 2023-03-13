import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Driver {
public static void main(String[] args) {
	 // Supplier geriye istediğimiz değeri döndüren bir fonksiyonel arayüzdür.
	
	/*Supplier<Urun> supplier = new Supplier<Urun>() {
		
		@Override
		public Urun get() {
	Urun urun = new Urun(1, "Laptop",1000);
			return urun;
		}
	};*/
	
//Supplier<Urun> supplier = () -> new Urun(1, "Laptop", 10000);
	
	// Supplier'dan bir ürün döndürmek yerine ürün listesi döndürmesini isteyebiliriz.
	
	Supplier<List<Urun>> supplier = () -> {
		List<Urun> list = new ArrayList<>();
		list.add(new Urun(1,"Lapttop" , 1000));
		list.add(new Urun(2,"Cep telefonu" , 600));
		list.add(new Urun(3,"Klavye" ,100));
		return list;
	}; // birden fazla ürün döndürceğimiz için süslü parantez kullanıyoruz
	
	//System.out.println(supplier.get());
 supplier.get().forEach((u) -> System.out.println(u));
	
}
}
