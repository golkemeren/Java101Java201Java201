import java.util.ArrayList;

public class FilmDriver {

	public static void main(String[] args) {
		ArrayList<Film> arrayList = new ArrayList<>();
		
		arrayList.add(new Film ("X Film" , "Ali Can " , FilmTipi.BELGESEL,2020));
		arrayList.add(new Film ("Y Film ", "Tuğrul Çalışkan" , FilmTipi.BILIM_KURGU , 2019));
	    arrayList.add( new Film("Z Fim" , "Ertuğ Yılmaz " , FilmTipi.KOMEDI,1998));
	   
	    for (int i = 0; i < arrayList.size(); i++) {
			
	    	Film film = arrayList.get(i);
	    	System.out.println(film);
		}
	    
	    System.out.println("--------------------------");
	    
	    System.out.println(arrayList.get(1)); // biirnci indexteki elamanı yazdırır.
	
	}
	
}
