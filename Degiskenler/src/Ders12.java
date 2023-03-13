import java.util.Scanner;
public class Ders12 {
	public static void main (String [] args) {
		
		int bas,bit;
		Scanner read=new Scanner (System.in);
		System.out.println ("Başlangıç değerini giriniz: ");
		bas=read .nextInt();
		System.out.println("Bitiş değerini giriniz: ");
		bit=read.nextInt();
		for(int i=bas; i<=bit; i++) {
			if (i%2==1 && i%5==0)  {
				
				System.out.println(i+ "");
			}
		}
		
	}

}
