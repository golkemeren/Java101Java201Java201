import java.util.Arrays;

public class Driver {
	private static  int x =20;
public static void main(String[] args) {
	/*Driver driver = new Driver();
	driver.normalMetot(); */
/*Driver.staticMetot();
Math.sqrt(4); // math sınıfından bir metotda ihtiyacımız olursa sadece adını yazmamız yeterlidir.

int max =Driver.max(1, 5, 3);
System.out.println(max);
double max2 =Driver.max(45.0, 60.0, 80.0);
System.out.println(max2);
 boolean majority=Driver.majority(true, false, false);
 System.out.println(majority);
 
 int [] x = {1,2,3,5};
 int[] y = {1,2,3,4};
 System.out.println(Driver.eq(x, y));
 
 System.out.println(Driver.cube(5));

 int[] numbers = {2,4,6,8};
 System.out.println(Driver.toplam(numbers));
  int [] sonucCiftSayilar=Driver.ciftSayilar(new int [] {1,2,3,4,5,6,7,8,9,0});
 System.out.println(Arrays.toString(sonucCiftSayilar)); */

	
	

 int [] sayilar = {2,3};
 System.out.println(Arrays.toString(sayilar));
 Driver.degistir(sayilar);
 System.out.println(Arrays.toString(sayilar));


}

public static void  degistir(int[] sayilar) { // amacımız x in değerini y'e y'nin değerini x'e atamaktır.
	
	int temp = sayilar[0];
	sayilar[0]= sayilar[1];
	sayilar[1]=temp;
}



public static int [] ciftSayilar (int [] sayilar) {
	int[] sonuc = null;
	int adet =0;
	for (int i = 0; i < sayilar.length; i++) {
		if(sayilar[i] %2 ==0) {
			adet++;
		}
	}
	sonuc = new int [adet];
	int index =0;
	for (int i = 0; i < sayilar.length; i++) {
		if (sayilar[i] % 2 ==0) {
			sonuc[index++] = sayilar[i];
		}
		
	}
	return sonuc;
	
}



public static int toplam(int[] x) {
	int result =0;
	for (int i = 0; i < x.length; i++) {
		 result+=x[i];
	}
return result;
}

public static int cube(int x) {
	return x*x*x;
}

public static boolean eq (int[] x , int[] y) {
	
	boolean result =true;
	if(x.length == y.length) {
		for (int i = 0; i<x.length;i++) {
			if (x[i] != y [i]) {
				result= false ;
				break;
			}
		}
		
	}else {
		result=false;
	}
	return result;
}


public void normalMetot() {
	System.out.println(x);
	
}
//statik metotların statik olamyan metotlardan farkı ise sınıfta ınstıns almadan çalıştırılabilir olmalarıdır.
// statik metotlar statik olmayan değişkenlere erişemezler.Eğer erişmek istiorsak erişmek istediğimiz değişkeni de statik olarak tanımalalıyız.
// statik olamayan bloklardan ise statik olan bloklara erişim vardır .

public static void staticMetot() {
	System.out.println(x);
}
public static int max(int x,int y,int z) { // bu üç parametreden hangisinin büyük olduğunu döndüren metotdu yazıcaz
	int max = x;
	if (y>max)max=y;
	if (z>max)max = z;
	return max;
}
public static double max(double x,double y , double z ) {
	double max = x;
	if (y>max)max= y;
	if(z>max)max= z;
	return max;
}

// 3 elemanlı bir metot tanımlayalım bu metottu iki tanesi true olması durumunda true ,eğer true değişken sayısı 2 den az ise false döndürsün.

public static boolean majority (boolean x , boolean y , boolean z) {
	return (x&&y) || (x&&z) || (y&&z);
}
}
