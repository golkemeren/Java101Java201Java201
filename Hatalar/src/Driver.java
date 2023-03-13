import java.util.Scanner;

public class Driver {
public static void main(String[] args) {
//arithExcep();
//arrayExcep();
nullPointer();
}

public static void nullPointer () {
	Scanner scanner = null;
	String line = scanner.nextLine(); // bu gibi durumlarda ide bize yardımcı olmakta scanner'ın üzerind egelidğimizde null pointer acces hatasını görürüz
	System.out.println(line);
	
}

public static void arrayExcep() {
	
	int [] numbers = {0,1,2,3};
	Scanner scanner = new Scanner(System.in);
	int index = scanner.nextInt();
	System.out.println(numbers[index]);
}
public static void arithExcep() { // bir sayının sıfıra bölünmesinde fırlatılıyodu
	Scanner scanner = new Scanner (System.in);
	int x = scanner.nextInt();
	int y = scanner.nextInt();
	System.out.println(x/y );
}
}
