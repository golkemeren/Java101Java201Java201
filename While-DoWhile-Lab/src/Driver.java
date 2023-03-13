import java.util.Scanner;

public class Driver {
public static void main(String[] args) {
	/*int starCount = scanner.nextInt();
	int i = 1;
	while(i<=starCount) {
int j = 0;
while(j<i) {
	System.out.print("*");
	j++;
}
System.out.println();
i++;
	}*/
	
	/*long total = 0;
	while (true) {  // yani bu while döngüsü sonsuza kadar çalışıcak, ta ki 23. satırdaki break ı görene kadar
		
		int x = scanner.nextInt();
		if(x==0) {
			break;  // buradaki break döngüden çıkıp bir sonraki satıra geçmeyi sağlar
		
		}
		total += x;
	}
	System.out.println(total); */
	Scanner scanner= new Scanner(System.in);
	/* // Bir ila 100 arasındaki çift sayıları ekrana bastıralım
	int x = 0;
	int y = 100;
	while(x<y) {
		if (x%2==0) {
			System.out.println(x);
		}
		x++;
	}
	*/
	 // girdiğimiz sayılar arasında max ve min değerleri bulan program 
	/*int x =0;
	int max = Integer.MIN_VALUE;
	int min = Integer.MAX_VALUE;  // Integer sınıfı javadaki int sınıfının bir rapperclasıdır.
	while (x<10) {
		
		int input = scanner.nextInt();
		if (input<min) min = input;
		if (input>max) max = input;
		x++;
	}
	System.out.println("Max:"+max);
	System.out.println("Min:"+min);
	*/
	
	 //Kullanıcı sıfır girene kadar girdiğimiz sayıların toplamını bulup ortalamasını alan program 

/*float avarage = 0.0f;
int count = 0;
while (true) {
	int number = scanner.nextInt();
	if(number==0) break;
	count++;
	avarage+=number;
	
}
System.out.println(avarage/count);*/
	
	// Kullanıcının konsoldan girdiği sayılardan kaç tanesi negatif kaç tanesi pozitif onu bulan program 
	
	int positiveCount=0;
	int negativeCount=0;
	while(true) {
		
		int x = scanner.nextInt();
		if(x>0) {
			positiveCount++;
		} else if (x<0) {
			negativeCount++;
		} else {
			break;
		}
	
		
	}
	System.out.println("Pozitif" + positiveCount);
	System.out.println("Negatif"+negativeCount);


	
}
}
