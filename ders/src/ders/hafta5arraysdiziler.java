package ders;

public class hafta5arraysdiziler {
	public static void main (String[] args)  {
		
		
		int dizi [] = {10,20,30};
		System.out.println(dizi[0]);
		System.out.println(dizi[1]);
		System.out.println(dizi[2]);
		dizi[0]=100;
		System.out.println(dizi[0]);
		dizi[1]=200;
		dizi[1]=300;
		System.out.println(dizi[1]);
		System.out.println(dizi[2]);
		//dizi[3]=400;
		//System.out.println(dizi[3]);
		System.out.println(dizi.length);
		String[] cars = { "Volvo" ,"BMW","FORD", "MAZDA"};
		for (String i : cars) {
			System.out.println(i);
		}
		
		
	}

}
