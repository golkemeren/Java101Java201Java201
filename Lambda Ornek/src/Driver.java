
public class Driver {
public static void main(String[] args) {
	/*SayiOlustur sayiOlustur = new SayiOlustur() {
		
		@Override
		public double olustur() {   // Lambda sayesinde buraya gerek kalmadan 
			return 15.0;
		}
	};*/  
	// Lambda kullanımı 
	SayiOlustur sayiOlustur = () -> 15.0; // () olustur metodunun içerisi boş olduğundan bu şekilde belirttik .
	System.out.println(sayiOlustur.olustur());
}
}
