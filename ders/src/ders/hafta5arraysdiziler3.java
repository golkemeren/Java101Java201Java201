package ders;

public class hafta5arraysdiziler3 {
	public static void main (String[]args ) {
		
		int dizi[]; //1.tür
		int[] yeni; //2.tür
		int array[]= new int [10];
		
		int  sayilar []= {10,20,30,40}; //1.yöntem
		for (int i=0; i<=3; i++) {
			System.out.println(sayilar[i]);
		}
	
		for (int i:sayilar) {
			System.out.println(sayilar[i]);
			
		}
		for (int i: sayilar) { //2.yöntem
			System.out.println(i);
		}
		for(int i=0; i<sayilar.length;i++) { //3.yöntem
			System.out.println(sayilar[i]);
			
		}
	}
			
	
	

}
