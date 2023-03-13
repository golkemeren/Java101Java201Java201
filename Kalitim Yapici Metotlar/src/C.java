
public class C extends B {
	public C(String text) {
		super(text);  // burda B sınıfına bir parametre atadığımız için C sınıfnın çalışması için super anahtar gelimesini kullanmalı ve text parametresini sisteme tanıtmalıyız.
		// burda en önemli olan kısım super anahtar kelimesinin çağırımının constructor dan sonra gelen ilk satırda yapılmasıdır.
		System.out.println("C ctor");
		
		
	}

}
