import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Driver {
public static void main(String[] args) {
	
	/*int[] numbers = new int[5];
	numbers[0]=5;
	numbers[1]=10;
	numbers[2]=20;
	numbers[3]=30;
	numbers[4]=40;
	System.out.println(numbers.length); // arrayin eleman sayısını getirir
	System.out.println(Arrays.toString(numbers)); // arrayin içeriğini satır şeklinde ekrana basar
	 System.out.println("----------------");
	 for (int i=0; i<5; i++) { // arrayin içeriğini sütün şeklinde ekrana basar
		 System.out.println(numbers[i]);
	 }
	 
	*/
	/*Scanner scanner =new Scanner(System.in);    
	System.out.print("Dizi uzunluğu giriniz");
	int length = scanner.nextInt();
	int[] numbers =new int[length];
	for (int i = 0; i< numbers.length; i++){
		
		System.out.print((i+1) +".Sayı:");
		numbers[i] = scanner.nextInt();
		
	}
	System.out.println(Arrays.toString(numbers));
	int total =0; // Girdiğimiz sayıların ortalamasını bulan bir dizi kodu yazdık
	for (int i=0; i < numbers.length; i++) {
		total = total+numbers[i];
		
	}
	System.out.println(total/numbers.length);
	*/
	/*int total =0;
	int[] numbers = {1,5,-5,9,2,8,9};
	
	int[] numbers2 =new int [numbers.length];
	for (int i = 0; i < numbers2.length; i++) {
		numbers2[i]=numbers[i]; // numbers değerlerini numbers2 değerlerine atadık 
			}
	System.out.println(Arrays.toString(numbers));
	System.out.println(Arrays.toString(numbers2));
	
	
	
/*	for (int i = 0; i < numbers.length; i++) {
		total=total+numbers[i];
		
	}
	System.out.println(total); */// array içindeki elemanların toplamını verir 

/*String[] names =new String[3];
names[0]="Ali";
names[1]="Ahmet";
names[2]="Mehmet";
System.out.println(Arrays.toString(names));
for (int i = names.length-1; i >=0; i--) {
	System.out.println(names[i]);
	
}*/
	/*
	int[] numbers1 = {1,2,3};
	System.out.println(Arrays.toString(numbers1));
    int[]numbers2 = numbers1;
    System.out.println(Arrays.toString(numbers2));
    numbers1[0]=5;
    System.out.println(Arrays.toString(numbers2));

    */
	
	int[] numbers = {20,32,12,46,4};
	System.out.println(Arrays.toString(numbers));
	System.out.println(Arrays.binarySearch(numbers,12)); // binarySearch metodu bulmak istediğimiz metodun hangi indexte olduğunu bize gösterir.
// olmayan bir metodu aratmak istersek  bize sonuç -1 olarak geri dönecektir.
	
	int[] copyOf =Arrays.copyOf(numbers, 3);
	System.out.println(Arrays.toString(copyOf));  // copyOf metodu bize sayısını verdiğimiz kadar elemanın kopyalanmasını sağlar.
	// eğer eleman sayısından fazla elamanı kopyalamak istersek bize boşlukları 0 olarak doldurarak verecektir .
	int [] copyOfRange = Arrays.copyOfRange(numbers,2, 4);
	System.out.println(Arrays.toString(copyOfRange)); // 2 ve 4. indeksteki elemanları kopyalar 
	// 2. elemena inclusive yani dahil 4. elaman dahil değildir yani exclusive şeklinde tanımlanır yani 2.ve3. elemanlar  yazdırılır.
	
	//Arrays.fill(numbers,44);
	//System.out.println(Arrays.toString(numbers)); // bütün elemanları 44 olarak değiştirir.
	Arrays.sort(numbers); // Arrayin içindeki değerleri sıralamak için kullanırız.
	System.out.println(Arrays.toString(numbers));
}
}
