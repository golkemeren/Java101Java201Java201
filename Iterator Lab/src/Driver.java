import java.util.Iterator;

public class Driver {

	public static void main(String[] args) {
     Ogrenci ogrenci = new Ogrenci();
     ogrenci.setIsim("Tuğrul");
     int [] notlar = new int[5];
     notlar[0]=90;
     notlar[1]=70;
     notlar[2]=80;
     notlar[3]=95;
     notlar[4]=100;
     ogrenci.setNotlar(notlar);
    Iterator<Integer> iterator = ogrenci.iterator();
	while (iterator.hasNext()) { // burdan true dönerse Ogrenci clasından 0 <5 olduğundan true dönücek
		Integer integer= iterator.next();
		System.out.println(integer);
	}
	}

}
