import java.util.Arrays;
import java.util.Iterator;

public class Driver {
	public static void main(String[] args) {
	/*nt [][] numbers = new int [2][3];
		 // İki satır ve 3 sütundan oluşur 
		numbers[0][0]=1;
		numbers[0][1]=2;
		numbers[0][2]=3;
		
		numbers[1][0]=4;
		numbers[1][1]=5;
		numbers[1][2]=6;
		System.out.println(Arrays.toString(numbers));
		// Dizinin içindeki elemanları teker teker yazdırmak için for yapını kullanıcaz
	
	for (int i =0; i<2; i++) {
		
		
		for (int j=0; j<3;j++) {
			System.out.println(numbers[i][j]);
	}
			
			
	}*/
		
		String [][] ogrenciler = new String[3][3];
		ogrenciler [0][0] = "ALİ";
		ogrenciler [0][1] = "VELİ";
		ogrenciler [0][2]=  "Can";
		
		ogrenciler [1][0] = "HASAN";
		ogrenciler [1][1] = "Yusuf";
		ogrenciler [1][2] = "Mert";

		ogrenciler [2][0] = "AHmet";
		ogrenciler [2][1] = "Zeynep";
		ogrenciler [2][2] = "Gül";

for (int i = 0; i < ogrenciler.length; i++) {
	for (int j = 0; j < ogrenciler[i].length;j++){
		
		System.out.print(i+" "+j+":");  //indeks numaralarına göre bize satır ve sütün değerlerini gösterir.
		System.out.println(ogrenciler[i][j]);
	}
}

		
	}

}
