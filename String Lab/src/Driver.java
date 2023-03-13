import java.util.Scanner;

public class Driver {
  public static void main (String[]args) {
	  /*String str1 = "Hello";
	  String str2 = "Hello";
	  System.out.println(str1.equals (str2));
	  // javadaki = operatörü farklı değişkenelerin bellek adreslerini karşılaştırmak için kullanılır.
	  //ancak stringleri karşılaştırırken = yerine equals metodu kullanılmalıdır.
 // equals iki nesneyi karşılaştırıken birbirinin aynısı olup olmadığını kontrol eder. 
  str2= "HELLO";
	  System.out.println(str1.equalsIgnoreCase(str2));
 //equalsIgnoreCase büyük harf ve küçük harf duyarlılığı  olmadan karşılaştırma yapar
	 
   Scanner scanner = new Scanner(System.in);
	  //System. in kullanıcıdan konsol kullanılarak değer alınacağı anlamına gelmektedir 
	  System.out.print("Lütfen Bir Yazı Giriniz: ");
  String line = scanner.nextLine();
  System.out.println(line.toLowerCase()); //stringin küçük harfli halini 
  System.out.println(line.toUpperCase()); // stringin büyük harfli hali
  System.out.println(line.charAt(3));  // stringin 3. karakterini ekrana yazdırır 
  System.out.println(line.length()); // stringin uzunluğunu verir.
  System.out.println( line.substring(3)); // istediğimiz indexten itibaren karakterleri ayırabiliriz.
  System.out.println(line.isEmpty()); // giridğimiz stringin boş olup olmadığını bize gösterir
  System.out.println(line.replace("ad", "wq"));
  System.out.println(line.indexOf("a")); // a değerinin hangi indexte olduğunu gösterir
  System.out.println(line.lastIndexOf("a"));// a değerinin hangi sırada olduğunu sondan sayarak bize gösterir 
  System.out.println(line.trim()); // bir stringinb aşındaki ve spnundaki boşlukları kaldırıp bize yeni bir string olarak geri dönderir 
  */
	  Scanner scanner =new Scanner (System.in);
	  String str1= scanner.nextLine();
	  String str2 = scanner.nextLine();
	  System.out.println(str1+""+str2);
		
	  
  }
}
