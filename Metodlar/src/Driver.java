import java.util.Scanner;

public class Driver {
public static void main(String[] args) { // burdaki main metodu uygulamamızın başlangıç metodudur.
	System.out.println("Hello World");
	System.out.println(Math.pow(2,3)); // ilk parametrenin ikinci parametreye göre kuvvvetini bulan metod
System.out.println(Math.sqrt(16)); // kendisine verilen değişkenin karekökünü alan metottur.

Scanner scanner= new Scanner(System.in); // metodlar sınıfların içerisinde de yer almaktadır.
String nextLine = scanner.nextLine(); // nextline metodu kullanıcının girdiği değeri bize geri döndürür.
System.out.println(nextLine.toUpperCase()); // Kullanıcının girdiği değeri büyük harfe çevirir.

}
}
