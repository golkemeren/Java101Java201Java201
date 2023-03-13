import java.io.Serializable;

public class Film implements Serializable {  // Bu tipi pojo sınıflarımızı yani veri taşımak için kullandığımız sınıfları 
	//Serializable sınıfından implement ettirirsek bu sınıfı başka biyerde kullanarak istediğimiz zaman diske yazabiliriz.
	
	
	public Film () {
		
	}
	
	public Film(String ad , String yonetmen , FilmTipi tip, int yayinlanmaYili  ) {
		
		this.ad=ad;
		this.yonetmen=yonetmen;
		this.tip=tip;
		this.yayinlanmaYili=yayinlanmaYili;
	}
	
	
	
	private String ad ;
	private String yonetmen ;
	private FilmTipi tip ;
	private int yayinlanmaYili;
	
	public String getAd() {
		return ad ;
	}
	public void setAd(String ad ) {
		this.ad=ad;
	}
	
	public String getYonetmen () {
		return yonetmen;
	}
	
	public void setYonetmen(String yönetmen) {
		this.yonetmen=yonetmen;
	}
	
	public FilmTipi getFilmTipi() {
		return tip;
	}
	
	public void setFilmTipi (FilmTipi tip) {
		this.tip=tip;
	}
	
	public int getYayinlanmaYili () {
		return yayinlanmaYili;
	}
	public void setYayinlanmaTarihi(int yayinlanmaYili) {
		this.yayinlanmaYili=yayinlanmaYili;
	}
	
	@Override 
	public int hashCode() {
		return this.yayinlanmaYili + this.ad.hashCode();  //hashcodelarını toplayıp geriye döndürelim.
		}
	
	
	@Override 
	public boolean equals (Object o ) {
		Film film = (Film)o ;
		return film.ad.equals(this.ad) && film.yayinlanmaYili == this.yayinlanmaYili;  // eğer iki filmin yayinlanma yili aynıysa o iki film aynı olsun dedik.
	}
	
	
	@Override
	
	public String toString() {
		return "Ad : " + ad  + ",Yonetmen : " + yonetmen + ",Film Tipi : " + tip  + ",Yayınlanma Yılı : " + yayinlanmaYili;
 	}

}
