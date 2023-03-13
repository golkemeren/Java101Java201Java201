import java.util.Iterator;
import java.util.Scanner;

public class Driver {
public static void main(String[] args) {
	/*for (int i = 0; i<10; i++) {
		System.out.println(i);
	}*/
 /*for(int i=10; i>=0; i--) {
	 System.out.println(i);
	 
 }*/
	/*int [] numbers = {2,4,6,8,10,12};
	for (int i = 0; i < numbers.length; i++) {
		System.out.println(numbers[i]); // bu şekilde numbers içerisindeki elemanları sütun şeklinde yazdırır.
		
	}*/
	// girdiğimiz 2 değer arasındaki çift sayıları sıralayan program  
/*Scanner scanner=new Scanner(System.in);
System.out.println("1.Sayı");
int x = scanner.nextInt();
System.out.println("2.Sayı");
int y = scanner.nextInt();
for (int i = x; i <= y ; i++) {
	if (i%2==0) {  
		System.out.println(i);
	}*/
	
	
	String[] names;
	Scanner scanner=new Scanner(System.in);
	System.out.println("Kaç Kişi Girilecek:");
	names =new String[Integer.parseInt(scanner.nextLine())];  // Kullanıcının girdiği string değeri int değere çevirir.
	for (int i = 0; i < names.length; i++) {
	System.out.println((i+1)+".Kişi:");
	names[i] = scanner.nextLine();
	
	}	
	for (int i = 0; i<names.length; i++) {
		System.out.print(names[i]+ ", ");
	}
}

}

