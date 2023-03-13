package ders;

import java.util.Scanner;

public class hafta5arraydiziler7 {
 // dizilerdeki elemanları tersten yazdırma 
	
	public static void main (String []args) {
		
		int[] array =new int[5];
		Scanner oku =new Scanner(System.in);
		for (int i=0; i<5; i++) {
			System.out.println("Sayı giriniz:");
			array[i] =oku.nextInt();
		
		for (int a=(array.length-1);a>=0; a--) {
			System.out.println(array [a]+"--");
		}
					
		}
		
	}
}
