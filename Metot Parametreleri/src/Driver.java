import java.util.Arrays;

public class Driver {
public static void main(String[] args) {
	
	Driver driver=new Driver();
/*	int x =20;
	System.out.println(x);
	driver.passByValue(x);
	System.out.println(x);*/
	
	// java da metotlara parametre gönderilirken ilgili parametrenin yeni bir kopyası gönderilir.
	// arraylar referans tip değişkenlerdir.
	// int ise primitive type bir değişkendir.
	/*int [] sayilar = {1,2,3,4,5};
	System.out.println(Arrays.toString(sayilar));
	driver.degistir(sayilar);
	System.out.println(Arrays.toString(sayilar));*/
	Driver driver2=new Driver();
	driver2.test(5);
	
	driver2.varArgs(10, 1,2,3);  // varargs olarak aldığımız parametreleri direkt olarak virgül ile çağırabiliriz.
// burda ilk aldığımız parametre a değişkenine sonraki değişken numbers değişkenine atanmaktadır.
}  
 // aldığı parametrelerin sayısı dinamik olarak oluşturulan bir metot oluşturalım.
 // javada üç nokta işareti bunun bir int array'ı olduğu anlamına gelmektedir.
public void varArgs( int a ,int ... numbers) {  // burda metot int x ve birden fazla int alsın dedik
	int x =numbers[0];  // int... numbers  bu şekilde kullanıma variable argumants denir. Variable argumants ' ın en önemli özelliği en son sırada yer alması gerekmekte olduğudur.
	int y = numbers[1];
	System.out.println((x*a)+(y*a));
}

public void test (final int x) {  // bası durumalrda driver2 yukarıda verdiğimiz değerin değiştirilmemsini isteyebiliriz, bu yüzden değişkenin başın final anahtar kelimesini getirmeliyiz.
	//x=10; // eğer bir değişken final olarak işaretlendiyse  o değişkenin  değeri metot içerisinde değiştirilemez. Ve kodu çalıştırdığınızda derleme zamanı hatasıyla karşılaşırız.
	System.out.println(x);  
}

 public void degistir (int[] sayilar) {
	 for (int i = 0; i < sayilar.length; i++) {
		sayilar[i] = sayilar[i] * 2;
	}
 }
 


public void passByValue (int x) {
	
	System.out.println("PBV"+ x);  // bu ornek javadaki PASS BY VALUE DEĞERİNİ GÖSTERİR.
	x=10;
	System.out.println("PBV"+ x);
}
}
