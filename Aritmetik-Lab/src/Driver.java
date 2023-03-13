
public class Driver {
	public static void main(String[] args) {
		/*int x=10;
		float y=20f;
		System.out.println(x+y);
		System.out.println(x-y); // javada unside vveri tipi bulunmamaktadır yani side veri tipi bulunmaktadır bu da - + işaretlerini belli ettiğini gösterir.
		System.out.println(x*y);
		System.out.println(x/y); // burda 10 un 20 ye bölümünden kalan aslında 0 değildir 
	
	// '/' operatörü kendisine verilen değerler int türündeyse int  türünde değer geri döndürmek zorundadır. dolayısıyla verdiğimiz değerlerden birini float yapıp sonucun kayar noktalı (yani float) bir sayı olmasını istiyoruz.  
	
	System.out.println(8%2);  // Modulus operatörü bir sayının tek mi çift mi old anlamak için sıklıkla kullanılır .
	
	// bütünleşik operatörler ile ilgili bir örnek yapalım 
	int a = 10;
	//a = a+2; // eşitttir öperatörü atama yapmak için kullanılır aslında bir eşitlik belirlemez 
	// eşittir operatörünğün matematikteki karşılığı javada   == ifadesidir .
	a+=2;
	System.out.println(a);
	
	//Postfix ve Prefix ile ilgili örnekler 
	
	int q =12;
	System.out.println(q++);  // bu ifade postfix ifadesidir 
	System.out.println(q); // eğer ++q şeklinde ifadeyiz yazsaydık ifade  önce 1 arttırılır sonra ekrana yazılır 
	
	*/
		 
		int i = 10;  // 00000000 00000000 00000000 00001010   bellekte bu binary şeklinde yer alır.
	    int x = 4;  //  00000000 00000000 00000000 00000100
		System.out.println(~i);  //~ operatörü herhangi bir sayının sıfır gördüğü yerleri 1 , 1 gördüğü yerleri 0 yapmaktadır .
	//sayının yeni hali 11111111 11111111 11111111 11110101 bu sayının karşılığı ise ekrandaki -11 dir.
	// sonuç -11  çıkar bunun sebebi ise bitlerin başındaki sayı 1 olursa bu sayı negatif bir sayı olur .
	
	System.out.println(i&x); // & iki sayıyı alıp binary olarak  eğer 0 0 gelirse sonuç 0 ,1 1  gelirse sonuç 1 olacak şekilde sonucu ayarlar .
     // 00000000 00000000 00000000 00000000 şeklinde düzenler. yani 1-0=0,0-1=0,1-1=0,0-0=0;
	 // 0 & 0 =0  end operatörüne verilirse değer 0 olacaktır.
	//  0 & 1 =0 verilirse onuç 0 olacaktır.
	// 1 & 0 =0 verilirse 0 olur.
	// 1 & 1 = 1 verilirse 1 olur .
	System.out.println(i|x);
	// 0|0=0
	// 0|1=0
	// 1|0=0
	// 1|1=1      // Dolayısıyla değişiklikler yapıldıktan sonra 2^1,2^2ve 2^3 şeklinde verilecektir bu  da 14 e tekabül eder .
	
	
	System.out.println(x >> 1); // işlemi bir defa sağa kaydırmaya yarar .Sağa kaydırdığımızda en sağdaki sıfır atılır ve başa 1 tane 0 eklenir .
	// Yeni sayımız 00000000 00000000 00000000 00000010  Aslında biz sayıyı bir ddefa sağa kaydırdığımızda sayıyı ikiye bölmüş oluyoruz.
	
	System.out.println(x << 1); // aynı şekilde sayıyı sola doğru kaydırdığımızda en soldaki değer atılıp en sağ tarafa bir adet 0 eklenir 
// Yani bir sayıyı sola doğru kaydırdığımızda o sayıyı 2 ile çarpmış oluyoruz .
	}
}
