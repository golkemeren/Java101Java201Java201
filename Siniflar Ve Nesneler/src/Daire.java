
public class Daire { // Daire isminde bir sınıf oluşturduk .
	// Burdaki dikkat edilmesi gereken husus kodların bulunduğu dosyanın adı ile sınıf adının aynı olmasıdır.
	
	double x;
	double y ;  // burdaki x ve y değişkenleri bizim dairemizin orta noktasını yani kordinatını tutacaktır .
	double r ;
	
	double cevreHesapla() { // bu metot parametre almayıp sınıfın içindeki değişknelerle hesaplamaları yapacaktır.
		return 2*3.14*r;
	}
	double alanHesapla() {
		return 3.14*r*r;  // tanımladığımız bu metotları kullanabilmemiz için öncelikle daire sınıfından bir ınstance almamız lazım 
	}

}
