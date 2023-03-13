
public class Driver {
public static void main(String[] args) {
	İsci isci = new İsci ();
	try {
		isci .setIsim("           ");
	} catch (HataliDeger e1) {
		
		System.out.println(e1.getMessage());
	}
	 try {isci .setMaas(2200);
	 }
	 catch (HataliDeger e ){  // maas değeri eksi oalmayacağı için program crash olmadan çaılşamaya devam ettit bizim try catch mekanizmamızla
		 System.out.println(e.getMessage());
	 }
	 System.out.println(isci);
}
}
