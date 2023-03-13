
public class Driver {
	
	/*int x ;
	public Driver() { // burdaki driver , driver sınıfının yapıcı metotu haline geldi .Yani biz driver sınıfından bir değer alamk istediğimizde bu metot devreye giricek Driver sınıfını bizim için kullanıma hazırlaycak ve geriye değer döndürücektir.
		 System.out.println("ctor");
		 x=20;
	 }*/
public static void main(String[] args) {
	/*Driver driver = new Driver(); // burda new Driver(); dediğimizde aslında public driver şeklinde oluşturduğumuz metot kastedilmektedir.
System.out.println(driver.x);*/

	Ogrenci ogrenci = new Ogrenci("Goktug","Çalışkan",12);
	System.out.println(ogrenci.ad);
	System.out.println(ogrenci.soyad);
	System.out.println(ogrenci.yas);

	
	
	Ogrenci ogrenci2=new Ogrenci();
	System.out.println(ogrenci2.ad);
	System.out.println(ogrenci2.soyad);
	System.out.println(ogrenci2.yas);
}


}
