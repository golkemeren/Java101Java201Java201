package ders;

public class hafta46ACII {
	public static void main (String args []) {
		 
		
		// ascıı değeri klavyeyeden herhangi bir tuşa bastığımızda bilgisayarın anladığı sayı
		char ch= 'a';
		char ch1 ='A';
		char ch2 = '$';
		char ch3 = '#';
		int x =36;
		int y =66;
		System.out.println(x + ":Karakter değeri" + (char)x);
		System.out.println(y + ":Karakter değeri" + (char)y);
		System.out.println( ch1+ ":ACII değeri " +(int) ch1);
		System.out.println( ch2+ ":ACII değeri " +(int) ch2);
		System.out.println( ch3+ ":ACII değeri " +(int) ch3);
		
		int ascii1 =ch;
		int ascii2=(int) ch;
		System.out.println("ACII değeri" + ch+ "-->" +ascii1);
		System.out.println("ACII değeri" + ch+ "-->" +ascii2);
		

	}

}
