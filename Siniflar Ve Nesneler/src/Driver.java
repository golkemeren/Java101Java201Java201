
public class Driver {
public static void main(String[] args) {
	 // daire sınıfından bir örnek yaşayan bir nesne oluşturulım.
	// daire sınıfının  tanımlaması dairenin hangi özellikle sajip olduğu ve yapabilirliklerini tutacaktır.
	//Daire sınıfını bellekte yaşar hale getirmek için önce sınıfın adını sonrada bir değişlken adı vermemiz gerekmektedir. Daire daire; şeklinde 
	// bu sınıfı tam anlamıyla oluşturmak istiyorsak  new anahtar kelimesi ile ilklendirmemiz gerekir.İlklendirme işlemi aslında sınıf içerisindeki yapıcı metot sayesinde olur .
	Daire daire;
	daire= new Daire();  // bu tanımlamadan itibaren daire classında oluşturudğumuz değerler kadar daire sınıfı için bellekte yer ayrılmıştır.
	// bu işlemden sonra daire sınıfının içerisindeki değerlere nokta "." operatörüyle ulaşabiliriz.
daire.x=10.0;
daire.y=20.0;
daire.r=3.0;
System.out.println(daire.x);
System.out.println(daire.y);
System.out.println(daire.r);

double alan=daire.alanHesapla();
double cevre=daire.cevreHesapla();
System.out.println(alan);
System.out.println(cevre);

Daire daire2=new Daire();  // burda önceden oluşturduğumuz daire sınıfını tekrardan kullanabiliriz.
daire2.r=30;  // daire sınıfı içerisindeki r değerini değiştirip tekrardan sisteme yeni bir hesaplattırma yaptık .
// Bu örnekte gördüğümüz gibi aslında sınıflar tekrar tekrar kullanılabilen kod parçacıklarıdır.Dolayısıyla sınıfları kullanmak hem yazılan kodun azalmasını hem de  kodun bakımının daha kolay hale gelmesini sağlar.
System.out.println(daire2.alanHesapla());
System.out.println(daire2.cevreHesapla());

Daire daire3 = daire2;
daire3.r=40;  // bu kullanımda daire2 ve daire3 bellekte aynı yeri işaret etmektedir. ve daire3 tanımlı olmamasına rağmen çalışacakatır.
// bu durumda daire2 ninde yarıçapı40  daire3 ünde yarıçapı 40 olacaktır.
System.out.println(daire3.alanHesapla());
System.out.println(daire3.cevreHesapla());

}
}
