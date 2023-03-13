
public class Driver {
public static void main(String[] args) {
	Araba araba=new Araba("X marka" , "Y model",2020);
	System.out.println(araba.toString());  // javadaki her sınıf varsayılan olarak object sınıfından türemiştir.
araba.setMarka("Q Marka");
System.out.println(araba.toString());
// object sınıfında toString isminde bir metot bulunmakta .toString metodu çağırıldığı nesneyi Stringe çevirmekte  
	}
}
