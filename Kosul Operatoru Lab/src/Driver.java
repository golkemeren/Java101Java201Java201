 import java.util.Scanner;
public class Driver {
public static void main(String[] args) {
	int x = 30;
	int y = 20;
	/*if(x>y) { System.out.println("X büyüktür Y den ");}
	
	else {
		System.out.println("x    y den küçüktür ");
	}
		 // if içerisinde yazdığımız koşulun doğru olduğu durumda çalışacak durumdur 
		
	*/
	//System.out.println(x>y ? "x   y den büyüktür " : " X   Y den küçüktür " );  // Yukarıdaki kodlar ile aynı işlevi gördü 
	
    Scanner scanner = new Scanner(System.in);
   int i = scanner.nextInt();
 System.out.println(x>i ? "x İ DEN BÜYÜKTÜR": "X KUCUKTUR İ");


}
}


