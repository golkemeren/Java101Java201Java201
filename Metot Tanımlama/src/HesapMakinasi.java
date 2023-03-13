
public class HesapMakinasi {
public float topla (float x,float y) {
	return x + y ;
	
}
public float cikar (float x , float y) {
	return x-y;
	
}
public float carp (float x , float y ) {
	
	return x * y;
}
public float bol (float x,float y ) {   // şimdi bu oluşturudğumuz sınıfları driver.clar içerisinde kullanalım.
	return x / y ;
}
 public float kare (int x) {
	 return(float)Math.pow(x,2);
 }
public float karekok (int x) {
	return (float) Math.sqrt(x);  // Burdan çıkardığımız metot içinde metot çağırabiliriz
}
}
