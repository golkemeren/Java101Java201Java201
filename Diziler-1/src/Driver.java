import java.util.Arrays;

public class Driver {
public static void main(String[] args) {
	/*int [] numbers;
	numbers = new int[16];  // new anahtar kelimesi ile dizinin kaç elamanlı olacağı belirtilir.
	System.out.println(Arrays.toString(numbers));
	System.out.println(numbers[5]); // ulaşmak istediğimiz endeksin numarasını veriyoruz .

numbers[5] = 32; // seçtiğimiz indexteki elemanın değerini değiştirme 
System.out.println(numbers[5]);
*/
int[] numbers = {1,2,3,4,5,6,7,8,9};
System.out.println(numbers[5]);
System.out.println(numbers.length); // dizinin içindeki eleman sayısını gösterir.
// 5. indexdeki elemanı ekrana getirir.
String[] names =new String[10];
System.out.println(Arrays.toString(names)); // Dizinin içindeki elemanları string olarak ekrana bastırmaya yarar 

names [2] = "Ali";

System.out.println(Arrays.toString(names)); // ikinci indexi değiştirmeye yarar .

names[4] ="Hasan";
System.out.println(Arrays.toString(names));
names[14] = "Veli";
// Java uygulamaları yazılırken geliştiricilerin zamanı ikiye ayırması lazım  bunlar derleme zamanı hataları ve çalıştıurma zamanıdı hataları.
// Array ile ilgili hatalar çalışma zamanı hatalarıdır.

}


}
