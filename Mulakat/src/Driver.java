import java.util.Scanner;

public class Driver {
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int kalan = 0;
        
        System.out.print("Bir sayi giriniz: ");
        int sayi = scanner.nextInt();
        
        for(int i = 1; i < sayi; i++)
        {
            if(sayi % i == 0) {
                kalan += i;
            }
        }
        if(sayi == kalan) {
            System.out.println(" Mükemmel bir sayidir");
        }
        else {
            System.out.println( " Mükemmel bir sayi degildir.");
        }
    }
}
	
	

	



			 


