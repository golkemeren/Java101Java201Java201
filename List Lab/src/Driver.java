import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
    /*Bilet bilet = new Bilet(1, new Date(), 25.0f );
	
	 Koltuk koltuk = new Koltuk (1, bilet);
	
	System.out.println(koltuk);*/
	
	Random random = new Random();
	ArrayList<Bilet> biletListesi = new ArrayList<>();
	for (int i = 0; i < 1000; i++) {
		Bilet bilet = new Bilet (random.nextInt(1000), new Date() , random.nextFloat() * 100);
		biletListesi.add(bilet);
	}
	ArrayList<Koltuk> koltukListesi = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	int secim=0;
	int koltukNumarasi=0;
	System.out.println("Lütfen Seçim Yapınız : (1 Bilet Al) , (0 Çıkış Yap): ");
	
	while((secim=scanner.nextInt()) != 0 ) {
		Bilet bilet = biletListesi.get(random.nextInt(biletListesi.size()));
		biletListesi.remove(bilet);  // alınan biletin sistemden düşmesini sağlar.
		Koltuk koltuk = new Koltuk (++koltukNumarasi , bilet);
		koltukListesi.add(koltuk);
		System.out.println(koltuk);
	    System.out.println("Lütfen Seçim Yapınız (1 Bilet Al) , (0 Çıkış Yap) :" );
	}
	scanner.close();
	System.out.println("Satılan Bilet Sayısı : " + koltukListesi.size());
	Iterator<Koltuk> iterator = koltukListesi.iterator(); 
	
	while(iterator.hasNext()) {
		Koltuk koltuk = iterator.next();
	
	System.out.println(koltuk);}
	
	
	
	
	
	/*Iterator<Bilet> iterator = biletListesi.iterator();
	while(iterator.hasNext()) {
		Bilet next = iterator.next();
		System.out.println(next);
	}*/
		
	}

}
