import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class Driver {

	public static void main(String[] args) {
   //Örneğimizde bir dosyadan sözlük değerlerini okuyup ap'in içerisine atıcaz ve kullanıcıdan aldığımız değerlere göre sözlüğün içerisindeki kelimeyi bulup ekrana yazdırıcıaz.   
// yazdığımız değerleri kullanıcıdan alarak hem mapin içerisinde hemde txt dosyasının içerisine yazdıkdık.
		
		File file = new File("sozluk.txt");
		
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		FileWriter fileWriter = null;
		
		try {
			fileReader = new FileReader(file); 
			bufferedReader = new BufferedReader(fileReader);
			fileWriter = new FileWriter(file ,true );  // buraya true dersek istediğimiz değerleri sona ekleyecektir.
		    String line =null;
		    
		    SortedMap<String,String> sortedMap = new TreeMap<>();
		    // Alfabetik sıralama yapar SortedMap
		    
		    
		    while((line = bufferedReader.readLine()) != null){
		    	//System.out.println(line);
		     String[] strings = line.split(":"); // ikili noktadan sonra ve önceki boşluklara dikkat et 
		    // System.out.println(strings[0]);   // key değeri olucak
		     //System.out.println(strings[1]);  // value değeri olucak 
		     sortedMap.put(strings[0], strings[1]);
		    }
		    
		    	Scanner scanner = new Scanner(System.in);
		    	String input = null;
		    	System.out.println("Kelime : ");
		    	while(!(input=scanner.nextLine()).equals("exit")) {
		    	String value = sortedMap.get(input);
		    	if(value!=null) {
		    		System.out.println(value);
		    	} else {
		    		System.out.println("Kelime bulunamadı !! Eklemek İstermisiniz ? (E) (H) ");
		    		if(scanner.nextLine().equals("E")) {
		    			System.out.println("Yeni Kelime :");
		    		    String yeniKelime = scanner.nextLine();
		    		    fileWriter.write("\n"); // bir alt satıra geçememizi sağlar
		    		    fileWriter.write(input);
		    		    fileWriter.write(":");
		    		    fileWriter.write(yeniKelime);
		    		    fileWriter.flush(); // direkt dosyaya etkki etmesini sağlar
		    		
		    		sortedMap.put(input,yeniKelime); // kullanıcının girdiği yeni kelimeyi çalşma zamanında sortedMap'in içine eklemesini sağladık.
		    		}
		    	}
		    	
		    	System.out.println("Kelime : ");
		    		
		    	}
		    
		    
		    
		   /*  System.out.println(sortedMap.size());
		    Set<Entry<String,String>>entrySet = sortedMap.entrySet();
		   Iterator<Entry<String,String>> iterator = entrySet.iterator();
		   while(iterator.hasNext()) {
			  Entry<String,String> next = iterator.next();
		      System.out.println(next.getKey() + " " + next.getValue());
		   }*/
		    
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(bufferedReader !=null) bufferedReader.close();
				if(fileReader!=null) fileReader.close(); // filereader null a eşit değilse kapansın
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}

}
