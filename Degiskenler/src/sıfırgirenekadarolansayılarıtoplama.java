
import java.util.Scanner;

public class sıfırgirenekadarolansayılarıtoplama
{
	public static void main (String[]args ) {
		
Scanner oku=new Scanner (System.in);

int sayi,toplam=0;
System.out.println ("BİR SAYİ GİRİNİZ:");
sayi=oku.nextInt();
while (sayi!=0) {
	
	
	toplam=toplam+sayi;
	System.out.println("BİR SAYİ GİRİNİZ:");
	sayi=oku.nextInt();
	
}
System.out.println("TOPLAM:"+toplam);
	}

}
