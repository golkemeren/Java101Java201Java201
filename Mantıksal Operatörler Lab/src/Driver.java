
public class Driver {
	public static void main(String[] args) {
		
		boolean a = false;
		boolean b = true;
		System.out.println(a && b); 
		// burda mantıksal end operatörü iki defa tekrarlanmış gözükmekte 
	// bunun sebebi eğer ilk koşul eğer false ise 2.koşulun bir önemi yoktur 
		// eğer a değeri true olsaydı o zaman 2. koşul işletilecekti 
	
		System.out.println(a || b);
		System.out.println(!a && b);
	
	}

}
