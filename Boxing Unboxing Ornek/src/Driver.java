
public class Driver {

	
	public static int passInteger(Integer x) {
		return x.intValue();  // Geriye x'in primitive type değerini döndürmüş olsun .
		
	}
	
	public static void main(String[] args) {
     int i = 10;
     passInteger(new Integer (10)); // bu şekilde bellekte yeni bir integer nesnesi oluşturup içerisinde 10 değerini vermiş oluruz.
int passInteger =  passInteger(i);  // bu şekilde kullanırsak java bizim için bu i değerini arka tarafta autoboxing işlemine tabi tutar ve Integer sınıfına dönüştürür.
	

  Double d = 10.0;  // burdaki atamada referans type kullanılmıştır.
  double x = d;
   Integer integer = 10;  // bütün primitiveType classların Wrapper type classları bulunmaktadır.

	}

}
