import java.util.ArrayList;
import java.util.Iterator;

public class Driver {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(10);
		
		int x = 20;
	 arrayList.add(x);
	 
	 int y = arrayList.get(1); // Integer değeri int y  değerine otomatik dönüştü
	  arrayList.add(new Integer(5));
	 
	 
	 Iterator<Integer> iterator=arrayList.iterator();
	 while(iterator.hasNext()) {
		 int i = iterator.next();
		 System.out.println(i);
	 }
	 System.out.println(Integer.MIN_VALUE);  // integerin min ve max değerleri geldi
	 System.out.println(Integer.MAX_VALUE);

	 byte b = 10;
	 
	 byte parseByte = Byte.parseByte("12");  //  string olarak verdiğimiz değeri değişkenimizde saklıyor
	 System.out.println(parseByte);
	 
	 Byte a = Byte.parseByte("2");
	 
	}

}
