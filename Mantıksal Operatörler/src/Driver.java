
public class Driver {
	
	
	
	public static boolean test () {
		System.out.println("Test çalıştırıldı" );
		return false ;
	}
public static void main(String[] args) {
	
	
	boolean b=true;
	System.out.println(b);
	System.out.println(!b); // b değerinin tersini yazdırır 
	System.out.println(b & true);  
	
	// false & false = false 
	 //false & true = false
    // true & false = false 
	// true & true = true 

	// false | false = false 
	// false | true = true 
	// true | false = true 
	// true | true = true 
	System.out.println( b|false );
	System.out.println(b && test());  // && bu operatörün çalışma şekli em başta soldaki değere bakıyor, sağ taraftaki değer her ne olursa olsun sonuç false olacağı için sağ taraftaki değere hiç bakılmıyor   
// eğer sol taraftaki b değeri true olursa o zaman sağdaki değere bakılır .
  System.out.println(b || test ());   // || operatöründe ise önce  soldaki değere bakılır eğer sağdaki değer sonucu değiştirmeyecekse bakılmaz
}
}
