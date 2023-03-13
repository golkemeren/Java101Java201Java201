import java.util.Scanner;

public class Driver {
public static void main(String[] args) {
	 boolean sonuc = 9 != 9; // iki değerin birbirine eşit olup olmadığını anlamak için kullanılır 
	 System.out.println(sonuc);
// != ifadesi de bir değerin öteki değeri eşit olmadığını kontrol eder 
	 
	 Scanner scanner = new Scanner(System.in);
	 String str1 = scanner.nextLine();
	String str2 = scanner.nextLine();
	System.out.println(str1.equals(str2));
	
}
}
